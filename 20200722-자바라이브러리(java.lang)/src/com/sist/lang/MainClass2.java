package com.sist.lang;



class Change
{
	int x,y;
}
// ������� �ڵ� �ʱ�ȭ => x,y=0
public class MainClass2 {
	public void swap2(Change c)
	{
		int temp=c.x;
		c.x=c.y;
		c.y=temp;
	}
	public void swap(int a,int b)
	{
		int temp=a;
		a=b;
		b=temp;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MainClass2 m=new MainClass2();
		int x=10;
		int y=20;
		System.out.println("������:x="+x+" y="+y);
		m.swap(x,y);
		System.out.println("������:x="+x+" y="+y);
		
		Change c=new Change();
		c.x=10;
		c.y=20;
		System.out.println("������:c.x="+c.x+" c.y="+c.y);
		m.swap2(c);
		System.out.println("������:c.x="+c.x+" c.y="+c.y);
		

	}

}
