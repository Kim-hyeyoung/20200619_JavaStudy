package com.sist.string;

import java.io.FileReader;
/*
 * StringBuffer : 동기화
 * StringBuilder : 비동기화 => 중간에 데이터 손실 가능성 있음
 * ============================================ 문자열 결합(빅데이터)
 */
public class MainClass5 {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		long start=System.currentTimeMillis();
		//StringBuffer sb=new StringBuffer();
		StringBuilder sb=new StringBuilder(); //StringBuffer()보다 빠름
		FileReader fr=new FileReader("c:\\javaDev\\movie.txt");
		int i=0;
		while((i=fr.read())!=-1) //-1 EOF(End Of File)
		{
			sb.append(String.valueOf((char)i));
		}
		fr.close();
		long end=System.currentTimeMillis();
		System.out.println("수행시간:"+(end-start));

	}

}
