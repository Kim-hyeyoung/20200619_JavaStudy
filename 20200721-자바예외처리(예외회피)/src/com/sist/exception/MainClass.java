package com.sist.exception;
/*
 * ����ȸ��
 * 	= ������ ���� ������ �����ϰ� �����
 * 	   	��κ��� ���α׷��� ����ó�� => try~catch
 * 		==> API(�ڹ�,���̺귯��)
 * 	= ���α׷��Ӱ� ����ó���� ���� ���α׷��� �°� ó���ϵ��� ����
 * 	= ����
 * 		�޼ҵ�() throws ������ ���� Ŭ���� ���
 * 	ex) => �������� ���� ���� 
 * public void display() throws Exception, ArrayIndexOutOfBoundsException,NumberFormatException
 * {
 * }
 * 	=> ����ó���� ȣ���ϴ� �޼ҵ忡�� ó��
 */
public class MainClass {
public int div(int a,int b) throws ArithmeticException
{
	return a/b; //0���� ������ ���� �߻��� �� �ִ�(����)
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MainClass m=new MainClass(); //�ν��Ͻ� ����
		int res=m.div(10, 2); // throws ArithmeticException ����ó�� �������� => runtimeException ���� ����
		System.out.println(res);
		
		//throws Exception ���� ����ó�� �ʼ�!!!

	}

}
