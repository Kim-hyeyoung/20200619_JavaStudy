package com.sist.inter;
/*
 * �������̽� : �߻�Ŭ������ ����(�߻�Ŭ������ ������ ����)
 * 	=�̿ϼ��� Ŭ���� => �ڽ��� �޸� �Ҵ��� �� �� ���� (������ Ŭ������ ���ؼ� �޸� �Ҵ�)
 * 	=�߻� Ŭ����(���� ���), �������̽�(���� ���)
 * 	=��� �޼ҵ尡 abstract => ���� ����
 * 		**JDK 1.8���� default�޼ҵ带 �̿��Ͽ� �޼ҵ� ���� ����
 * 	=���� (�߻�Ŭ���� : �������, �������̽� : ���������)
 * 		int a;(x) => int a=10; (o)
 * 	=interface A
 * 	 {
 * 		*����
 * 		int a=10;  =>  JVM (public static final int a=10)
 * 		*�޼ҵ�
 * 		void aaa(); =>  JVM (public abstract void aaa();)
 * 		int bbb ();
 * 	 }
 *  =interface A
 * 	 {
 * 		(public abstract)void aaa();
 * 	 }
 *   ����
 *   class B implements A
 * 	 {
 * 		public void aaa();{}
 * 	 }
 * ***
 * 	=> �������̽��� ����� ��� �޼ҵ�� public�̴�
 * 	=> �������̽��� ����� ��� ������ public�̸� �����
 * 
 * ���
 * 	�������̽� => �������̽� : extends
 * 	�������̽� => Ŭ���� : implements
 * 	Ŭ���� => �������̽� : ����!!! (�������̽��� Ŭ������ ��ӹ��� �� ����)
 * 
 * interface A
 * interface B
 * class C implements A,B => ���߻��
 * ==================================
 * interface A
 * class B
 * class C extends B implements A
 * 	�������̽��� ��� �޼ҵ尡 ������ �ȵȴ�
 */
interface ����{
	void eat();
	default void run() {System.out.println("�׹߷� �ȴ´�");} //JDK1.8 �̻���� ����, �� ���ϴ� ����
}
class �� implements ����{
	public void eat() {System.out.println("�Ұ��� �Դ´�");}
	}

class �� implements ����{
	public void eat() {System.out.println("������ �Դ´�");}
}
class ���� implements ����{
	public void eat() {System.out.println("�������� �Դ´�");}
}
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		���� ani=new ��();
		ani.eat();
		ani=new ��();
		ani.eat();
		ani=new ����();
		ani.eat();

	}

}
