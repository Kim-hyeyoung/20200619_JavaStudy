package com.sist.temp;
/*
 * ����=>IP ���� (��ȭ��ȣ)
 * 	Ŭ���̾�Ʈ���� ���� => ���� ��ȣ(PORT)(��ȭ��)
 * 	PORT => 0~65535 / ������� PORT (0~1023)
 * 	�����Ǿ� �ִ� ��Ʈ
 *  ex) HTTP : 80
 *  	SMTP : 25
 *  	FTP : 21
 *  	TELNET : 23
 *  	Spring : 8080
 *  	React : 3000
 *  	Oracle : 1521 / MS-SQL : 1433
 *  	�ӵ� : 4000
 *   	���� : 20000
 *   	ȭ�� : 30000
 *   
 *   ���� ����
 *   	1) bind : �޴��� ����
 *   	   ====
 *   		IP + PORT
 *   	2) ������ (listen)
 *   	3) ���Ӵ�� => ���� => accept() : �߽��� ��ȭ��ȣ(ip)�� ����
 *   	4) ���� => ����ȭ
 *   			 ====
 *   			ArrayList : �񵿱�ȭ, ����x ...>DB
 *   			Vector : ����ȭ
 *   	5) ������ ���� : write()
 *   	6) ����ڷκ��� ��û : readLine()
 *   
 *   �������� �ϴ� ����
 *   1) ����� ��û �ޱ�
 *   2) ��ûó�� => ã��
 *   3) ������� ����ڿ��� ����
 *   
 *   ����
 *   1) 1:1 (peer to peer)
 *   2) 1:�� ** : �����ʹ� ����, ����ڿ� ���� ��û�� �ٸ��� �� �� �ְ� ����� => ������� ��û�� �޾Ƽ� ó���ϴ� ���α׷��� ���� �� ���� (=����� ���� ����) => ������
 *   =====================
 *   ������
 *   	= �ڿ��� ���� ȿ�������� ���
 *   	= ����ڿ� ���� ���伺�� ���
 *   	= �۾��� �и��ȴ� (�ҽ� ����ȭ)
 *   	= CPU�� ȿ�������� ��� => �ӵ��� ��������
 *   	= �������� ���α׷� = ���μ��� (�����尡 1�� �̻� ����)
 *   
 *   ������ ���� ���
 *   1) �������̽�
 *   		= Runnable ===> run()
 *   			class A implements Runnable => ������
 *   2) ������ Ŭ���� ���
 *   			class A extends Thread => �Ϲ� ������
 *   
 *   ������ �������
 *   1) ���� : new Thread()
 *   2) ���(�����忡�� ����ϴ� ������ ����) : start()
 *   3) ������ ���� : run() 
 *   
 *   => �������� ���� ���� run() ����
 *   => ������� �ݵ�� �� ���� ���۸� ����
 *   	run()
 *   	=> ���� : interrupt()
 *   	=> �Ͻ����� : sleep(), wait(), join()
 */
class MyThread extends Thread
{
	//����
	public void run()
	{
		try
		{
			for(int i=0;i<=10;i++)
			{
				System.out.println(getName()+":"+i);
				Thread.sleep(50);// 1000���� 1�� ����
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
		 * ���� => JVM 
		 * 1. ���� ���� => 1~10 (10���� ���� ����-> 1�� ������ ������) => ����� ���� ������(�ӵ�5)
		 * 	1:MIN_PRIORITY, 10:MAX_PRIORITY, 5:NORM_PRIORITY
		 * 	�� �����帶�� �̸� �ο� Thread-0, Thread-1...
		 * 	�ڹ� ���α׷��� MAX_PRIORITY(main), MIN_PRIORITY(gc)
		 * 
		 * 
		 */
		//�̸� �ο�
		t1.setName("����");
		t2.setName("�λ�");
		t3.setName("����");
		
		//���� �ο�
		t1.setPriority(10); //�۾��ӵ��� ���� ���� => ���� ���� �۾��� ����
		t2.setPriority(1);
		t3.setPriority(1);
		
		//run�� ȣ�� : start() => �ڵ����� run() ȣ��ȴ�
		t1.start();
		t2.start();
		t3.start();
		
		
		
		

	}

}
