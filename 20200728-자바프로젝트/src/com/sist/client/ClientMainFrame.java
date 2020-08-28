package com.sist.client;
//������ => JFrame
//������ ���õ� Ŭ������ �о�´�

import javax.swing.*;//������ ����

import com.sist.common.Function;

import java.awt.*; //color, layout(��ġ)
import java.awt.event.*;//interface(��ư����)
/*
 * ����
 * 	=��� (is-a) : ������ Ŭ������ �����ؼ� ���
 * 	=���� (has-a) : ������ Ŭ������ ������� ���
 */
import java.io.*;
import java.net.*;
import java.util.*;
public class ClientMainFrame extends JFrame implements ActionListener,MouseListener,Runnable{
	//������ ũ�� ���� => �����ڿ��� ���
	JLabel title=new JLabel("��ȭ ���� & ��õ ���α׷�",JLabel.CENTER);
	MenuForm mf=new MenuForm();
	ChatForm cf=new ChatForm();
	DetailForm df=new DetailForm();
	Login login=new Login();
	ControllPanel cp;
	int curpage=1;
	int totalpage=16;
	//��Ʈ��ũ ���� ���α׷�
	Socket s;
	OutputStream out;
	BufferedReader in;
	public ClientMainFrame()
	{
		cp=new ControllPanel(this); //this=>���ο� â�� �ƴ� ���� �������� ������â�� ����
		/*
		 * Ŭ�������� ������ ��� => ������ �ƴ϶� ������ ��
		 * ex) �����ͺ��̽� : ����Ŭ ����
		 * 	       ��Ʈ��ũ : ����
		 * 	       �� : ��Ű���� ���б�
		 */
		//����Ʈ ���� ��ġ
		title.setFont(new Font("����ü",Font.BOLD,55));
		//title.setOpaque(true);
		//title.setBackground(Color.green);
		setLayout(null); //���� ���� ��ġ�ϱ� ����
		title.setBounds(10, 15, 1570, 100);
		//�����쿡 �߰�
		add(title);
		
		//�޴���ġ
		mf.setBounds(10, 120, 100, 300);
		add(mf);
		
		//ä����
		cf.setBounds(115, 760, 1465, 200);
		add(cf);
		
		//����Ʈ���ȭ��
		cp.setBounds(115, 120, 1465, 635);
		add(cp);
		
		//������ ȭ�� ��ü ����
		setSize(1600, 1000);
		//setVisible(true);
		setDefaultCloseOperation(DO_NOTHING_ON_CLOSE); //X��ư Ŭ���� ����(�޸� �Ҵ�x)
		
		mf.b1.addActionListener(this);
		mf.b2.addActionListener(this);
		mf.b5.addActionListener(this);
		
		cp.ff.b1.addActionListener(this);//������ư
		cp.ff.b2.addActionListener(this);//������ư
		
		cp.df.b2.addActionListener(this);//���
		
		cp.lf.b1.addActionListener(this);
		cp.lf.b2.addActionListener(this);
		cp.lf.b3.addActionListener(this);
		cp.lf.b4.addActionListener(this);
		cp.lf.b5.addActionListener(this);
		cp.lf.b6.addActionListener(this);
		cp.lf.tf.addActionListener(this);
		
		//�α��� ó��
		login.b1.addActionListener(this);
		login.b2.addActionListener(this);
		
		//����
		mf.b7.addActionListener(this);
		
		//ä��
		cf.tf.addActionListener(this);
		
		
		/*
		 * for(int i=0;i<10;i++) { cp.ff.mc[i].addMouseListener(this); }
		 */
		
		
	}
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		//�����ڴ� ȣ��ÿ� �ݵ�� 'new ������();'
		UIManager.setLookAndFeel("com.jtattoo.plaf.mcwin.McWinLookAndFeel");
		new ClientMainFrame();

	}
	public static Image getImage(ImageIcon ii,int w,int h)
	    {
	    	Image dimg = ii.getImage().getScaledInstance(w, h,
	    	        Image.SCALE_SMOOTH);
	    	return dimg;
	    }
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==mf.b1)//�޴���-Ȩ��ư
		{
			cp.card.show(cp, "FF");
		}
		else if(e.getSource()==mf.b2)
		{
			cp.card.show(cp, "LF");
		}
		else if(e.getSource()==mf.b5)
		{
			cp.card.show(cp, "NF");
		}
		else if(e.getSource()==cp.df.b2)
		{
			cp.card.show(cp, "FF");
		}
		else if(e.getSource()==cp.ff.b1)//������ư ��������
		{
			if(curpage>1)
			{
				curpage--;
				cp.ff.p.removeAll();//jpanel�� ��� ��� ����
				cp.ff.moviePrint(curpage);
				cp.ff.repaint();
				cp.ff.p.validate();//jpanel�� ���� ��� ���ġ
			}
		}
		else if(e.getSource()==cp.ff.b2)//������ư ��������
		{
			if(curpage<totalpage)
			{
				curpage++;
				cp.ff.p.removeAll();
				cp.ff.moviePrint(curpage);
				cp.ff.repaint();
				cp.ff.p.validate();
			}
		}
		else if(e.getSource()==cp.lf.b1)
		{
			cp.lf.movieAllData(1);
		}
		else if(e.getSource()==cp.lf.b2)
		{
			cp.lf.movieAllData(2);
		}
		else if(e.getSource()==cp.lf.b3)
		{
			cp.lf.movieAllData(3);
		}
		else if(e.getSource()==cp.lf.b4)
		{
			cp.lf.movieAllData(4);
		}
		else if(e.getSource()==cp.lf.b5)
		{
			cp.lf.movieAllData(5);
		}
		else if(e.getSource()==cp.lf.b6 || e.getSource()==cp.lf.tf)
		{
			//�Է°� �б�
			String ss=cp.lf.tf.getText();
			if(ss.length()<1)
			{
				JOptionPane.showMessageDialog(this, "�˻�� �Է��ϼ���");
				cp.lf.tf.requestFocus();
				return; //�޼ҵ� ����
			}
			cp.lf.movieFindData(ss);
		}
		
		else if(e.getSource()==login.b1)
		{
			String id=login.tf1.getText();
			if(id.length()<1)//ID �Է����� ���� ���
			{
				JOptionPane.showMessageDialog(this, "ID�� �Է��ϼ���");
				login.tf1.requestFocus();
				return;
			}
			
			String name=login.tf2.getText();
			if(name.length()<1)
			{
				JOptionPane.showMessageDialog(this, "��ȭ���� �Է��ϼ���");
				login.tf2.requestFocus();
				return;
			}
			
			String sex="";
			if(login.rb1.isSelected())
				sex="����";
			else
				sex="����";
			
			//������ �Է¹��� ������ ����
			try
			{
				//����
				s=new Socket("localhost",7979);
				//�ۼ��� ��ġ Ȯ��
				in=new BufferedReader(new InputStreamReader(s.getInputStream()));
				out=s.getOutputStream();
				
				//�α��� ��û(������ ����)
				out.write((Function.LOGIN+"|"+id+"|"+name+"|"+sex+"\n").getBytes());
			}catch(Exception ex) {}
			
			//�������� �����ϴ� �����͸� �о ���
			new Thread(this).start();
		}
		else if(e.getSource()==login.b2)
		{
			System.exit(0);
		}
		else if(e.getSource()==cf.tf)
		{
			String msg=cf.tf.getText();
			if(msg.length()<1)
				return;
			try
			{
				out.write((msg+"\n").getBytes());
			}catch(Exception ex) {}
			cf.tf.setText("");
		}
		else if(e.getSource()==mf.b7)
		{
			try
			{
				out.write((Function.EXIT+"|\n").getBytes());
			}catch(Exception ex) {}
		}
	}
	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		for(int i=0;i<10;i++)
		{
			if(e.getSource()==cp.ff.mc[i])
			{
				if(e.getClickCount()==2)//����Ŭ��
				{
					int a=(i+1)+((curpage*10)-10);
					//JOptionPane.showMessageDialog(this, "mno="+a);
					cp.df.detailPrint(a);
					cp.card.show(cp, "DF");//��Ʈ���г� ���� �������г��� �����
					break;
				}
			}
		}
	}
	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		//�������� ������ �����͸� �޾Ƽ� ó��
		try
		{
			while(true)
			{
				String msg=in.readLine();
				System.out.println("server=>"+msg);
				StringTokenizer st=new StringTokenizer(msg,"|");
				int protocol=Integer.parseInt(st.nextToken());
				switch(protocol)
				{
					case Function.MYLOG:
					{
						setTitle(st.nextToken());
						login.setVisible(false);//�α���â
						setVisible(true);//��ȭ����
					}
					break;
					case Function.LOGIN:
					{
						//���̺� ���
						String[] data= {st.nextToken(),//id
										st.nextToken(),//name
										st.nextToken()};//sex
						cf.model.addRow(data);
					}
					break;
					case Function.CHAT:
					{
						cf.ta.append(st.nextToken()+"\n");
					}
					case Function.EXIT:
					{
						String id=st.nextToken();
						for(int i=0;i<cf.model.getRowCount();i++)
						{
							String mid=cf.model.getValueAt(i, 0).toString();
							if(id.equals(mid))
							{
								cf.model.removeRow(i);
								break;
							}
						}
					}
					case Function.MYEXIT:
					{
						dispose();//������ �޸� ����
						System.exit(0);
					}
					
				}
			}
		}catch(Exception ex) {}
	}

}
