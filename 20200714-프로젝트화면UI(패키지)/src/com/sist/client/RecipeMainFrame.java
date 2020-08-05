package com.sist.client;
import java.awt.*;
import com.sist.common.*;
import java.awt.event.*; //��ưŬ���� ó�� ���

import javax.swing.*;

public class RecipeMainFrame extends JFrame implements ActionListener{
	//��ġ
	
	CardLayout card=new CardLayout();
	Login login=new Login();
	JoinForm join=new JoinForm();
	RecipeManager rm=new RecipeManager();
	public RecipeMainFrame()
	{
		//GUI ȭ�� ������, ���� �ʱ�ȭ, �����ͺ��̽� ����, ��������, ������ ����
		//Layout => ȭ�� ��ġ
		setLayout(card);
		//ȭ���߰�
		add("RM",rm);
		add("LOGIN",login);
		add("JOIN",join);
		setSize(1024, 960);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE); //�̰� �־�� �����찡 �������(�޸� �����)
		
		login.b2.addActionListener(this);
		join.b3.addActionListener(this);
	}
	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		UIManager.setLookAndFeel("com.jtattoo.plaf.mcwin.McWinLookAndFeel");
		new RecipeMainFrame();
		

	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==login.b2)
		{
			card.show(getContentPane(),"JOIN"); //Ŭ���� â�̵�
		}
		else if(e.getSource()==join.b3)
		{
			card.show(getContentPane(),"LOGIN");
		}
		
	}

}
