package com.sist.exception;
/*
 * 다중 처리 : 예상되는 에러가 여러 개 있는 경우
 * try
 * {
 * 		정상적으로 실행되는 문장
 * }
 * catch (예상되는 예외클래스)
 * {
 * 		에러처리
 * }
 * catch
 * {
 * 
 * }
 * catch
 * {
 * 
 * }
 * 
 * catch를 여러 개 사용하는 경우 순서 존재
 * 예외처리 계층구조
 * 		최상위 클래스 : 모든 클래스의 상위 클래스
 * 		object
 * 		   |
 * 		Throwable
 * -----------------------
 * |				     |
 * error			Exception
 * 				-------------------------
 * 				|						|
 * 			checkException			uncheckException
 * 				...						|
 * 									RuntimeException => 생략
 * 										|
 * 									   ....
 * 
 * => 상위 클래스일 수록 오류 처리는 아래로.
 * => Exception 하나만 써도 전체 오류 처리 가능!!
 */
public class MainClass4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//try
		//{
			
		//}catch(RuntimeException e) // 예상 못했던 에러 처리 / 밑의 세 개의 catch문은 runtime에서 처리한 에러여서 쓸 필요가 없음
		//{
			
		//}catch(NumberFormatException e)
		//{
			
		//}catch(ArrayIndexOfBoundsException e)
		//{
			
		//}catch(ArithmeticException e) 
		// 위에서부터 순차적으로 catch문 처리
		
		//===========================================
		
		try
		{
			int[] arr=new int[2];
			arr[0]=100;
			arr[2]=2; //error => ArrayIndexOutOfBoundsException e로 처리 / 없으면 RuntimeException e로 처리
		}catch(NumberFormatException e)
		{
			System.out.println("정수전환 안됨");
		}catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("배열 범위 벗어남");
		}catch(ArithmeticException e) 
		{
			System.out.println("0으로 나눌 경우");
		}catch(RuntimeException e) //예상 못했던 에러 발생 처리
		{
			System.out.println("실행시 모든 에러를 처리");
		}catch(Exception e) // exception 모두 처리 가능
		{
			System.out.println("수정이 가능한 모든 에러를 처리");
		}catch(Throwable e) // error, exception 모두 처리 가능
		{
			System.out.println("예외와 에러를 동시 처리");
		} 
		
				
		
		
		
	}

}
