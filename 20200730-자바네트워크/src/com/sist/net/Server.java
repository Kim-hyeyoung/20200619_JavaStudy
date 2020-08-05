package com.sist.net;
import java.io.*;
import java.net.*;
import java.util.*;
/*
 * ���� ����
 * 	ServerSocket (Socket=��ȭ��)
 * ���ӽÿ� ó��
 * 	accept()
 * ���
 * 	write()
 * 	read()
 */
public class Server implements Runnable{
	//���ӹ޴� Socket => ��ȯ ����
	ServerSocket ss=null;
	//���� ����
	//�� ���� ��ǻ�Ϳ����� ������ ���� ���� �Ұ�
	//������ ���� ���� =>vector
	Vector<Client> waitvC=new Vector<Client>(); //������ip����
	public Server()
	{
		try
		{
			ss=new ServerSocket(7777); //bind(ip,port) => listen()
			//��������
			System.out.println("Server Start");
		}catch(Exception ex) {}
	}
	//���� ó��
	public void run()
	{
		try
		{
			while(true)
			{
				Socket s=ss.accept();//���� ���� ��� => �������� ip,port Ȯ��
											   	   		//=======>Socket(�߽��� ����)
				//System.out.println("������ IP:"+s.getInetAddress().getHostAddress());
				//System.out.println("�������� PORT(���ἱ):"+s.getPort());
				Client c=new Client(s);//�����ڿ� �����带 ����
				waitvC.add(c);//Ŭ���̾�Ʈ ����
				c.start();//�����ڿ� ����� �����ϵ���!
			}
		}catch(Exception ex) {}
	}
	//�����ڸ��� ���� ����� ����
	class Client extends Thread
	{
		Socket s; //������ Ŭ���̾�Ʈ ����
		OutputStream out; //Ŭ���̾�Ʈ�� ����� ����
		BufferedReader in; //Ŭ���̾�Ʈ ��û�� �� �޴� Ŭ����
		public Client(Socket s)
		{
			try
			{
				this.s=s;
				out=s.getOutputStream();
				in=new BufferedReader(new InputStreamReader(s.getInputStream()));//s.getInputStream()=>client��
			}catch(Exception ex) {}
			
		}
		//��Ž���
		public void run()
		{
			try
			{
				while(true)
				{
					String msg=in.readLine();//ä�� ���ڿ� �ޱ�
					for(Client user:waitvC)
					{
						user.out.write((msg+"\n").getBytes());
						//��Ʈ��ũ ���� �� : 1byte / ���� �� : 2byte�� ��ȯ(�ѱ�)
					}
				}
			}catch(Exception ex) {}
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Server server=new Server();//��������
		new Thread(server).start();//����ó�� => ���� ���

	}

}
