package com.sist.client;
import javax.swing.*;
import java.awt.*; //color, layout(배치)
import java.awt.event.*;//interface(버튼동작)

public class TourDetailList extends JFrame implements ActionListener{
	JLabel photo,photo2,photo3,la1,la2,la3,la4,la5,la6;
	JButton b1,b2,b3;
	
	public TourDetailList()
	{
		//버튼배치1
		b1=new JButton("판매상품보기");
		setLayout(null);
		b1.setBackground(Color.orange);
		b1.setOpaque(false);
		b1.setBounds(930, 220, 150, 50);
		add(b1);
		//버튼배치2
		b2=new JButton("판매상품보기");
		setLayout(null);
		b2.setBackground(Color.orange);
		b2.setOpaque(false);
		b2.setBounds(930, 480, 150, 50);
		add(b2);
		//버튼배치3
		b3=new JButton("판매상품보기");
		setLayout(null);
		b3.setBackground(Color.orange);
		b3.setOpaque(false);
		b3.setBounds(930, 740, 150, 50);
		add(b3);
		
		
		//1행
		//리스트 배치
		photo=new JLabel();
		la1=new JLabel();
		la2=new JLabel();
		
		setLayout(null);
		photo.setBackground(Color.green);
		photo.setOpaque(true);
		photo.setBounds(20, 20, 250, 250);
		add(photo);
		
		setLayout(null);
		la1.setBackground(Color.cyan);
		la1.setOpaque(true);
		la1.setBounds(280, 20, 800, 50);
		add(la1);
		
		setLayout(null);
		la2.setBackground(Color.pink);
		la2.setOpaque(true);
		la2.setBounds(280, 80, 800, 190);
		add(la2);
	
		
		//2행
		//리스트 배치
		photo2=new JLabel();
		la3=new JLabel();
		la4=new JLabel();
				
		setLayout(null);
		photo2.setBackground(Color.green);
		photo2.setOpaque(true);
		photo2.setBounds(20, 280, 250, 250);
		add(photo2);
				
		setLayout(null);
		la3.setBackground(Color.cyan);
		la3.setOpaque(true);
		la3.setBounds(280, 280, 800, 50);
		add(la3);
				
		setLayout(null);
		la4.setBackground(Color.pink);
		la4.setOpaque(true);
		la4.setBounds(280, 340, 800, 190);
		add(la4);
		
		//3행
		//리스트 배치
		photo3=new JLabel();
		la5=new JLabel();
		la6=new JLabel();
						
		setLayout(null);
		photo3.setBackground(Color.green);
		photo3.setOpaque(true);
		photo3.setBounds(20, 540, 250, 250);
		add(photo3);
						
		setLayout(null);
		la5.setBackground(Color.cyan);
		la5.setOpaque(true);
		la5.setBounds(280, 540, 800, 50);
		add(la5);
						
		setLayout(null);
		la6.setBackground(Color.pink);
		la6.setOpaque(true);
		la6.setBounds(280, 600, 800, 190);
		add(la6);
		
		
		
		
		//윈도우 화면 전체 세팅
		setSize(1200, 900);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE); //X버튼 클릭시 종료(메모리 할당x)
		
		//mf.b1.addActionListener(this);
		
	}
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		//생성자는 호출시에 반드시 'new 생성자();'
		UIManager.setLookAndFeel("com.jtattoo.plaf.mcwin.McWinLookAndFeel");
		new TourDetailList();

	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		/*
		if(e.getSource()==mf.b1)
		{
			cp.card.show(cp, "DF");
		}
		if(e.getSource()==mf.b2)
		{
			cp.card.show(cp, "LF");
		}
		*/
	}

}
