// 메인페이지
package com.sist.client;
import javax.swing.*;

import com.sist.client.ControlPanel;

import java.awt.*; // Color , Layout
import java.awt.event.*; // interface
public class MainFrame extends JFrame implements ActionListener {
	JLabel title=new JLabel("영화 예매 & 추천 프로그램",JLabel.CENTER); 
	MenuForm mf=new MenuForm(); // 메뉴
	HomeForm hf=new HomeForm(); // 홈
	BookListForm bf=new BookListForm(); // 도서추천

	ControlPanel cp; // 컨트롤패널
	
	// 생성자
	public MainFrame() {
		cp=new ControlPanel(this);
		setLayout(null); // 사용자 정의로 배치 
		
		// 타이틀
		title.setFont(new Font("맑은 고딕", Font.PLAIN, 40));
		title.setBounds(10, 15, 1400, 100);
		add(title);
		
		// 메뉴창
		mf.setBounds(15, 110, 110, 300);
		add(mf);

		// 출력 화면
		cp.setBounds(150, 110, 1200, 550);
		add(cp);
		
		
		
		
		mf.b1.addActionListener(this);
		mf.b2.addActionListener(this);
		mf.b3.addActionListener(this);
		mf.b4.addActionListener(this);
		
		cp.bf.b1.addActionListener(this);
		cp.bf.b2.addActionListener(this);
		cp.bf.b3.addActionListener(this);
		cp.bf.b4.addActionListener(this);
		cp.bf.tf.addActionListener(this);
		//  윈도우창
		setSize(1400,900); // 크기
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE); // x버튼 누르면 종료
		
	}

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		UIManager.setLookAndFeel("com.jtattoo.plaf.hifi.HiFiLookAndFeel");
		new MainFrame();
	}
	
	
	// 버튼 눌렀을 때 
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==mf.b1)
		{
			cp.card.show(cp, "HF");
		}
		else if(e.getSource()==cp.bf.b1)
	    {
	        cp.bf.bookAllData(1);
	    }
	    else if(e.getSource()==cp.bf.b2)
	    {
	       cp.bf.bookAllData(2);
	    }
	    else if(e.getSource()==cp.bf.b3)
	    {
	       cp.bf.bookAllData(3);
	    }
	      
	    else if(e.getSource()==cp.bf.b4 || e.getSource()==cp.bf.tf) //검색창에서 검색버튼(b4) or 엔터쳤을때(tf)
	    {
	         // 1 입력된 값 읽기
	         String ss=cp.bf.tf.getText();
	         if(ss.length()<1) //입력된 검색어가 없을경우
	         {
	            JOptionPane.showMessageDialog(this, "검색어를 입력하세요");
	            cp.bf.tf.requestFocus();
	            return; //메소드종료
	         }
	         cp.bf.BookFindData(ss);
	    }
		else if(e.getSource()==mf.b2)
		{
			cp.card.show(cp, "BF");
		}
		else if(e.getSource()==mf.b3)
		{
			cp.card.show(cp, "VF");
		}
		else if(e.getSource()==mf.b4)
		{
			cp.card.show(cp, "SF");
		}		
	}

	public static Image getImage(ImageIcon ii,int w,int h)
    {
       Image dimg = ii.getImage().getScaledInstance(w, h,
               Image.SCALE_SMOOTH);
       return dimg;
    }
}
