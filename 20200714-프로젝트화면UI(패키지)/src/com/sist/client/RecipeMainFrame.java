package com.sist.client;
import java.awt.*;
import com.sist.common.*;
import java.awt.event.*; //버튼클릭시 처리 기능

import javax.swing.*;

public class RecipeMainFrame extends JFrame implements ActionListener{
	//배치
	
	CardLayout card=new CardLayout();
	Login login=new Login();
	JoinForm join=new JoinForm();
	RecipeManager rm=new RecipeManager();
	public RecipeMainFrame()
	{
		//GUI 화면 디자인, 변수 초기화, 데이터베이스 연결, 서버연결, 쓰레드 동작
		//Layout => 화면 배치
		setLayout(card);
		//화면추가
		add("RM",rm);
		add("LOGIN",login);
		add("JOIN",join);
		setSize(1024, 960);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE); //이게 있어야 윈도우가 사라진다(메모리 사라짐)
		
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
			card.show(getContentPane(),"JOIN"); //클릭시 창이동
		}
		else if(e.getSource()==join.b3)
		{
			card.show(getContentPane(),"LOGIN");
		}
		
	}

}
