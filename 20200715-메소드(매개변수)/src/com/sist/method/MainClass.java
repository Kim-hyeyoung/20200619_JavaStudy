package com.sist.method;
class AA
{
	public void AA() //void가 붙으면 일반 인스턴스 메소드가 됨(생성자x) /void => return형(결과값은x)
	{
		System.out.println("AA() Call...");
	}
	public AA() //없으면 호출 가능
	{
		System.out.println("AA() Call...");
	}
}

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AA a=new AA();
		a.AA();

	}

}
