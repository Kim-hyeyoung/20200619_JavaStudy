package com.sist.server;
import java.util.*;

import com.sist.common.Function;

import java.net.*;
import java.io.*;

public class Server implements Runnable
{
	//서버에서 실행된 Socket
	ServerSocket ss;
	final int PORT=7979;//1024-65535
	//클라이언트 정보 저장
	Vector<Client> waitVc=new Vector<Client>();//ArrayList,LinkedList
	//서버 가동
	public Server()
	{
		try
		{
			ss=new ServerSocket(PORT);
			//bind():서버개통  listen():접속시까지 대기
			System.out.println("Server Start!!");
		}catch(Exception ex) {}
	}
	//클라이언트가 접속시마다 처리하는 기능
	public void run()
	{
		
		try
		{
			while(true)
			{
				Socket s=ss.accept(); //접속하면 쓰레드를 생성해서 클라이언트마다 통신을 다르게 할 수 있도록 한다
				//쓰레드와 연결=>쏘켓만 연결하면 한사람하고만 통신 가능
				Client client=new Client(s);
				client.start();// 통신 시작!
			}
		}catch(Exception ex) {}
		
	}

	//통신이 가능하게 만든다
	class Client extends Thread
	{
		//클라이언트의 정보 수집
		Socket s;
		//송신,수신
		OutputStream out;
		BufferedReader in;
		//클라이언트의 기본 정보
		String id,name,sex;
		public Client(Socket s)
		{
			try {
				this.s=s;
				out=s.getOutputStream();
				in=new BufferedReader(new InputStreamReader(s.getInputStream()));
				/*
				 * out=s.getOutputStream() => HttpServletResponse
				 * in=new BufferedReader() => HttpServletRequest
				 */
			}catch(Exception ex) {}
		}
		//통신
		public void run()
		{
			try
			{
				while(true)
				{
					String msg=in.readLine();
					System.out.println("client=>"+msg);
					//클라이언트가 요청한 데이터
					StringTokenizer st=new StringTokenizer(msg,"|");
					int protocol=Integer.parseInt(st.nextToken());
					switch(protocol)
					{
						case Function.LOGIN:
						{
							id=st.nextToken();
							name=st.nextToken();
							sex=st.nextToken();
							
							messageAll(Function.LOGIN+"|"+id+"|"+name+"|"+sex);
							//추가
							waitVc.add(this);
							//화면 변경
							//로그인창=>대기실창
							messageTo(Function.MYLOG+"|"+id);
							//이미 접속한 사람들의 정보 받기
							for(Client user:waitVc)
							{
								messageTo(Function.LOGIN+"|"+user.id+"|"+user.name+"|"+user.sex);
							}
						}
						break;
						case Function.CHAT:
						{
							messageAll(Function.CHAT+"|["+name+"]"+st.nextToken());
						}
						break;
						case Function.EXIT:
						{
							String mid=id;
							messageAll(Function.EXIT+"|"+mid);
							//제거
							for(Client user:waitVc)
							{
								if(user.id.equals(id))
								{
									messageTo(Function.MYEXIT+"|");
									waitVc.remove(user);
									//통신 중단
									in.close();
									out.close();
									break;
								}
							}
						}
						break;
					}
				}
			}catch(Exception ex) {}
		}
		//전체적으로 메세지 전송
		public void messageAll(String msg)
		{
			
			for(Client user:waitVc)
			{
				try
				{
					user.messageTo(msg);
				}catch(Exception ex) 
				{
					waitVc.remove(user);//유저가 x버튼으로 종료시 유저 정보 제거
				}
			}
			
		}
		//개인적으로 메세지 전송
		public void messageTo(String msg)
		{
			try
			{
				out.write((msg+"\n").getBytes());
				//인코딩=>디코딩 ==>UTF-8(2byte로)
			}catch(Exception ex) {}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Server server=new Server();//서버 가동
		new Thread(server).start();//접속시까지 대기
	}

}
