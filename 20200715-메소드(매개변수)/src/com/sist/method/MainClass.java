package com.sist.method;
class AA
{
	public void AA() //void�� ������ �Ϲ� �ν��Ͻ� �޼ҵ尡 ��(������x) /void => return��(�������x)
	{
		System.out.println("AA() Call...");
	}
	public AA() //������ ȣ�� ����
	{
		System.out.println("AA() Call...");
	}
}

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AA a=new AA();
		a.AA();

	}

}
