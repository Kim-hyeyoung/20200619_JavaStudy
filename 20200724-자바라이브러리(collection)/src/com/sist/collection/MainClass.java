package com.sist.collection;

import java.util.ArrayList;

/*
 * Collection
 * ========== �ڷᱸ��
 * �޸𸮿� �����ؼ� ���� ���ϰ� ��� ����
 * = ���Ǵ� ���α׷� : �����(CURD:�б�,����,����,����) /����:�޸�,��� ������ ������ ���� ==================== �б� : get() ����:size() ����:set() ����:remove() ����:add()
 * = ������ => �迭
 * = ����
 * 		1) ������ �ְ� �ߺ��� �����͸� �߰�
 * 			=> List(�������̽�) : ������ Ŭ���� => �����ͺ��̽�
 * 				=ArrayList** : �񵿱�ȭ(�������� �Ҿ���)
 * 				=Vector** : ����ȭ(�񵿱⺸�� �������� ����)
 * 				=LinkedList
 * 				=Queue
 * 				=Stack
 * 		2) ������ ���� �ߺ��� ���� �����͸� �߰� => Ž����
 * 			=> Set
 * 				=HashSet
 * 				=TreeSet
 * 		3) Ű,������ / �� ���� ���ÿ� ���� => Ŭ���� ����(Spring)
 * 			=> Map
 * 				=Hashtable
 * 				=HashMap**
 */
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList list=new ArrayList();
		/*
		 * list.add(10); list.add(10.5); list.add("ȫ�浿"); list.add('A');
		 * 
		 * int a=(int)list.get(0); double d=(double)list.get(1); String
		 * s=(String)list.get(2); char c=(char)list.get(3); // => ����ȯ ������ for�� ��� �Ұ�
		 * 
		 * System.out.println(a); System.out.println(d); System.out.println(s);
		 * System.out.println(c);
		 */
		
		list.add("ȫ�浿"); //0			list.add(1,"������"); �߰���
		list.add("��û��"); //1		    =>2
		list.add("�̼���"); //2  =>������       =>3
		list.add("�ڹ���"); //3  =>2		=>4
		list.add("������"); //4  =>3		=>5
		
		for(int i=0;i<list.size();i++)  //���������� ���缭 ����ϴ� ���� ���ϴ�!!!!
		{
			String name=(String)list.get(i);
			System.out.println(name);
		}
		System.out.println("=================");
		
		list.remove(2);  //�����Ǹ� �޺κ� �ε��� ��ȣ�� ���������� ���ĵ� => 3���� 2���� ��
		for(int i=0;i<list.size();i++)  //���������� ���缭 ����ϴ� ���� ���ϴ�!!!!
		{
			String name=(String)list.get(i);
			System.out.println(name);
		}
		
		System.out.println("=================");
		list.add(1,"������"); //�߰��Ǹ� �߰��� ��ȣ �޺κк��� �����ĵ� => 1���� 2���� ��
		for(int i=0;i<list.size();i++)  //���������� ���缭 ����ϴ� ���� ���ϴ�!!!!
		{
			String name=(String)list.get(i);
			System.out.println(name);
		}

	}

}
