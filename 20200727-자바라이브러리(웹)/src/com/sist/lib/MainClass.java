package com.sist.lib;
import java.util.*;
import java.text.*; //변환(시간,날짜) => SimpleDateFormat()
import java.util.Date;

/*
 *  라이브러리 => import
 *  1. java.lang
 *  	=Object : 최상위 클래스
 *  		=clone() : 복제
 *  		=finalize : 소멸자
 *  		=toString() : 객체를 문자열로 변환
 *  	=String (StringBuffer)
 *  		=substring() : 문자 추출
 *  		=indexOf(),lastIndexOf() : 문자 찾기
 *  		=trim() : 양 옆 공백 제거
 *  		=equals() : 실제 저장된 문자열 값 비교
 *  		=length() : 문자 개수
 *  		=valueOf() : 유일한 static, 모든 데이터형을 문자열로 변화
 *  		=join() : 변환
 *  	***StringBuffer 
 *  		=append() : 문자열
 *  	=Wrapper : 클래스 형변환, 문자열을 다른 데이터형으로 변경
 *  		=Integer 
 *  			=parseInt() : 정수형 변환
 *  		=Double 
 *  			=parseDouble() : 실수형 변환
 *  		=Boolean 
 *  			=parseBoolean() : true <=> false
 *  	=Math
 *  		=random() : 랜덤
 *  		=ceil() : 올림
 *  	=System
 *  		=gc() : 메모리 회수
 *  		=exit() : 프로그램 종료
 *  2. java.util
 *  	=StringTokenizer : 문자 분해  / **split() : 정규식 사용
 *  		=nextToken() : 한 개의 구분문자를 자른다
 *  		=jasMoreTokens() : 자른 개수만큼 루프
 *  	=Date : 시스템의 시간, 날짜 읽기
 *  		Date date=new Date()
 *  		date.toString()
 *  	=Calendar : 요일 구하기, 달의 마지막 날짜 읽기
 *  		날짜 등록 => 월(1~) : month-1
 *  			  => 요일 : week-1
 *  	=Collection : 모든 클래스, 데이터를 한 번에 저장 , 가변 / Object로 형변환 됨 => 제네릭스 <원하는 데이터형> : 데이터형 통일
 *  		=ArrayList : 비동기화(데이터베이스), 속도빠름
 *  		=Vector : 동기화(네트워크 사용자 관리)
 *  		=HashMap : 키(일반 문자열),값(클래스 주소) 저장 => 클래스 관리
 *  
 */
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date date=new Date();
		System.out.println(date.toString()); //표준시간 읽기
		//변환
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd hh:mm:ss"); //MM:월,mm:분
		System.out.println(sdf.format(date));

	}

}
