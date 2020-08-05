package com.sist.net;
import java.io.*;
import java.net.*;
import java.util.*;
/*
 * 서버 가동
 * 	ServerSocket (Socket=전화기)
 * 접속시에 처리
 * 	accept()
 * 통신
 * 	write()
 * 	read()
 */
public class Server implements Runnable{
	//접속받는 Socket => 교환 소켓
	ServerSocket ss=null;
	//서버 가동
	//한 개의 컴퓨터에서는 여러개 동시 수행 불가
	//접속자 정보 저장 =>vector
	Vector<Client> waitvC=new Vector<Client>(); //접속자ip저장
	public Server()
	{
		try
		{
			ss=new ServerSocket(7777); //bind(ip,port) => listen()
			//서버가동
			System.out.println("Server Start");
		}catch(Exception ex) {}
	}
	//접속 처리
	public void run()
	{
		try
		{
			while(true)
			{
				Socket s=ss.accept();//접속 했을 경우 => 접속자의 ip,port 확인
											   	   		//=======>Socket(발신자 정보)
				//System.out.println("접속자 IP:"+s.getInetAddress().getHostAddress());
				//System.out.println("접속자의 PORT(연결선):"+s.getPort());
				Client c=new Client(s);//접속자와 쓰레드를 연결
				waitvC.add(c);//클라이언트 저장
				c.start();//접속자와 통신을 시작하도록!
			}
		}catch(Exception ex) {}
	}
	//접속자마다 따로 통신이 가능
	class Client extends Thread
	{
		Socket s; //접속한 클라이언트 연결
		OutputStream out; //클라이언트에 결과값 전송
		BufferedReader in; //클라이언트 요청시 값 받는 클래스
		public Client(Socket s)
		{
			try
			{
				this.s=s;
				out=s.getOutputStream();
				in=new BufferedReader(new InputStreamReader(s.getInputStream()));//s.getInputStream()=>client꺼
			}catch(Exception ex) {}
			
		}
		//통신시작
		public void run()
		{
			try
			{
				while(true)
				{
					String msg=in.readLine();//채팅 문자열 받기
					for(Client user:waitvC)
					{
						user.out.write((msg+"\n").getBytes());
						//네트워크 보낼 때 : 1byte / 받을 때 : 2byte로 변환(한글)
					}
				}
			}catch(Exception ex) {}
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Server server=new Server();//서버가동
		new Thread(server).start();//접속처리 => 접속 대기

	}

}
