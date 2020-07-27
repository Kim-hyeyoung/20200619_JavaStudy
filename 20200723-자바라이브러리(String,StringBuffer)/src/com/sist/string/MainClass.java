package com.sist.string;
/*
 * java.lang
 * =========
 * 	String
 * 	StringBuffer
 * 
 * 	1) 모든 문자열은 주소다
 * 	2) 'char[]'을 제어하는 클래스
 * 	3) 주요 기능(메소드)
 * 		1) length() : 문자의 개수
 * 		2) trim() : 좌우의 공백 제거
 * 		3) substring() : 문자분해
 * 		4) indexOf(), lastIndexOf() : 문자의 위치 찾기
 * 		5) equals(), equalsIgnoreCase() : 저장된 문자 비교 / 대소문자 구분,비구분
 * 		6) 문자 찾기
 * 			포함 : contains => LIKE(DB)
 * 			시작 : startsWith
 * 			  끝  : endsWith
 * ==============================================여기까지 인스턴스 메소드
 * 		7) valueOf() : 모든 기본형을 문자열로 변환
 * =========================================여기는 스태틱 메소드
 * 
 */
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="background-image: url('https://mp-seoul-image-production-s3.mangoplate.com/0776fea76b4a824ff583128cb51dd45c.jpg');";
		String temp=s.substring(s.indexOf("'")+1,s.lastIndexOf("'"));
		System.out.println(temp.trim());
		
		String ss="카페안쪽으로 좌석이 더 있다. 안쪽이 좀 더 아늑해 안쪽으로 앉았다! 티라미수는 밑에 시트는 없고 크림과 코코아가루로 덮여져 있는데, 내스트다! ";
		if(ss.length()>20)
		{
			String sss=ss.substring(0,20)+"...";
			System.out.println(sss);
		}
		
		String s1="Hello";
		String s2="Hello";   //s1,s2는 동일주소
		String s3=new String("Hello"); //s3는 s1,s2 와 값은 같지만 다른 주소
		/*
		 * if(s1==s3) { System.out.println("s1==s2"); } else {
		 * System.out.println("s1!=s2"); }
		 */
		if(s1.equals(s3))
		{
			System.out.println("s1==s3");
		}
		else
		{
			System.out.println("s1!=s3");
		}
		

		
		
		
		
		
		
		
		
		
		
	}

}
