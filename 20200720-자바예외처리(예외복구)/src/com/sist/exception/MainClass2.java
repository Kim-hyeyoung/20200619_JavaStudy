package com.sist.exception;

public class MainClass2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("���α׷� ����");
		try
		{
			System.out.println("���� ���� int i=10");
			System.out.println("���� ���� int j=0");
			System.out.println(10/0);
			System.out.println("����� ���:"+(10/0));
		}
		catch(Exception e)
		{
			System.out.println("������ ���� �߻� (/zero)");
		}
		finally
		{
			System.out.println("�ٽ� �Է��Ͻÿ�");
		}
		System.out.println("���α׷� ����!!");

	}

}
