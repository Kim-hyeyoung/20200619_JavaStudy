package com.sist.method;

import java.lang.reflect.Method;

class A
{
	public void display(String name)
	{
		System.out.println("Hello!\n"+name);
	}
	public void display2(String name)
	{
		System.out.println("Hello!\n"+name);
	}
}

public class �޼ҵ�2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//A a=new A();
		//a.display("ȫ�浿");
		try
		{
			Class clsName=Class.forName("com.sist.method.A");
			Object obj=clsName.newInstance();
			//System.out.println(obj);
			//A a=(A)obj;
			//a.display("��û��");
			Method[] method=clsName.getDeclaredMethods();
			//method[0].invoke(obj, "�̼���"); //invoke : �޼ҵ� �ҷ�����(�޼ҵ� �̸� ���� ��)
			for(Method m:method)
			{
				System.out.println(m.getName());
			}
		}catch(Exception ex) {}

	}

}
