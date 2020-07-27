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
		day=day.substring(0,day.lastIndexOf("|")); //¸¶Áö¸· '|'Á¦°Å
		
		System.out.println(day);
		
		//³¯Â¥º° ºĞ¸®
		String[] resdays=day.split("\\|"); //splitÀº String regex·Î '|'´Â Á¤±Ô½Ä¿¡¼­ »ç¿ëÁßÀÌ±â ¶§¹®¿¡ \\¸¦ »ç¿ëÇØ¾ß '|' ÀÚÃ¼¸¦ »ç¿ë °¡´É
		/*
		 * String regex´Â Á¤±Ô½Ä¿¡¼­ »ç¿ëÇÏ´Â ¹®ÀÚ¸¦ »ç¿ëÇÏ°í ½ÍÀ¸¸é ¾Õ¿¡ '\\' ºÙ¿©¾ß ÇÔ
		 * 	Á¤±Ô½Ä
		 * 	^ : ½ÃÀÛ¹®ÀÚ   ex) ^[°¡-ÆR] => '°¡'ºÎÅÍ ÇÑ±Û ÀüÃ¼    <====>[^°¡-ÆR] => ÇÑ±Û Á¦¿Ü
 		 * 	$ : ³¡¹®ÀÚ  ex) A$ => A·Î ³¡³ª´Â ´Ü¾î
		 * 	. : ÀÓÀÇÀÇ ÇÑ±ÛÀÚ(¸ğµç ±ÛÀÚÁß)
		 * 	| : ¼±ÅÃ
		 * 	? : ÀÖÀ¸¸é Ãâ·Â, ¾øÀ¸¸é ¹ÌÃâ·Â
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
