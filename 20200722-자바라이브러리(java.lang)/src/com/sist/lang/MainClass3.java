package com.sist.lang;
class B
{
	int x,y;
}
public class MainClass3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//call by value => 값을 전송 => 매개변수 전송법(메모리가 다른 메모리)
		int x=10;
		int y=20;
		
		int i=x;
		int j=y;
		
		int temp=i;
		i=j;
		j=temp;
		
		System.out.println("i="+i+" j="+j);
		System.out.println("x="+x+" y="+y); //=> x,y 값에는 변동이 없음
		
		//call by reference => 주소 전송
		
		B b=new B();
		b.x=10;
		b.y=20;
		B c=b;
		c.x=100;
		c.y=200;
		
		System.out.println("b="+b);
		System.out.println("c="+c);
		System.out.println(b.x);
		System.out.println(b.y);
		
		/*
		 * 매개변수가 class, 배열 => 원본 (주소)
		 * 매개변수가 기본형 데이터, String => 복사본
		 * 
		 * 메모리(클래스) 같이 사용 => 참조
		 * 메모리(클래스) 이미 만들어진 클래스 사용 => 복제(clone)
		 * 메모리(클래스) 새로운 내용(처음부터 사용) => new
		 */

	}

}
