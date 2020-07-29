package com.sist.temp;
import java.io.*;
import java.util.*; //split, StringTokenizer
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//���� �б� => ����ó��
		FileReader fr=null; //���� �б�
		//���Ͽ� ���� : FileWriter => ���� ��Ʈ��(�ѱ� ����) => 2byte
		/*
		 * FileInputStream
		 * FileOutputStream
		 * =================> 1byte (png,jpg..zip)
		 */
		try
		{
			fr=new FileReader("c:\\javaDev\\daum_movie.txt"); //2byte,�ѱ��ھ�
			int i=0; //�ѱ��� �б� => ������ ��ȣ(�ƽ�Ű �ڵ� ��) => ������ü�� �ƴ϶� ������ ��ȣ�� �������� ������ char�� ��������� ��
			StringBuffer sb=new StringBuffer(); //���ڿ� ����
			while((i=fr.read())!=-1)
			{
				//System.out.print((char)i);
				sb.append(String.valueOf((char)i));
			}
			//���
			System.out.println(sb.toString());
		}catch(Exception ex) 
		{
			/*
			 *	���� ó�� => �����
			 *	���� �޼��� Ȯ�� : getMessage()
			 *	Trace => ���������� => �ش���ġ ã��  : printStackTrace()
			 */
			ex.printStackTrace();
		}finally
		{
			//���ϴݱ�, ������ ����, ��Ʈ��ũ ���� ����, ����Ŭ ���� ����
			try 
			{
				fr.close();
			} catch (Exception ex) {}
			
		}
		
		
		
		
		
	}

}
