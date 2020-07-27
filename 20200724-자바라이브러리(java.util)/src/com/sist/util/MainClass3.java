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
		day=day.substring(0,day.lastIndexOf("|")); //������ '|'����
		
		System.out.println(day);
		
		//��¥�� �и�
		String[] resdays=day.split("\\|"); //split�� String regex�� '|'�� ���ԽĿ��� ������̱� ������ \\�� ����ؾ� '|' ��ü�� ��� ����
		/*
		 * String regex�� ���ԽĿ��� ����ϴ� ���ڸ� ����ϰ� ������ �տ� '\\' �ٿ��� ��
		 * 	���Խ�
		 * 	^ : ���۹���   ex) ^[��-�R] => '��'���� �ѱ� ��ü    <====>[^��-�R] => �ѱ� ����
 		 * 	$ : ������  ex) A$ => A�� ������ �ܾ�
		 * 	. : ������ �ѱ���(��� ������)
		 * 	| : ����
		 * 	? : ������ ���, ������ �����
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
