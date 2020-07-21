package com.sist.exception;
/*
 * 예외처리
 * 	1) 직접처리 (try~catch)
 * 	2) 자바에서 제공하는 예외처리
 * 		하나만 : NumberFormationException...
 * 		여러개 : RuntimeException, Exception, Throwable => 실행시 에러를 묶어서 한 번에 처리
 * 	3) catch는 여러개 사용 가능
 * 		=> 해당 에러를 찾는 경우 처음부터 마지막까지 검색 => 예외처리 순서대로 코딩
 * 	4) try에서 에러가 발생하면 발생위치에서 catch로 이동 => 에러 밑에 있는 소스는 실행되지 않는다
 * 	5) 목적 : 에러체크(에러확인=>소스변경) => 디버깅
 * 	6) 예외처리 : 수정 가능한 에러
 * 	7) 자바의 모든 코딩은 예외처리가 존재 (단,실행시 생략 가능)
 * 		IO
 * 		system.out.println() : 예외처리 생략 가능
 * 		system.in.read() : 예외처리 생략 불가능
 * 		생략 가능하지만 특별한 경우 예외처리 가능해야 함
 * 		===
 * 		조건문으로 주로 처리 => 조건문으로 처리 어려운 경우 예외처리 사용
 * 	8) 예외처리를 반드시 해야하는 클래스가 존재한다
 * 	   =====================
 * 		=> IO, 쓰레드, 네트워크, 데이터베이스 관련
 */
import javax.swing.*;
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
		String num1=JOptionPane.showInputDialog("첫번째 정수 입력:");
		String num2=JOptionPane.showInputDialog("두번째 정수 입력:");
		//배열에 입력
		int[] arr=new int[2];
		//문자열을 정수로 전환
		arr[0]=Integer.parseInt(num1);
		arr[1]=Integer.parseInt(num2);
		
		int result=arr[0]/arr[1];
		System.out.println("result="+result);
			
		}catch(RuntimeException e)
		{
			//System.out.println(e.getMessage()); //에러메세지 확인
			e.printStackTrace(); //몇번째 줄이 에러인지 확인
		}
		System.out.println("처음부터 다시 입력!");
		
	}
}
