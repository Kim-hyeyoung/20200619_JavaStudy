package com.sist.ann;
import java.lang.reflect.Method;
import java.util.*;
public class UserMain2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.print("��û:");
		String ss=scan.next();
		try
		{
			Class clsName=Class.forName("com.sist.ann.MovieModel");
			//Ŭ���� ���� �б�
			Object obj=clsName.newInstance();//�޸� �Ҵ�
			//�޼ҵ� ã��
			Method[] methods=clsName.getDeclaredMethods(); //�迭�ȿ� 5���� �޼ҵ尡 �� �������
			for(Method m:methods)
			{
				//System.out.println(m.getName()); //������� ��µ��� ���� => �Է��� ������� ����x
				RequestMapping rm=m.getAnnotation(RequestMapping.class);
				if(rm.value().equals(ss)) //rm.value()=>�޼ҵ� ������ || ss=> ����� �Է°�
				{
					m.invoke(obj, null); //�޼ҵ� �̸� ���� ã�� �� ���� (Ŭ���� �̸� �˰� ������)
				}
			}
		}catch(Exception ex){}

	}

}
