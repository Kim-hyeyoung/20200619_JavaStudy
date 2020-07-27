package com.sist.util;

import java.util.StringTokenizer;

/*
 * StringTokenizer : 단어별로 분리
 * 	= hasMoreTokens()
 * 	= nextToken()
 * 
 * String msg="Red,Green,Blue,Black,Yellow";
 * => StringTokenizer st=new StringTokenizer(msg,","); => ","로 구분하여 자른다
 * 	  String color1=st.nextToken();
 * 	  String color2=st.nextToken();
 * 	  String color3=st.nextToken();
 * 	  String color4=st.nextToken();
 *    String color5=st.nextToken();
 *    
 *   ===============================
 *   
 *   String st="Red,Green,Blue,Black,Yellow";
 *   while(st.hasmoreTokens())
 *   {
 *   	String color=st.nextToken();
 *   }
 *   !st.nextToken()은 범위 초과시 에러!
 *    
 *   StringTokenizer st=new StringTokenizer(msg); => 공백으로 자르기
 */
public class MainClass1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String msg="Red,Green,Blue,Black,Yellow";
		StringTokenizer st=new StringTokenizer(msg,",");
		String color1=st.nextToken();
		String color2=st.nextToken();
		String color3=st.nextToken();
		String color4=st.nextToken();
		String color5=st.nextToken();
		//String color6=st.nextToken(); //!st.nextToken()은 범위 초과시 에러!
		
		System.out.println(color1);
		System.out.println(color2);
		System.out.println(color3);
		System.out.println(color4);
		System.out.println(color5);
		//System.out.println(color6); //!st.nextToken()은 범위 초과시 에러!
		
		st=new StringTokenizer(msg,",");
		while(st.hasMoreTokens())
		{
			System.out.println(st.nextToken());
		}
		
		
		
		
	}

}
