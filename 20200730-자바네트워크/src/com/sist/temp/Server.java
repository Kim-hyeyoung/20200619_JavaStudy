package com.sist.temp;
/*
 * 서버=>IP 고정 (전화번호)
 * 	클라이언트에서 연결 => 연결 번호(PORT)(전화선)
 * 	PORT => 0~65535 / 사용중인 PORT (0~1023)
 * 	지정되어 있는 포트
 *  ex) HTTP : 80
 *  	SMTP : 25
 *  	FTP : 21
 *  	TELNET : 23
 *  	Spring : 8080
 *  	React : 3000
 *  	Oracle : 1521 / MS-SQL : 1433
 *  	머드 : 4000
 *   	음성 : 20000
 *   	화상 : 30000
 *   
 *   서버 제작
 *   	1) bind : 휴대폰 개통
 *   	   ====
 *   		IP + PORT
 *   	2) 대기상태 (listen)
 *   	3) 접속대기 => 접속 => accept() : 발신자 전화번호(ip)가 생성
 *   	4) 저장 => 동기화
 *   			 ====
 *   			ArrayList : 비동기화, 순서x ...>DB
 *   			Vector : 동기화
 *   	5) 데이터 전송 : write()
 *   	6) 사용자로부터 요청 : readLine()
 *   
 *   서버에서 하는 역할
 *   1) 사용자 요청 받기
 *   2) 요청처리 => 찾기
 *   3) 결과값을 사용자에게 전송
 *   
 *   서버
 *   1) 1:1 (peer to peer)
 *   2) 1:多 ** : 데이터는 동일, 사용자에 따라 요청을 다르게 할 수 있게 만든다 => 사용자의 요청을 받아서 처리하는 프로그램이 여러 개 존재 (=통신을 별도 수행) => 쓰레드
 *   =====================
 *   쓰레드
 *   	= 자원을 보다 효율적으로 사용
 *   	= 사용자에 대한 응답성이 향상
 *   	= 작업이 분리된다 (소스 간결화)
 *   	= CPU를 효율적으로 사용 => 속도가 빨라진다
 *   	= 실행중인 프로그램 = 프로세스 (쓰레드가 1개 이상 존재)
 *   
 *   쓰레드 구현 방법
 *   1) 인터페이스
 *   		= Runnable ===> run()
 *   			class A implements Runnable => 윈도우
 *   2) 쓰레드 클래스 상속
 *   			class A extends Thread => 일반 쓰레드
 *   
 *   쓰레드 실행과정
 *   1) 생성 : new Thread()
 *   2) 대기(쓰레드에서 사용하는 데이터 수집) : start()
 *   3) 쓰레드 동작 : run() 
 *   
 *   => 쓰레드의 동작 정의 run() 구현
 *   => 쓰레드는 반드시 한 개의 동작만 수행
 *   	run()
 *   	=> 종료 : interrupt()
 *   	=> 일시정지 : sleep(), wait(), join()
 */
class MyThread extends Thread
{
	//동작
	public void run()
	{
		try
		{
			for(int i=0;i<=10;i++)
			{
				System.out.println(getName()+":"+i);
				Thread.sleep(50);// 1000분의 1초 단위
			}
		}catch(Exception ex) {}
	}
}
public class Server {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyThread t1=new MyThread();
		MyThread t2=new MyThread();
		MyThread t3=new MyThread();
		
		/*
		 * 생성 => JVM 
		 * 1. 순위 결정 => 1~10 (10번이 가장 빠름-> 1로 갈수록 느려짐) => 사용자 정의 쓰레드(속도5)
		 * 	1:MIN_PRIORITY, 10:MAX_PRIORITY, 5:NORM_PRIORITY
		 * 	각 쓰레드마다 이름 부여 Thread-0, Thread-1...
		 * 	자바 프로그램은 MAX_PRIORITY(main), MIN_PRIORITY(gc)
		 * 
		 * 
		 */
		//이름 부여
		t1.setName("서울");
		t2.setName("부산");
		t3.setName("강원");
		
		//순위 부여
		t1.setPriority(10); //작업속도가 가장 빠름 => 가장 빨리 작업이 끝남
		t2.setPriority(1);
		t3.setPriority(1);
		
		//run을 호출 : start() => 자동으로 run() 호출된다
		t1.start();
		t2.start();
		t3.start();
		
		
		
		

	}

}
