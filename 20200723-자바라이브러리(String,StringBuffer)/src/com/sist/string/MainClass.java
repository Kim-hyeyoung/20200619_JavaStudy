package com.sist.string;
/*
 * java.lang
 * =========
 * 	String
 * 	StringBuffer
 * 
 * 	1) ��� ���ڿ��� �ּҴ�
 * 	2) 'char[]'�� �����ϴ� Ŭ����
 * 	3) �ֿ� ���(�޼ҵ�)
 * 		1) length() : ������ ����
 * 		2) trim() : �¿��� ���� ����
 * 		3) substring() : ���ں���
 * 		4) indexOf(), lastIndexOf() : ������ ��ġ ã��
 * 		5) equals(), equalsIgnoreCase() : ����� ���� �� / ��ҹ��� ����,�񱸺�
 * 		6) ���� ã��
 * 			���� : contains => LIKE(DB)
 * 			���� : startsWith
 * 			  ��  : endsWith
 * ==============================================������� �ν��Ͻ� �޼ҵ�
 * 		7) valueOf() : ��� �⺻���� ���ڿ��� ��ȯ
 * =========================================����� ����ƽ �޼ҵ�
 * 
 */
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="background-image: url('https://mp-seoul-image-production-s3.mangoplate.com/0776fea76b4a824ff583128cb51dd45c.jpg');";
		String temp=s.substring(s.indexOf("'")+1,s.lastIndexOf("'"));
		System.out.println(temp.trim());
		
		String ss="ī��������� �¼��� �� �ִ�. ������ �� �� �ƴ��� �������� �ɾҴ�! Ƽ��̼��� �ؿ� ��Ʈ�� ���� ũ���� ���ھư���� ������ �ִµ�, ����Ʈ��! ";
		if(ss.length()>20)
		{
			String sss=ss.substring(0,20)+"...";
			System.out.println(sss);
		}
		
		String s1="Hello";
		String s2="Hello";   //s1,s2�� �����ּ�
		String s3=new String("Hello"); //s3�� s1,s2 �� ���� ������ �ٸ� �ּ�
		/*
		 * if(s1==s3) { System.out.println("s1==s2"); } else {
		 * System.out.println("s1!=s2"); }
		 */
		if(s1.equals(s3))
		{
			System.out.println("s1==s3");
		}
		else
		{
			System.out.println("s1!=s3");
		}
		

		
		
		
		
		
		
		
		
		
		
	}

}
