package com.sist.method;
/*
 * 메소드
 * 	=리턴값
 * 	=매개변수 : 애매한 경우
 * 	 print("%d%d%d",10,20,30)
 *	 print("%d%f%s",100,10.5,"")
 *	================>가변매개변수(...)
 *	String... a => String을 몇개든지 받을 수 있다
 *	Object... o
 */

public class 메소드 {
	public static void concat(String s,String... s1)
	{
		for(String ss:s1)
		{
			s+=ss;
		}
		System.out.println(s);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		concat("Hello","홍길동","심청이","박문수","춘향이","이순신");
		/*
		Object o=10;
		Object o1=0.5;
		Object o2='A';
		Object o3="aaaa";
		Object o4=new 메소드();
		*/
		//Object => 모든 데이터형을 다 받을 수 있다
		
		
		
		
	}

}
