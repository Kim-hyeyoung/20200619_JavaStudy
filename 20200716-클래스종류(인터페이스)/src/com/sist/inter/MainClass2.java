package com.sist.inter;
/*
 * 자바지원 인터페이스
 * 1) window (javax.swing)
 * 	  ActionListener :버튼, 메뉴, 텍스트엔터
 * 	  MouseListener
 *    MouseMotionListener
 *    KeyListener
 *    FocusListener
 *    ItemListener
 * 2) 데이터베이스 연결
 * 	  Connection
 * 	  Statement
 * 	  ResultSet
 */
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class MainClass2 extends JFrame implements ActionListener,MouseListener,ItemListener{ //다중 상속은 ','로 구분
	JButton b1;
	JTextField tf;
	JLabel la;
	JComboBox box;
	public MainClass2()
	{
		b1=new JButton("클릭");
		tf=new JTextField();
		la=new JLabel(new ImageIcon("c:\\javaDev\\air.jpg"));
		box=new JComboBox();
		box.addItem("홍길동");
		box.addItem("박문수");
		box.addItem("이순신");
		add("West",b1);
		add("Center",la);
		add("South",tf);
		add("North",box);
		
		setSize(450,500);
		setVisible(true);
		
		//이벤트 등록
		//=> b1이라는 버튼을 클릭하면 actionperformed() 호출
		b1.addActionListener(this); //this => 자신 mainclass2
		tf.addActionListener(this); //mainclass2가 아닌 다른 클래스에 기능을 구현했다면 (this)가 아닌(new 클래스명) 여야함
		la.addMouseListener(this);
		box.addItemListener(this);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new MainClass2();

	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==la)
		{
			if(e.getClickCount()==2) //더블클릭 이벤트
			{
				JOptionPane.showMessageDialog(this, "상세보기로 이동");
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
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==b1)
		{
			JOptionPane.showMessageDialog(this, "버튼클릭");
		}
		else if(e.getSource()==tf)
		{
			String msg=tf.getText();
			JOptionPane.showMessageDialog(this, msg);
		}
	}

	@Override
	public void itemStateChanged(ItemEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==box)
		{
			String name=(String)box.getSelectedItem();
			JOptionPane.showMessageDialog(this, name);
		}
	}

}
