package com.sist.exception;

public class MainClass2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("프로그램 시작");
		try
		{
			System.out.println("정수 저장 int i=10");
			System.out.println("정수 저장 int j=0");
			System.out.println(10/0);
			System.out.println("결과값 출력:"+(10/0));
		}
		catch(Exception e)
		{
			System.out.println("나누기 문제 발생 (/zero)");
		}
		finally
		{
			System.out.println("다시 입력하시오");
		}
		System.out.println("프로그램 종료!!");

	}

}
