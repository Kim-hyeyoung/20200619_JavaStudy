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

public class 메소드2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//A a=new A();
		//a.display("홍길동");
		try
		{
			Class clsName=Class.forName("com.sist.method.A");
			Object obj=clsName.newInstance();
			//System.out.println(obj);
			//A a=(A)obj;
			//a.display("심청이");
			Method[] method=clsName.getDeclaredMethods();
			//method[0].invoke(obj, "이순신"); //invoke : 메소드 불러오기(메소드 이름 몰라도 됨)
			for(Method m:method)
			{
				System.out.println(m.getName());
			}
		}catch(Exception ex) {}

	}

}
