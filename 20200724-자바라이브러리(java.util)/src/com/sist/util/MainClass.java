package com.sist.util;

import java.util.Random;

/*
 * java.util : 프로그램에서 많이 사용하는 클래스의 집합, 반드시import 사용
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
	 * Random() : 난수 발생(임의의 수를 컴퓨터가 결정)
	 * 	=> 정수 : nextInt() : 0~21억 4천(int 범위)
	 * 			nextInt(int n) : 오버로딩, 지정된 범위 사이의 수가 나온다(n번은 제외)  ex) nextInt(100) => 0~99
	 * 			================================================================================  static이 아니다! 인스턴스!!
	 * static => Random.nextInt() => 컴파일과 동시에 저장
	 * instance => Random r=new Random(); => 메모리 할당시에 저장
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
		MainClass m=new MainClass(); //=> m에 random 저장
		m.random();
		MainClass m1=new MainClass(); //=> m1에 random 저장
		m1.random();
		//사용자 정의 메소드는 자동 호출이 없다
		
		
		
	}

}
