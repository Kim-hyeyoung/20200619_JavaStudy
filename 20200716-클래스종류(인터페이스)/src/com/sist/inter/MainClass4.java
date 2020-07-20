package com.sist.inter;
interface A
{
	public void display();
}
public class MainClass4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 익명의 클래스=>인터페이스를 이용한 다형성 => 오버라이딩
		// class => implements 없이 인터페이스를 구현할 수 있다
		A a=new A() {
			public void display() {
				System.out.println("A:display:Call...");
			}
		};
		a.display();

	}

}
