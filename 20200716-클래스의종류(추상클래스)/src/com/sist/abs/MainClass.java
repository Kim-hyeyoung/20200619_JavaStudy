package com.sist.abs;
/*
 * 추상 클래스
 * 	= 미완성된 클래스
 * 	=new를 사용해서 메모리 할당 불가능 => 구현된 클래스를 사용해서 메모리 할당 해야 함 / 도형 g=new 삼각형();
 * 	class A
 * 		=> A a=new A();
 * 	abstract class B
 * 		=> B b=new B(); => error!
 * 	=> 항상 상속을 내려 하위 클래스에서 구현한 다음에 사용
 * 	=> 기본 틀이 존재
 * 	=> 제시만 한다 => 구현하는 내용이 프로그램마다 다를 수 있기 때문
 */
abstract class 도형
{
	public abstract void draw();
	public void color()
	{
		System.out.println("검정색으로 그림 그리기");
	}
	//재정의
}
class 삼각형 extends 도형
{

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("삼각형 그리기");
	}
	
}
class 원 extends 도형
{

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("원 그리기");
	}

	@Override
	public void color() {
		System.out.println("빨간색으로 그리기");
	}
	
}
class 사각형 extends 도형
{

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("사각형 그리기");
	}
	
}
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		도형 g=new 삼각형();
		g.color();
		g.draw();
		
		g=new 사각형();
		g.color();
		g.draw();
		
		g=new 원();
		g.color();
		g.draw();

	}

}
