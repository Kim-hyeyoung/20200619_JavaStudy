package com.sist.temp;
import java.io.*;
import java.util.*;
public class MainClass3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			//�����б�
			FileReader fr=new FileReader("c:\\javaDev\\daum_movie.txt");
			int i=0;
			//�����͸� ������ ���ڿ�
			String data="";
			while((i=fr.read())!=-1)
			{
				data+=String.valueOf((char)i);
			}
			fr.close(); //���� �ݱ�
			System.out.println(data);
			/*
			 * ���ں���
			 * 1.���پ�(��ȭ �ϳ�)
			 */
			/*String[] movies=data.split("\n");
			for(String s:movies)
			{
				System.out.println(s);
				System.out.println("=============================================");
			}*/
			StringTokenizer st=new StringTokenizer(data,"\n");
			while(st.hasMoreTokens())
			{
				System.out.println(st.nextToken());
				System.out.println("=============================================");
			}
		}catch(Exception ex)
		{
			System.out.println(ex.getMessage());
		}

	}

}
