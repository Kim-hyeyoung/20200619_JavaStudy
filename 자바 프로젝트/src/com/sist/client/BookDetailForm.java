package com.sist.client;
import java.awt.*;
import java.net.URL;

import javax.swing.*;

import com.sist.data.BookData;
import com.sist.data.BookManager;
import com.sist.data.BookVO;

import java.util.*;
public class BookDetailForm extends JPanel{
	JLabel poster=new JLabel();
	JLabel la1=new JLabel(); //å����
	JLabel[] la=new JLabel[4];//å ����-����,���ǻ�,����,���»���
	JButton b1,b2;
	public BookDetailForm()
	{
		setLayout(null);
		poster.setBounds(10, 30, 230, 300);
		//poster.setOpaque(true);
		//poster.setBackground(Color.red);
		add(poster);
		la1.setBounds(265, 15, 400, 45);
		//la1.setOpaque(true);
		//la1.setBackground(Color.cyan);
		la1.setFont(new Font("���� ���",Font.BOLD,20));
		add(la1);
		JPanel p=new JPanel();
		p.setLayout(new GridLayout(4,1,5,5));
		String[] str= {"����","���ǻ�","����","���»���"};
		for(int i=0;i<4;i++)
		{
			la[i]=new JLabel(str[i]);
			la[i].setFont(new Font("���� ���",Font.BOLD,15));
			p.add(la[i]);
		}
		p.setBounds(265, 70, 400, 300);
		add(p);
		
		//ta.setEditable(false);//���� ��Ȱ��ȭ
		//JScrollPane js=new JScrollPane(ta);
		//js.setBounds(10, 420, 700, 120);
		//add(js);
		
		b1=new JButton("��ٱ���");
		b2=new JButton("�ٷα���");
		b1.setBackground(Color.pink);
		b2.setBackground(Color.green);
		JPanel p2=new JPanel();
		p2.add(b1);
		p2.add(b2);
		p2.setBounds(265, 400, 200, 35);
		add(p2);
	}
	public void detailPrint(int mno)
	{
		BookManager m=new BookManager();
		BookVO vo=m.bookDetailData(mno);
		la1.setText(vo.getTitle());
		try
		{
			URL url=new URL(vo.getPoster());
			Image img=MainFrame.getImage(new ImageIcon(url), poster.getWidth(), poster.getHeight());
			poster.setIcon(new ImageIcon(img));
		}catch(Exception ex) {}
		
		la[0].setText("����:"+vo.getAuthor());
		la[1].setText("���ǻ�:"+vo.getPublish());
		la[2].setText("����:"+vo.getCost());
		la[3].setText("���»���:"+vo.getInfo());

		
	}

}
