package com.sist.io;
/*
 * 파일에 쓰기 => 회원가입, 댓글, 게시판
 * 1. 파일에 저장 => ArrayList
 * 2. 데이터를 ArrayList에 모아서 저장
 */
import java.io.*;
public class MainClass2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 파일 입출력
		 * r = read
		 * w = write
		 * a = append
		 * 
		 * FileOutputStream(1byte)
		 * 생성자
		 * 	new FileOutputStream("경로명") => false 생략중
		 * 	new FileOutputStream("경로명",true/false) => false가 디폴트
		 * FileWriter(2byte)
		 * 	
		 */
		//FileOutputStream fos=null; //한글자씩 저장
		FileWriter fos=null; //
		try
		{
			//생성
			//fos=new FileOutputStream("c:\\javaDev\\temp.txt",true); //true를 붙이면 append 모드로 기존값 지우지 않고 뒤에 붙여서 저장
			fos=new FileWriter("c:\\javaDev\\temp.txt",true);
			//저장
			//String str="ABCDEFGHIJ"; //한번에 여러글자 저장
			String str="ABCDEFGHIJ"; 
			//fos.write('L');
			//fos.write('M');
			//fos.write('N');
			//fos.write(str.getBytes()); //getBytes() : 문자열을 바이트 배열로 변경할 때 사용
			fos.write(str+"\r\n");//다음줄에 저장
			System.out.println("저장완료!!"); //기존값 있으면 덮어쓰기
		}catch(Exception ex) 
		{
			System.out.println(ex.getMessage());
		}finally //파일 닫기, 서버 닫기, 오라클 연결 해제
		{
			try
			{
				fos.close();
			}catch(Exception ex) {}
		}

	}

}
