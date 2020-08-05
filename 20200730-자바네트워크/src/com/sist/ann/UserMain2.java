package com.sist.ann;
import java.lang.reflect.Method;
import java.util.*;
public class UserMain2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.print("요청:");
		String ss=scan.next();
		try
		{
			Class clsName=Class.forName("com.sist.ann.MovieModel");
			//클래스 정보 읽기
			Object obj=clsName.newInstance();//메모리 할당
			//메소드 찾기
			Method[] methods=clsName.getDeclaredMethods(); //배열안에 5개의 메소드가 다 들어있음
			for(Method m:methods)
			{
				//System.out.println(m.getName()); //순서대로 출력되지 않음 => 입력한 순서대로 저장x
				RequestMapping rm=m.getAnnotation(RequestMapping.class);
				if(rm.value().equals(ss)) //rm.value()=>메소드 구분자 || ss=> 사용자 입력값
				{
					m.invoke(obj, null); //메소드 이름 몰라도 찾을 수 있음 (클래스 이름 알고 있으면)
				}
			}
		}catch(Exception ex){}

	}

}
