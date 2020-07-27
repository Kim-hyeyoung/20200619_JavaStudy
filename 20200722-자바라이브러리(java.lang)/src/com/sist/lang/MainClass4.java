package com.sist.lang;
/*
 * toString() : 클래스 객체를 문자열로 변환 
 * 리턴형 확인!!
 * toString => String toString()
 * clone => Object clone()
 */
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import javax.swing.table.*;
/*
 *  인터페이스
 *  	= 상수형 변수 => public static final
 *  				int a=10;
 *  	= 추상 메소드 => public abstract
 *  	  =======
 *  	  void display();
 *  	  구현이 안된 메소드 => 메모리 할당이 불가능
 *  
 *  	=다중상속이 가능
 *  	=서로 다른 클래스 연결 가능
 *  			 extends
 *  	= 인터페이스 ======> 인터페이스 상속 
 *			     implements
 *  	= 인터페이스 ==========> 클래스 상속
 */
public class MainClass4 extends JFrame implements MouseListener{
	JTable table;
	DefaultTableModel model;
	public MainClass4()
	{
		String[] col= {"이름","나이","주소"};
		String[][] row=new String[0][3];
		
		model=new DefaultTableModel(row,col) {
			//익명의 클래스 => 메소드 재정의 =====>클릭시 편집 방지
			public boolean isCellEditable(int r,int c)
			{
				return false;
			}
			//public void aaa()
			//{
				
			//}//메소드 추가도 가능
		};
		
		table=new JTable(model);
		JScrollPane js=new JScrollPane(table); //표의 타이틀바 생성
		add("Center",js);
		for(int i=0;i<10;i++)
		{
			String[] data= {"홍길동"+(i+1),"30","서울"};
			model.addRow(data);
		}
		
		
		setSize(350, 400);
		setVisible(true);
		
		table.addMouseListener(this);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new MainClass4();
	}
	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==table)
		{
			if(e.getClickCount()==2)//더블클릭
			{
				int row=table.getSelectedRow();//몇번째 줄을 클릭했는지 확인
				String name=model.getValueAt(row, 0).toString();
				String age=model.getValueAt(row, 1).toString();
				String addr=model.getValueAt(row, 2).toString();
				String data="이름:"+name+"\n"+"나이:"+age+"\n"+"주소:"+addr;
				//String name=(String)model.getValueAt(row, 0);
				JOptionPane.showMessageDialog(this, data);
				
				//Object obj=true;
				//boolean bCheck=(boolean)obj;
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

}
