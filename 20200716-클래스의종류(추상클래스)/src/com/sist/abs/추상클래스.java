package com.sist.abs;
/*
 * Ŭ������ ����
 * 	=�߻�Ŭ����
 * 	=�������̽� : �߻�Ŭ���� Ȯ��, ���� ���� Ŭ������ ��Ƽ� ����(���� �ٸ� Ŭ������ �����ؼ� ���)
 * 			  **���ռ��� ���� ���α׷�
 * 				====
 * 				=���ռ� : Ŭ���� ������ �ٸ� Ŭ������ ������ �ִ°�(���ռ��� ���ƾ� ���������� ���ϴ�)
 * 				=������ : �� ���� ����� ������ �� �ִ� �ɷ�(�޼ҵ�)
 * 			  **�� ��� �뵵
 * 				1)����� �������� ������ ��� ex)��ư
 * 				2)���� ���� Ŭ������ �� ���� Ŭ������ �����ϴ� ���
 * 		=========================================
 * 				�߻�Ŭ����			�������̽�
 * 		=========================================
 * 				���ϻ��			���� ���
 * 		=========================================
 * 			������ �ȵ� �޼ҵ�			������ �ȵ� �޼ҵ常!
 * 			������ �� �޼ҵ�
 * 		=========================================
 * 		����
 * 		�߻�Ŭ����
 * 			public abstract class A
 * 			{
 * 				public abstract void display();   or
 * 				public void aaa(){}
 * 			}
 * 		�������̽�
 * 			public interface B
 * 			{
 * 				void display(); => �Ⱥٿ� ������ �����δ� public abstract�� �پ� �ִ�(�ڵ�����) public abstract void display();  
 * 				void aaa(); =>�Ⱥٿ� ������ �����δ� public abstract�� �پ� �ִ�(�ڵ�����) public abstract void aaa(); 
 * 			}
 * 		=========================================
 * 		�������
 * 		�߻�Ŭ����
 * 			public abstract class A
 * 			{
 * 				private int a;
 * 			}
 * 		�������̽�
 * 			public interface B
 * 			{
 * 				int a; => error!!!    => �������̽��� ������ �ִ� ������ ����� ����
 * 										 int a; => public final static int a; => final�̱� ������ �������� �����ؾ� ��
 * 				int a=10; => ����!!!
 * 			}
 * 		=> �������̽��� ���� : ��� �����ϴ� �κ��� �߰��ϸ� ��� Ŭ���� ����!!
 * 						=> �������̽�, �߻�Ŭ���� ���� ��ӹ޾ƾ� ��
 * 							������ �� �� �޼ҵ�� �ݵ�� �����ؼ� ���
 * 		ex) public interface A
 * 			{
 * 				public void aaa();
 * 				public void bbb();
 * 			}
 * 			 public implements A
 * 			{
 * 				aaa�� �ʿ��ص� bbb���� �����ؾ� ��
 * 			}
 * 			
 * ===========
 * 	=����Ŭ����-���Ŭ����
 * 	=����Ŭ����-�͸�Ŭ����
 */
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class �߻�Ŭ���� extends JFrame implements MouseListener{

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
		
	}  //�޼ҵ�� {}������ ������ ������(���ȣok)

}
