package com.sist.lang;
/*
 * finalize() : 소멸자  <========> 생성자
 * 	
 */
class C
{
	public void display()
	{
		System.out.println("C:display() call...");
	}
	@Override
	protected void finalize() throws Throwable {
		System.out.println("메모리 해제");
	}
	
}
public class MainClass5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		C c=new C();
		c.display();
		//소멸
		c=null;//gc대상
		System.gc();
	}

}
