package com.sist.lib;
/*
 * ArrayList, Vector, Map ����
 */
import java.util.*;
public class MainClass2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//ArrayList<String> names=new ArrayList<String>(); //�޸𸮿� String�� ���� ����
		//Vector<String> names=new Vector<String>();
		LinkedList<String> names=new LinkedList<String>(); //������ ��� ���� ����� ������ ���� ������� �ٸ��Ƿ� ���� ���� �����ؼ� ���
		names.add("ȫ�浿"); //index��ȣ 0
		names.add("��û��"); //1
		names.add("�̼���"); //2
		names.add("������"); //3
		names.add("������"); //4
		
		//���
		System.out.println("����� ����:"+names.size()); //����� ���� Ȯ��
		/*
		 * ���ϴ� ��ġ�� ���
		 * add() => 5
		 * add(index,"��")
		 */
		names.add(3,"��������"); //������ ��� 3���ε����� ����ǰ� ���� 3,4���� �ڷ� �и��� 4,5���� ��
		for(int i=0;i<names.size();i++)
		{
			//�������� ����
			String name=names.get(i); //���ϴ� ��ġ�� ����� ������ �б�
			System.out.println(name+":"+i);
		}
		//����
		names.remove(2);//2�� �����ǰ� �޹�ȣ�� ������ ������
		//����
		names.set(2, "�ڹ���");
		//��ü����
		names.clear();
		System.out.println("����� ����:"+names.size());
		

	}

}
