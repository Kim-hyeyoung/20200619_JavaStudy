package com.sist.lib;
import java.util.*;
import java.text.*; //��ȯ(�ð�,��¥) => SimpleDateFormat()
import java.util.Date;

/*
 *  ���̺귯�� => import
 *  1. java.lang
 *  	=Object : �ֻ��� Ŭ����
 *  		=clone() : ����
 *  		=finalize : �Ҹ���
 *  		=toString() : ��ü�� ���ڿ��� ��ȯ
 *  	=String (StringBuffer)
 *  		=substring() : ���� ����
 *  		=indexOf(),lastIndexOf() : ���� ã��
 *  		=trim() : �� �� ���� ����
 *  		=equals() : ���� ����� ���ڿ� �� ��
 *  		=length() : ���� ����
 *  		=valueOf() : ������ static, ��� ���������� ���ڿ��� ��ȭ
 *  		=join() : ��ȯ
 *  	***StringBuffer 
 *  		=append() : ���ڿ�
 *  	=Wrapper : Ŭ���� ����ȯ, ���ڿ��� �ٸ� ������������ ����
 *  		=Integer 
 *  			=parseInt() : ������ ��ȯ
 *  		=Double 
 *  			=parseDouble() : �Ǽ��� ��ȯ
 *  		=Boolean 
 *  			=parseBoolean() : true <=> false
 *  	=Math
 *  		=random() : ����
 *  		=ceil() : �ø�
 *  	=System
 *  		=gc() : �޸� ȸ��
 *  		=exit() : ���α׷� ����
 *  2. java.util
 *  	=StringTokenizer : ���� ����  / **split() : ���Խ� ���
 *  		=nextToken() : �� ���� ���й��ڸ� �ڸ���
 *  		=jasMoreTokens() : �ڸ� ������ŭ ����
 *  	=Date : �ý����� �ð�, ��¥ �б�
 *  		Date date=new Date()
 *  		date.toString()
 *  	=Calendar : ���� ���ϱ�, ���� ������ ��¥ �б�
 *  		��¥ ��� => ��(1~) : month-1
 *  			  => ���� : week-1
 *  	=Collection : ��� Ŭ����, �����͸� �� ���� ���� , ���� / Object�� ����ȯ �� => ���׸��� <���ϴ� ��������> : �������� ����
 *  		=ArrayList : �񵿱�ȭ(�����ͺ��̽�), �ӵ�����
 *  		=Vector : ����ȭ(��Ʈ��ũ ����� ����)
 *  		=HashMap : Ű(�Ϲ� ���ڿ�),��(Ŭ���� �ּ�) ���� => Ŭ���� ����
 *  
 */
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date date=new Date();
		System.out.println(date.toString()); //ǥ�ؽð� �б�
		//��ȯ
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd hh:mm:ss"); //MM:��,mm:��
		System.out.println(sdf.format(date));

	}

}
