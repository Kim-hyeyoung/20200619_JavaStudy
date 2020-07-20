package com.sist.oop;
/*
 *  1.��Ű����(�� ���� ���)
 *  2.import(���� �� ���)
 *  3.public class className
 *  {
 *  	�ʿ��� ���� ����(�������)
 *  	������ ���� �ʱ�ȭ(������)
 *  	���(�޼ҵ�)
 *  }
 *  => �ٸ� Ŭ�������� ���� import com.sist.oop.*;
 *  
 *  ĸ��ȭ
 *  	=������ private
 *  	=�޼ҵ�� public => ����(getter/setter)
 *  ���
 *  	=>extends : ���� Ŭ���� ����� ������ �´�
 *  				���� ��Ӹ� ����
 *  ������
 *  	=����,�߰�    
 */
class Calc{
	public void plus(int a,int b)
	{
		System.out.printf("%d+%d=%d\n",a,b,a+b);
	}
	public void plus(double a,double b)
	{
		System.out.printf("%f+%f=%f\n",a,b,a+b);
	}
	public void plus(String a,String b)
	{
		System.out.printf("%s+%s=%s\n",a,b,a+b);
	}
	public double plus(double d,char c)
	{
		return d+c;
	}
}
public class �����ε�_�ߺ��޼ҵ����� {
	int a=10;
	static int b=20;
	public void disp1()
	{
		System.out.println(b); //������� �Ķ���, �������� ����, static�� ���Ÿ�ü
		System.out.println(a);
	}
	public static void disp2()
	{
		System.out.println(b);
		�����ε�_�ߺ��޼ҵ����� aa=new �����ε�_�ߺ��޼ҵ�����();
		System.out.println(aa.a);
	}
 //static�� �ν��Ͻ� ����, �ν��Ͻ� �޼ҵ� ��� �Ұ� => new�� �޸� ���� �Ҵ��ϰ� ��� ����
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calc cc=new Calc(); //�޼ҵ� ��ü ����
		cc.plus("Hello", "Java");
		cc.plus(100, 200);
		System.out.println(b);
		
		�����ε�_�ߺ��޼ҵ����� aa=new �����ε�_�ߺ��޼ҵ�����();
		System.out.println("aa="+aa);
		System.out.println(aa.a);

	}

}
