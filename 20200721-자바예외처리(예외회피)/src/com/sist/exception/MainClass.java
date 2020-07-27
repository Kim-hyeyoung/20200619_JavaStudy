package com.sist.exception;
/*
 * 예외회피
 * 	= 에러에 대한 예측이 가능하게 만든다
 * 	   	대부분의 프로그램은 직접처리 => try~catch
 * 		==> API(자바,라이브러리)
 * 	= 프로그래머가 예외처리를 각자 프로그램에 맞게 처리하도록 유도
 * 	= 형식
 * 		메소드() throws 예측한 예외 클래스 등록
 * 	ex) => 순서없이 나열 가능 
 * public void display() throws Exception, ArrayIndexOutOfBoundsException,NumberFormatException
 * {
 * }
 * 	=> 예외처리는 호출하는 메소드에서 처리
 */
public class MainClass {
public int div(int a,int b) throws ArithmeticException
{
	return a/b; //0으로 나누면 에러 발생할 수 있다(예측)
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MainClass m=new MainClass(); //인스턴스 생성
		int res=m.div(10, 2); // throws ArithmeticException 오류처리 생략가능 => runtimeException 하위 계층
		System.out.println(res);
		
		//throws Exception 사용시 예외처리 필수!!!

	}

}
