package com.sist.lib;
/*
 * ArrayList, Vector, Map 사용법
 */
import java.util.*;
public class MainClass2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//ArrayList<String> names=new ArrayList<String>(); //메모리에 String만 저장 가능
		//Vector<String> names=new Vector<String>();
		LinkedList<String> names=new LinkedList<String>(); //세가지 모두 실행 결과는 같으나 서로 장단점이 다르므로 떄에 따라 구분해서 사용
		names.add("홍길동"); //index번호 0
		names.add("심청이"); //1
		names.add("이순신"); //2
		names.add("강감찬"); //3
		names.add("춘향이"); //4
		
		//출력
		System.out.println("저장된 개수:"+names.size()); //저장된 개수 확인
		/*
		 * 원하는 위치에 출력
		 * add() => 5
		 * add(index,"값")
		 */
		names.add(3,"을지문덕"); //강감찬 대신 3번인덱스에 저장되고 기존 3,4번은 뒤로 밀리며 4,5번이 됨
		for(int i=0;i<names.size();i++)
		{
			//데이터형 지정
			String name=names.get(i); //원하는 위치에 저장된 데이터 읽기
			System.out.println(name+":"+i);
		}
		//삭제
		names.remove(2);//2번 삭제되고 뒷번호가 앞으로 땡겨짐
		//수정
		names.set(2, "박문수");
		//전체삭제
		names.clear();
		System.out.println("저장된 개수:"+names.size());
		

	}

}
