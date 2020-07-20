package com.sist.oop;
/*
 *  1.패키지명(한 번만 사용)
 *  2.import(여러 번 사용)
 *  3.public class className
 *  {
 *  	필요한 변수 설정(멤버변수)
 *  	변수에 대한 초기화(생성자)
 *  	기능(메소드)
 *  }
 *  => 다른 클래스에서 사용시 import com.sist.oop.*;
 *  
 *  캡슐화
 *  	=변수는 private
 *  	=메소드는 public => 변수(getter/setter)
 *  상속
 *  	=>extends : 기존 클래스 기능을 가지고 온다
 *  				단일 상속만 가능
 *  다형성
 *  	=수정,추가    
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
public class 오버로딩_중복메소드정의 {
	int a=10;
	static int b=20;
	public void disp1()
	{
		System.out.println(b); //멤버변수 파란색, 지역변수 갈색, static은 이탤릭체
		System.out.println(a);
	}
	public static void disp2()
	{
		System.out.println(b);
		오버로딩_중복메소드정의 aa=new 오버로딩_중복메소드정의();
		System.out.println(aa.a);
	}
 //static은 인스턴스 변수, 인스턴스 메소드 사용 불가 => new로 메모리 공간 할당하고 사용 가능
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calc cc=new Calc(); //메소드 전체 저장
		cc.plus("Hello", "Java");
		cc.plus(100, 200);
		System.out.println(b);
		
		오버로딩_중복메소드정의 aa=new 오버로딩_중복메소드정의();
		System.out.println("aa="+aa);
		System.out.println(aa.a);

	}

}
