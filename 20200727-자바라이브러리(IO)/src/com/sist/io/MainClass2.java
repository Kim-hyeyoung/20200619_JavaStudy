package com.sist.io;
/*
 * ���Ͽ� ���� => ȸ������, ���, �Խ���
 * 1. ���Ͽ� ���� => ArrayList
 * 2. �����͸� ArrayList�� ��Ƽ� ����
 */
import java.io.*;
public class MainClass2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * ���� �����
		 * r = read
		 * w = write
		 * a = append
		 * 
		 * FileOutputStream(1byte)
		 * ������
		 * 	new FileOutputStream("��θ�") => false ������
		 * 	new FileOutputStream("��θ�",true/false) => false�� ����Ʈ
		 * FileWriter(2byte)
		 * 	
		 */
		//FileOutputStream fos=null; //�ѱ��ھ� ����
		FileWriter fos=null; //
		try
		{
			//����
			//fos=new FileOutputStream("c:\\javaDev\\temp.txt",true); //true�� ���̸� append ���� ������ ������ �ʰ� �ڿ� �ٿ��� ����
			fos=new FileWriter("c:\\javaDev\\temp.txt",true);
			//����
			//String str="ABCDEFGHIJ"; //�ѹ��� �������� ����
			String str="ABCDEFGHIJ"; 
			//fos.write('L');
			//fos.write('M');
			//fos.write('N');
			//fos.write(str.getBytes()); //getBytes() : ���ڿ��� ����Ʈ �迭�� ������ �� ���
			fos.write(str+"\r\n");//�����ٿ� ����
			System.out.println("����Ϸ�!!"); //������ ������ �����
		}catch(Exception ex) 
		{
			System.out.println(ex.getMessage());
		}finally //���� �ݱ�, ���� �ݱ�, ����Ŭ ���� ����
		{
			try
			{
				fos.close();
			}catch(Exception ex) {}
		}

	}

}
