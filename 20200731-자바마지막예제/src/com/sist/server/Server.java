package com.sist.server;
//network => net => 라이브러리
import java.util.*;

import com.sist.common.Function;

import java.io.*;//입출력(서버와 클라이언트의 데이터 주고 받기)
import java.net.*;//다른 컴퓨터와 연결
/*
 * 일반 서버(Application) => Socket(연결기계=>소프트웨어로 제작)
 * 웹 서버 => URL
 * =================================================연결지향적 프로그램 TCP(신뢰성↑,데이터 손실↓,UDP보다 속도는 느림 =>데이터 전송 후 받았는지 확인하기 때문)
 */
//Server => 접속만 담당 => 저장
//Client => 실제 통신 담당 => 클라이언트마다 따로 통신 => 쓰레드 이용
public class Server implements Runnable{
	private ServerSocket ss;//접속을 받는 클래스 => 정보 저장
	private final int PORT=8686;
	//클라이언트 접속시에 저장(IP,PORT)
	private Vector<Client> waitVc=new Vector<Client>();
	//쓰레드에서 동기화 프로그램
	
	//서버 가동
	public Server()
	{
		try
		{
			ss=new ServerSocket(PORT);
			/*
			 * 	bind() : IP,PORT를 묶어주는 역할 (ex)휴대폰 개통)
			 * 	listen() : 대기상태(클라이언트가 접속하기 전까지 대기)
			 */
			System.out.println("Server Start!");
		}catch(Exception ex) {}
	}
	
	//클라이언트가 접속을 했을 경우 각자 통신이 가능하게 쓰레드와 연결
	@Override
	public void run() {
		// TODO Auto-generated method stub
		try
		{
			while(true)
			{
				Socket s=ss.accept();
				//accept() : 특수한 메소드 => 클라이언트 접속시에만 호출됨
				Client client=new Client(s);
				client.start();//클라이언트와 통신 승인
			}
		}catch(Exception ex) {}
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//서버가동
		Server server=new Server();
		new Thread(server).start();
		//server클래스에 있는 run()을 호출

	}
	// 내부 클래스 => Server가 가지고 있는 데이터를 쉽게 공유
	class Client extends Thread
	{
		//클라이언트와 연결
		Socket s;
		//클라이언트로부터 요청을 받는다
		BufferedReader in;
		//요청을 처리하고 결과 응답
		OutputStream out;
		//변수 설정
		String id,name,sex,pos;
		public Client(Socket s)
		{
			try
			{
				this.s=s;
				in=new BufferedReader(new InputStreamReader(s.getInputStream()));
				//클라이언트가 요청한 메소드를 읽어오는 메모리 공간
				out=s.getOutputStream();
			}catch(Exception ex) {}
		}
		//통신 => 기능(요청처리)
		public void run()
		{
			try
			{
				while(true)
				{
					//클라이언트가 요청한 내용 받기
					String msg=in.readLine();
					//System.out.println("client=>"+msg);
					StringTokenizer st=new StringTokenizer(msg,"|");
					int protocol=Integer.parseInt(st.nextToken());
					//100|id|대화명|성별
					switch(protocol)
					{
						case Function.LOGIN:
						{
							//로그인 처리
							//데이터값 받기
							id=st.nextToken();
							name=st.nextToken();
							sex=st.nextToken();
							pos="대기실";//사용자의 기본 정보
							
							//이미 로그인된 사람들에게 새로 로그인하는 사람의 정보를 보내주고 서버에 로그인한 사람의 정보를 입력한 후 서버 정보를 로그인한 사람에게 준다=> 모든 사람에게 같은 로그인 정보를 주기 위함
							//접속한 모든 사용자에게 로그인한 정보를 보내준다
							messageAll(Function.LOGIN+"|"+id+"|"+name+"|"+sex+"|"+pos);
							//접속한 사람의 정보를 저장
							waitVc.add(this);
							//this : Client client=new Client();
							messageTo(Function.MYLOG+"|"+id);
							//로그인창에서 채기실창으로 변경
							for(Client user:waitVc)
							{
								messageTo(Function.LOGIN+"|"+user.id+"|"+user.name+"|"+user.sex+"|"+user.pos);
							}
							//입장메세지 출력
							messageAll(Function.WAITCHAT+"|[☞"+name+"님이 입장하셨습니다]");
							//개설된 방정보 전송
							
						}
						break;
						case Function.WAITCHAT:
						{
							messageAll(Function.WAITCHAT+"|["+name+"]"+st.nextToken());
						}
						break;
					}
				}
			}catch(Exception ex) {}
		}
		//응답처리
		//개인적으로 전송
		public synchronized void messageTo(String msg)
		{
			/*
			 * synchronized
			 * 	쓰레드는 디폴트값이 비동기화
			 * 	synchronized는 동기화
			 */
			try
			{
				out.write((msg+"\n").getBytes());//인코딩
				
			}catch(Exception ex){}
		}
		//전체적으로 응답
		public synchronized void messageAll(String msg)
		{
			try
			{
				for(Client user:waitVc)
				{
					user.messageTo(msg);
				}
			}catch(Exception ex) {}
		}
	}
	
	
	
}
