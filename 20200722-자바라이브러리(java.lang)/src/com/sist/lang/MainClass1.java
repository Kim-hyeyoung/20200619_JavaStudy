package com.sist.lang;
/*
 * java.lang
 * =========
 * 	=Object : 1) 최상위 클래스(모든 데이터형을 포함)
 * 			  2) 모든 클래스(사용자 정의 포함)에 상속을 내린다 => Object가 가지고 있는 모든 기능 사용 가능!
 * 			  3) 주요 기능(메소드)
 * 				clone() => prototype : 메모리 복제
 * 	=String
 * 	=StringBuffer
 * 	=System
 * 	=Math
 * 	=Wrapper : 모든 데이터형을 사용하기 쉽게 클래스로 변경
 * 				=> Double => double
 * 				   Byte => byte
 * 				   Integer => int
 * 				   Boolean => boolean
 * 				======================== 박싱/언박싱
 * 				Integer i=10
 * 				Integer i=new Integer(100);
 * 				int k=i;
 */
/*
 *  class A
 *  {
 *  	int a=10;
 *  }
 *  class B extends A
 *  {
 *  	//A 상속 => int a;
 *  	public B()
 *  	{
 *  		this.a=100; => 상속받은 클래스 값 변경(자신) => B클래스 안의 int a값
 *  		super.a=200; => A클래스 값 변경 => A클래스 안의 int a값
 *  	}
 *  }
 *  
 *  상속
 *  	extends => class로부터 상속, 단일 상속
 *  	implements => interface(클래스의 일종)로부터 상속, 다중 상속
 *  
 *  클래스
 *  	1) new => 처음부터 시작
 *  	2) 참조 => 클래스를 매개변수로 전송
 *  	3) 복제 => 변경된 것부터 시작
 */
class A implements Cloneable
{
	int aa=10;
	public A clone()
	{
		A a=new A();
		try
		{
			a= (A)super.clone(); //클래스의 형변환 => return형이 object이기 때문에 A클래스로 형변환
			/*
			 *  Object (double)
			 *  A (int)
			 */
		}catch(Exception e) {}
		return a;
	}
}
public class MainClass1 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A a=new A(); //a.aa
		a.aa=100;
		A b=new A(); //b.aa
		System.out.println(b.aa); //a와 b는 별개의 공간이기 때문에 a.aa값을 변경해도 b.aa 값은 그대로
		
		//별칭, 같은 메모리 참조
		A c=new A();
		c.aa=100;
		A d=c; //동일한 저장 장소
		System.out.println(d.aa); //c와 d는 동일한 저장 장소를 가지기 때문에 c값을 변경하면 d값도 변경된다
		d.aa=1000;
		System.out.println(c.aa);
		
		A e=c.clone();
		System.out.println(e.aa);
		
	}

}
