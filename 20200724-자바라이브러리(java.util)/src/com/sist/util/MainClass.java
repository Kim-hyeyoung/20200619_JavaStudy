package com.sist.util;

import java.util.Random;

/*
 * java.util : ���α׷����� ���� ����ϴ� Ŭ������ ����, �ݵ��import ���
 * 
 * Random
 * StringTokenizer
 * Date
 * Calendar
 * ArrayList, Vector
 * HashMap
 * ====================
 * 		=regex
 * 		=reflect
 */
public class MainClass {
	/*
	 * Random() : ���� �߻�(������ ���� ��ǻ�Ͱ� ����)
	 * 	=> ���� : nextInt() : 0~21�� 4õ(int ����)
	 * 			nextInt(int n) : �����ε�, ������ ���� ������ ���� ���´�(n���� ����)  ex) nextInt(100) => 0~99
	 * 			================================================================================  static�� �ƴϴ�! �ν��Ͻ�!!
	 * static => Random.nextInt() => �����ϰ� ���ÿ� ����
	 * instance => Random r=new Random(); => �޸� �Ҵ�ÿ� ����
	 * 				r.nextInt();
	 * 
	 * 
	 */
	public void random() {
		Random r=new Random();
		int a=r.nextInt();
		System.out.println(a);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MainClass m=new MainClass(); //=> m�� random ����
		m.random();
		MainClass m1=new MainClass(); //=> m1�� random ����
		m1.random();
		//����� ���� �޼ҵ�� �ڵ� ȣ���� ����
		
		
		
	}

}
