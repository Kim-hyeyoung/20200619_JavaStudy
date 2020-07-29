package com.sist.io;
/*
 *  IO(Input/Output)
 *  	����  / �б�
 *  	1. �޸� �����
 *  	2. ���� �����
 *  	3. ��Ʈ��ũ �����
 *  	=> ��Ʈ�� �̿�(������ ���) => ��Ȯ�� ����
 *  	       �ܹ���(�Է�, ��� ��ΰ� �ٸ���)
 *  	
 *  	= 1byte : �Ϲ�����
 *  		����Ʈ ��Ʈ�� (InputStream / OurputStream) => ���ε�,�ٿ�ε�
 *  	= 2byte : ���� => �ѱ�
 *  		���� ��Ʈ�� (*Reader / Writer)
 *  
 *  	= ��ü��ü�� ���� => ����ȭ
 *  		=ObjectInputStream
 *  		=ObjectOutputStream
 *  
 *  	= �ӵ��� ������ => Buffer
 *  		*=BufferedInputStream
 *  		*=BufferedOutputStream
 *  
 *  => XML,JSON,CSV(���� �Ľ� ����� ����)
 *  
 *  ***������
 *  1. �ݵ�� import java.io.*
 *  2. �ݵ�� ����ó��(checkException)
 *  
 *  **������ �б� ���
 *  	1) �� ���� �б�
 *  		int read() => ���ڹ�ȣ�� �д´�
 *  		ex) A => 65
 *  	2) ���� ���� ���ÿ� �д� ���
 *  		int read() => ���� ����Ʈ ����ŭ ����
 *  
 *   ���� �б�
 *  	=FileInputStream(1byte) => �ѱ��� �ִ� ��� ����
 *  		=> FileInputStream fis=new FileInputStream("�����θ�");
 *  		   while(���� ������) =>-1(EOF)
 *  			{
 *  				���
 *  			}
 *  			
 *  			fis.close();
 *  			============finally => try/catch ������� ����
 *  	=FileReader(2byte)
 *  
 *  **������ ����(����)
 *  	FileOutputStream
 *  		=write() : �ѱ��ھ� ����
 *  
 *  IO
 *  =FileInputStream, FileReader
 *  =FileOutputStream, FileWriter
 *  =BufferedReader, BufferedWriter
 *  =ObjectInputStream/ObjectOutputStream
 *  =BufferedInputStream,BufferedOutputStream
 *  
 *  ������
 *  	=����ȭ ������  : ����o, �ʿ��� �����͸� ex) ����Ŭ
 *  	=������ȭ ������ : ������ �ǳ� �ʿ���� �����͵� ���� ex) html,xml,json
 *  	====================================================================
 *  	=������ȭ ������ : ����x, �ʿ��� �� ���� ���� ���� ����, �ʿ���� �͵� ���� ���� ex) ����, Ʈ����
 *  	==================================================================== => ������ �����͸� ��� �ʿ��� �κи� => ������/�������� => REGEX(���Խ�)
 *  		
 */
import java.io.*;
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//FileInputStream fis=new FileInputStream(""); => �̷��� �ϸ� ����(üũ�ͼ����̶�)
		//FileInputStream fis=null; //�ݵ�� �ʱⰪ�� �ο�
		//��� Ŭ������ �ʱⰪ=null
		FileReader fis=null; //�ѱ����� ���� ���� ��
		try
		{
			//���� �б�
			//fis=new FileInputStream("c:\\javaDev\\news.txt");
			fis=new FileReader("c:\\javaDev\\news.txt"); //�ѱ����� ���� ���� ��
			//������ �о ����â�� ���
			int i=0; //�ѱ��ھ� �б� ������ �ѱ��ھ� ������ �´� => ���ڹ�ȣ! �׷��� char�� �ƴ� int => ���� ��½� char�� ��ȯ�ؼ� ����ؾ� �� (���ĺ��̳� ���ڴ� 1byte�� �������)
			while((i=fis.read())!=-1) //-1 : EOF => ���� ��
			{
				System.out.print((char)i);
			}
		}catch(Exception ex)
		{
			//����ó��
			System.out.println(ex.getMessage());
		}finally
		{
			//���� �ݱ�
			try {
				fis.close();
			}catch(Exception ex) {}
		}
		
		
		
		
		
		
		
		
	}

}
