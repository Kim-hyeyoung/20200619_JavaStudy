package com.sist.abs;
/*
 * 클래스의 종류
 * 	=추상클래스
 * 	=인터페이스 : 추상클래스 확장, 여러 개의 클래스를 모아서 관리(서로 다른 클래스를 연결해서 사용)
 * 			  **결합성이 낮은 프로그램
 * 				====
 * 				=결합성 : 클래스 수정시 다른 클래스에 영향이 있는가(결합성이 낮아야 유지보수가 편하다)
 * 				=응집성 : 한 개의 기능을 수행할 수 있는 능력(메소드)
 * 			  **주 사용 용도
 * 				1)기능이 여러개로 나뉘는 경우 ex)버튼
 * 				2)여러 개의 클래스를 한 개의 클래스로 제어하는 경우
 * 		=========================================
 * 				추상클래스			인터페이스
 * 		=========================================
 * 				단일상속			다중 상속
 * 		=========================================
 * 			구현이 안된 메소드			구현이 안된 메소드만!
 * 			구현이 된 메소드
 * 		=========================================
 * 		형식
 * 		추상클래스
 * 			public abstract class A
 * 			{
 * 				public abstract void display();   or
 * 				public void aaa(){}
 * 			}
 * 		인터페이스
 * 			public interface B
 * 			{
 * 				void display(); => 안붙여 쓰지만 실제로는 public abstract가 붙어 있다(자동으로) public abstract void display();  
 * 				void aaa(); =>안붙여 쓰지만 실제로는 public abstract가 붙어 있다(자동으로) public abstract void aaa(); 
 * 			}
 * 		=========================================
 * 		멤버변수
 * 		추상클래스
 * 			public abstract class A
 * 			{
 * 				private int a;
 * 			}
 * 		인터페이스
 * 			public interface B
 * 			{
 * 				int a; => error!!!    => 인터페이스가 가지고 있는 변수는 상수형 변수
 * 										 int a; => public final static int a; => final이기 때문에 변수값을 지정해야 함
 * 				int a=10; => 정상!!!
 * 			}
 * 		=> 인터페이스의 단점 : 기능 설정하는 부분을 추가하면 모든 클래스 에러!!
 * 						=> 인터페이스, 추상클래스 사용시 상속받아야 함
 * 							구현이 안 된 메소드는 반드시 구현해서 사용
 * 		ex) public interface A
 * 			{
 * 				public void aaa();
 * 				public void bbb();
 * 			}
 * 			 public implements A
 * 			{
 * 				aaa만 필요해도 bbb까지 구현해야 함
 * 			}
 * 			
 * ===========
 * 	=내부클래스-멤버클래스
 * 	=내부클래스-익명클래스
 */
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class 추상클래스 extends JFrame implements MouseListener{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
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
		
	}  //메소드는 {}있으면 구현된 상태임(빈괄호ok)

}
