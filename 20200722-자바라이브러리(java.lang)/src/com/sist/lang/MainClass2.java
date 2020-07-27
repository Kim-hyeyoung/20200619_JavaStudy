package com.sist.lang;



class Change
{
	int x,y;
}
// 멤버변수 자동 초기화 => x,y=0
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
		System.out.println("변경전:x="+x+" y="+y);
		m.swap(x,y);
		System.out.println("변경후:x="+x+" y="+y);
		
		Change c=new Change();
		c.x=10;
		c.y=20;
		System.out.println("변경전:c.x="+c.x+" c.y="+c.y);
		m.swap2(c);
		System.out.println("변경후:c.x="+c.x+" c.y="+c.y);
		

	}

}
