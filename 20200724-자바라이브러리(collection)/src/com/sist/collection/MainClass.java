package com.sist.collection;

import java.util.ArrayList;

/*
 * Collection
 * ========== 자료구조
 * 메모리에 저장해서 사용시 편리하게 사용 가능
 * = 사용되는 프로그램 : 입출력(CURD:읽기,저장,삭제,수정) /단점:메모리,모든 데이터 저장이 가능 ==================== 읽기 : get() 개수:size() 수정:set() 삭제:remove() 저장:add()
 * = 가변형 => 배열
 * = 종류
 * 		1) 순서가 있고 중복된 데이터를 추가
 * 			=> List(인터페이스) : 구현된 클래스 => 데이터베이스
 * 				=ArrayList** : 비동기화(빠르지만 불안정)
 * 				=Vector** : 동기화(비동기보다 느리지만 안정)
 * 				=LinkedList
 * 				=Queue
 * 				=Stack
 * 		2) 순서가 없고 중복이 없는 데이터를 추가 => 탐색기
 * 			=> Set
 * 				=HashSet
 * 				=TreeSet
 * 		3) 키,데이터 / 두 개를 동시에 저장 => 클래스 관리(Spring)
 * 			=> Map
 * 				=Hashtable
 * 				=HashMap**
 */
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList list=new ArrayList();
		/*
		 * list.add(10); list.add(10.5); list.add("홍길동"); list.add('A');
		 * 
		 * int a=(int)list.get(0); double d=(double)list.get(1); String
		 * s=(String)list.get(2); char c=(char)list.get(3); // => 형변환 때문에 for문 사용 불가
		 * 
		 * System.out.println(a); System.out.println(d); System.out.println(s);
		 * System.out.println(c);
		 */
		
		list.add("홍길동"); //0			list.add(1,"강감찬"); 추가시
		list.add("심청이"); //1		    =>2
		list.add("이순신"); //2  =>삭제시       =>3
		list.add("박문수"); //3  =>2		=>4
		list.add("춘향이"); //4  =>3		=>5
		
		for(int i=0;i<list.size();i++)  //데이터형을 맞춰서 사용하는 것이 편리하다!!!!
		{
			String name=(String)list.get(i);
			System.out.println(name);
		}
		System.out.println("=================");
		
		list.remove(2);  //삭제되면 뒷부분 인덱스 번호가 순차적으로 정렬됨 => 3번이 2번이 됨
		for(int i=0;i<list.size();i++)  //데이터형을 맞춰서 사용하는 것이 편리하다!!!!
		{
			String name=(String)list.get(i);
			System.out.println(name);
		}
		
		System.out.println("=================");
		list.add(1,"강감찬"); //추가되면 추가된 번호 뒷부분부터 재정렬됨 => 1번이 2번이 됨
		for(int i=0;i<list.size();i++)  //데이터형을 맞춰서 사용하는 것이 편리하다!!!!
		{
			String name=(String)list.get(i);
			System.out.println(name);
		}

	}

}
