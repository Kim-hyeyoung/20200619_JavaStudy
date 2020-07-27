package com.sist.util;

import java.util.StringTokenizer;

/*
 * StringTokenizer : �ܾ�� �и�
 * 	= hasMoreTokens()
 * 	= nextToken()
 * 
 * String msg="Red,Green,Blue,Black,Yellow";
 * => StringTokenizer st=new StringTokenizer(msg,","); => ","�� �����Ͽ� �ڸ���
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
 *   !st.nextToken()�� ���� �ʰ��� ����!
 *    
 *   StringTokenizer st=new StringTokenizer(msg); => �������� �ڸ���
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
		//String color6=st.nextToken(); //!st.nextToken()�� ���� �ʰ��� ����!
		
		System.out.println(color1);
		System.out.println(color2);
		System.out.println(color3);
		System.out.println(color4);
		System.out.println(color5);
		//System.out.println(color6); //!st.nextToken()�� ���� �ʰ��� ����!
		
		st=new StringTokenizer(msg,",");
		while(st.hasMoreTokens())
		{
			System.out.println(st.nextToken());
		}
		
		
		
		
	}

}
