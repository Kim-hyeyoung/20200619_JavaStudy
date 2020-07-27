package com.sist.string;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import java.util.*;
/*
 * Find
 * 	= 포함 : contains()
 * 	= 시작 문자열 : startsWith()
 * 	= 끝 문자열 : endsWith()
 */
public class MainClass2 {
	public void find(String ss) {
		try
		{
			for(int i=1;i<=3;i++)
			{
				Document doc=Jsoup.connect("https://movie.daum.net/premovie/released?reservationOnly=N&sort=reservation&page="+i).get();
				Elements title=doc.select("a.name_movie");
				for(int j=0;j<title.size();j++)
				{
					if(title.get(j).text().endsWith(ss)) //원하는 단어로 끝나는 문자 찾기
					//if(title.get(j).text().startsWith(ss)) 원하는 단어로 시작하는 문자 찾기 =>자동완성
					//if(title.get(j).text().contains(ss)) 포함되는 문자 찾기 => 검색
					{
						System.out.println(title.get(j).text());
					}
					
				}
			} //모든 페이지의 데이터 가져오기
			
			
		}catch(Exception ex) {}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MainClass2 m=new MainClass2();
		Scanner scan=new Scanner(System.in);
		System.out.print("검색어:");
		String ss=scan.next();
		m.find(ss);

	}

}
