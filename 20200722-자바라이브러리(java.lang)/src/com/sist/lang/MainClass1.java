package com.sist.lang;
/*
 * java.lang
 * =========
 * 	=Object : 1) �ֻ��� Ŭ����(��� ���������� ����)
 * 			  2) ��� Ŭ����(����� ���� ����)�� ����� ������ => Object�� ������ �ִ� ��� ��� ��� ����!
 * 			  3) �ֿ� ���(�޼ҵ�)
 * 				clone() => prototype : �޸� ����
 * 	=String
 * 	=StringBuffer
 * 	=System
 * 	=Math
 * 	=Wrapper : ��� ���������� ����ϱ� ���� Ŭ������ ����
 * 				=> Double => double
 * 				   Byte => byte
 * 				   Integer => int
 * 				   Boolean => boolean
 * 				======================== �ڽ�/��ڽ�
 * 				Integer i=10
 * 				Integer i=new Integer(100);
 * 				int k=i;
 */
/*
 *  class A
 *  {
 *  	int a=10;
 *  }
 *  class B extends A
 *  {
 *  	//A ��� => int a;
 *  	public B()
 *  	{
 *  		this.a=100; => ��ӹ��� Ŭ���� �� ����(�ڽ�) => BŬ���� ���� int a��
 *  		super.a=200; => AŬ���� �� ���� => AŬ���� ���� int a��
 *  	}
 *  }
 *  
 *  ���
 *  	extends => class�κ��� ���, ���� ���
 *  	implements => interface(Ŭ������ ����)�κ��� ���, ���� ���
 *  
 *  Ŭ����
 *  	1) new => ó������ ����
 *  	2) ���� => Ŭ������ �Ű������� ����
 *  	3) ���� => ����� �ͺ��� ����
 */
class A implements Cloneable
{
	int aa=10;
	public A clone()
	{
		A a=new A();
		try
		{
			a= (A)super.clone(); //Ŭ������ ����ȯ => return���� object�̱� ������ AŬ������ ����ȯ
			/*
			 *  Object (double)
			 *  A (int)
			 */
		}catch(Exception e) {}
		return a;
	}
}
public class MainClass1 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A a=new A(); //a.aa
		a.aa=100;
		A b=new A(); //b.aa
		System.out.println(b.aa); //a�� b�� ������ �����̱� ������ a.aa���� �����ص� b.aa ���� �״��
		
		//��Ī, ���� �޸� ����
		A c=new A();
		c.aa=100;
		A d=c; //������ ���� ���
		System.out.println(d.aa); //c�� d�� ������ ���� ��Ҹ� ������ ������ c���� �����ϸ� d���� ����ȴ�
		d.aa=1000;
		System.out.println(c.aa);
		
		A e=c.clone();
		System.out.println(e.aa);
		
	}

}
