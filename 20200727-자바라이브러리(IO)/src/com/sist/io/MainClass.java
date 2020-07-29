package com.sist.io;
/*
 *  IO(Input/Output)
 *  	저장  / 읽기
 *  	1. 메모리 입출력
 *  	2. 파일 입출력
 *  	3. 네트워크 입출력
 *  	=> 스트림 이용(데이터 통로) => 정확한 전송
 *  	       단방향(입력, 출력 통로가 다르다)
 *  	
 *  	= 1byte : 일반파일
 *  		바이트 스트림 (InputStream / OurputStream) => 업로드,다운로드
 *  	= 2byte : 문자 => 한글
 *  		문자 스트림 (*Reader / Writer)
 *  
 *  	= 객체자체를 저장 => 직렬화
 *  		=ObjectInputStream
 *  		=ObjectOutputStream
 *  
 *  	= 속도를 빠르게 => Buffer
 *  		*=BufferedInputStream
 *  		*=BufferedOutputStream
 *  
 *  => XML,JSON,CSV(별도 파싱 방법이 있음)
 *  
 *  ***주의점
 *  1. 반드시 import java.io.*
 *  2. 반드시 예외처리(checkException)
 *  
 *  **데이터 읽기 방법
 *  	1) 한 글자 읽기
 *  		int read() => 글자번호로 읽는다
 *  		ex) A => 65
 *  	2) 여러 개를 동시에 읽는 경우
 *  		int read() => 읽은 바이트 수만큼 리턴
 *  
 *   파일 읽기
 *  	=FileInputStream(1byte) => 한글이 있는 경우 깨짐
 *  		=> FileInputStream fis=new FileInputStream("절대경로명");
 *  		   while(파일 끝까지) =>-1(EOF)
 *  			{
 *  				출력
 *  			}
 *  			
 *  			fis.close();
 *  			============finally => try/catch 상관없이 수행
 *  	=FileReader(2byte)
 *  
 *  **데이터 쓰기(저장)
 *  	FileOutputStream
 *  		=write() : 한글자씩 저장
 *  
 *  IO
 *  =FileInputStream, FileReader
 *  =FileOutputStream, FileWriter
 *  =BufferedReader, BufferedWriter
 *  =ObjectInputStream/ObjectOutputStream
 *  =BufferedInputStream,BufferedOutputStream
 *  
 *  데이터
 *  	=정형화 데이터  : 구분o, 필요한 데이터만 ex) 오라클
 *  	=반정형화 데이터 : 구분은 되나 필요없는 데이터도 있음 ex) html,xml,json
 *  	====================================================================
 *  	=비정형화 데이터 : 구분x, 필요한 게 있을 수도 없을 수도, 필요없는 것도 있을 수도 ex) 뉴스, 트위터
 *  	==================================================================== => 비정형 데이터를 어떻게 필요한 부분만 => 빅데이터/지능형웹 => REGEX(정규식)
 *  		
 */
import java.io.*;
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//FileInputStream fis=new FileInputStream(""); => 이렇게 하면 에러(체크익센셥이라)
		//FileInputStream fis=null; //반드시 초기값을 부여
		//모든 클래스의 초기값=null
		FileReader fis=null; //한글포함 파일 읽을 때
		try
		{
			//파일 읽기
			//fis=new FileInputStream("c:\\javaDev\\news.txt");
			fis=new FileReader("c:\\javaDev\\news.txt"); //한글포함 파일 읽을 때
			//파일을 읽어서 도스창에 출력
			int i=0; //한글자씩 읽기 때문에 한글자씩 가지고 온다 => 문자번호! 그래서 char가 아닌 int => 실제 출력시 char로 변환해서 출력해야 함 (알파벳이나 숫자는 1byte라 상관없음)
			while((i=fis.read())!=-1) //-1 : EOF => 파일 끝
			{
				System.out.print((char)i);
			}
		}catch(Exception ex)
		{
			//에러처리
			System.out.println(ex.getMessage());
		}finally
		{
			//파일 닫기
			try {
				fis.close();
			}catch(Exception ex) {}
		}
		
		
		
		
		
		
		
		
	}

}
