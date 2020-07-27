package com.sist.util;
import java.util.*;
public class MainClass3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random r=new Random();
		int[] resDay=new int[r.nextInt(10)+5];
		
		String day="";
		for(int i=0;i<resDay.length;i++)
		{
			resDay[i]=r.nextInt(31)+1;
			day+=resDay[i]+"|";
		}
		day=day.substring(0,day.lastIndexOf("|")); //마지막 '|'제거
		
		System.out.println(day);
		
		//날짜별 분리
		String[] resdays=day.split("\\|"); //split은 String regex로 '|'는 정규식에서 사용중이기 때문에 \\를 사용해야 '|' 자체를 사용 가능
		/*
		 * String regex는 정규식에서 사용하는 문자를 사용하고 싶으면 앞에 '\\' 붙여야 함
		 * 	정규식
		 * 	^ : 시작문자   ex) ^[가-힣] => '가'부터 한글 전체    <====>[^가-힣] => 한글 제외
 		 * 	$ : 끝문자  ex) A$ => A로 끝나는 단어
		 * 	. : 임의의 한글자(모든 글자중)
		 * 	| : 선택
		 * 	? : 있으면 출력, 없으면 미출력
		 */
		
		for(String s:resdays)
		{
			System.out.println(s);
		}
		 
		System.out.println("=========");
		StringTokenizer st=new StringTokenizer(day,"|");
		while(st.hasMoreTokens())
		{
			System.out.println(st.nextToken());
		}
		
		
	}

}
