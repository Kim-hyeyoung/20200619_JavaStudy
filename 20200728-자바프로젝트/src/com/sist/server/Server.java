package com.sist.server;
import java.util.*;

import com.sist.common.Function;

import java.net.*;
import java.io.*;

public class Server implements Runnable
{
	//�������� ����� Socket
	ServerSocket ss;
	final int PORT=7979;//1024-65535
	//Ŭ���̾�Ʈ ���� ����
	Vector<Client> waitVc=new Vector<Client>();//ArrayList,LinkedList
	//���� ����
	public Server()
	{
		try
		{
			ss=new ServerSocket(PORT);
			//bind():��������  listen():���ӽñ��� ���
			System.out.println("Server Start!!");
		}catch(Exception ex) {}
	}
	//Ŭ���̾�Ʈ�� ���ӽø��� ó���ϴ� ���
	public void run()
	{
		
		try
		{
			while(true)
			{
				Socket s=ss.accept(); //�����ϸ� �����带 �����ؼ� Ŭ���̾�Ʈ���� ����� �ٸ��� �� �� �ֵ��� �Ѵ�
				//������� ����=>���ϸ� �����ϸ� �ѻ���ϰ� ��� ����
				Client client=new Client(s);
				client.start();// ��� ����!
			}
		}catch(Exception ex) {}
		
	}

	//����� �����ϰ� �����
	class Client extends Thread
	{
		//Ŭ���̾�Ʈ�� ���� ����
		Socket s;
		//�۽�,����
		OutputStream out;
		BufferedReader in;
		//Ŭ���̾�Ʈ�� �⺻ ����
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
		//���
		public void run()
		{
			try
			{
				while(true)
				{
					String msg=in.readLine();
					System.out.println("client=>"+msg);
					//Ŭ���̾�Ʈ�� ��û�� ������
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
							//�߰�
							waitVc.add(this);
							//ȭ�� ����
							//�α���â=>����â
							messageTo(Function.MYLOG+"|"+id);
							//�̹� ������ ������� ���� �ޱ�
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
							//����
							for(Client user:waitVc)
							{
								if(user.id.equals(id))
								{
									messageTo(Function.MYEXIT+"|");
									waitVc.remove(user);
									//��� �ߴ�
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
		//��ü������ �޼��� ����
		public void messageAll(String msg)
		{
			
			for(Client user:waitVc)
			{
				try
				{
					user.messageTo(msg);
				}catch(Exception ex) 
				{
					waitVc.remove(user);//������ x��ư���� ����� ���� ���� ����
				}
			}
			
		}
		//���������� �޼��� ����
		public void messageTo(String msg)
		{
			try
			{
				out.write((msg+"\n").getBytes());
				//���ڵ�=>���ڵ� ==>UTF-8(2byte��)
			}catch(Exception ex) {}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Server server=new Server();//���� ����
		new Thread(server).start();//���ӽñ��� ���
	}

}
