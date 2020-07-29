package com.sist.io;
import java.io.*; //예외처리 필수(try~catch)
import java.util.*;
/*
 * 	FileInputStream, FileReader
 * 	FileOutputStream, FileWriter
 * 	BufferedReader, File
 * 
 *  자바프로그램
 *  자바 web프로그램(스프링)
 *  ================== 공통기반 (예외처리)
 */
public class MainClass4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ObjectInputStream ois=null;
		try 
		{
			ois=new ObjectInputStream(new FileInputStream("c:\\javaDev\\movie_test.txt"));
			//ArrayList<Movie> list=ois.readObject(); //클래스는 object로 넘겨지기 때문에 형변환 오류
			ArrayList<Movie> list=(ArrayList<Movie>)ois.readObject();
			//출력
			for(Movie m:list)
			{
				System.out.println(m.getMno()+" "+m.getTitle()+" "+m.getActor());
			}
		}catch(Exception ex)
		{
			System.out.println(ex.getMessage());
		}finally
		{
			try
			{
				ois.close();
			}catch(Exception ex) {}
		}
		
		
		
		

	}

}
