package com.sist.inter;
/*
 * 인터페이스 : 추상클래스의 일종(추상클래스의 단점을 보완)
 * 	=미완성된 클래스 => 자신이 메모리 할당을 할 수 없다 (구현한 클래스를 통해서 메모리 할당)
 * 	=추상 클래스(단일 상속), 인터페이스(다중 상속)
 * 	=모든 메소드가 abstract => 선언만 가능
 * 		**JDK 1.8부터 default메소드를 이용하여 메소드 구현 가능
 * 	=변수 (추상클래스 : 멤버변수, 인터페이스 : 상수형변수)
 * 		int a;(x) => int a=10; (o)
 * 	=interface A
 * 	 {
 * 		*변수
 * 		int a=10;  =>  JVM (public static final int a=10)
 * 		*메소드
 * 		void aaa(); =>  JVM (public abstract void aaa();)
 * 		int bbb ();
 * 	 }
 *  =interface A
 * 	 {
 * 		(public abstract)void aaa();
 * 	 }
 *   구현
 *   class B implements A
 * 	 {
 * 		public void aaa();{}
 * 	 }
 * ***
 * 	=> 인터페이스에 선언된 모든 메소드는 public이다
 * 	=> 인터페이스에 선언된 모든 변수는 public이며 상수다
 * 
 * 상속
 * 	인터페이스 => 인터페이스 : extends
 * 	인터페이스 => 클래스 : implements
 * 	클래스 => 인터페이스 : 에러!!! (인터페이스는 클래스를 상속받을 수 없다)
 * 
 * interface A
 * interface B
 * class C implements A,B => 다중상속
 * ==================================
 * interface A
 * class B
 * class C extends B implements A
 * 	인터페이스는 모든 메소드가 구현이 안된다
 */
interface 동물{
	void eat();
	default void run() {System.out.println("네발로 걷는다");} //JDK1.8 이상부터 가능, 그 이하는 오류
}
class 소 implements 동물{
	public void eat() {System.out.println("소같이 먹는다");}
	}

class 개 implements 동물{
	public void eat() {System.out.println("개같이 먹는다");}
}
class 돼지 implements 동물{
	public void eat() {System.out.println("돼지같이 먹는다");}
}
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		동물 ani=new 소();
		ani.eat();
		ani=new 개();
		ani.eat();
		ani=new 돼지();
		ani.eat();

	}

}
