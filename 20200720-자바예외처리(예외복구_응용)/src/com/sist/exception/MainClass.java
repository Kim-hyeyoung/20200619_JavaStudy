package com.sist.exception;
/*
 * ����ó��
 * 	1) ����ó�� (try~catch)
 * 	2) �ڹٿ��� �����ϴ� ����ó��
 * 		�ϳ��� : NumberFormationException...
 * 		������ : RuntimeException, Exception, Throwable => ����� ������ ��� �� ���� ó��
 * 	3) catch�� ������ ��� ����
 * 		=> �ش� ������ ã�� ��� ó������ ���������� �˻� => ����ó�� ������� �ڵ�
 * 	4) try���� ������ �߻��ϸ� �߻���ġ���� catch�� �̵� => ���� �ؿ� �ִ� �ҽ��� ������� �ʴ´�
 * 	5) ���� : ����üũ(����Ȯ��=>�ҽ�����) => �����
 * 	6) ����ó�� : ���� ������ ����
 * 	7) �ڹ��� ��� �ڵ��� ����ó���� ���� (��,����� ���� ����)
 * 		IO
 * 		system.out.println() : ����ó�� ���� ����
 * 		system.in.read() : ����ó�� ���� �Ұ���
 * 		���� ���������� Ư���� ��� ����ó�� �����ؾ� ��
 * 		===
 * 		���ǹ����� �ַ� ó�� => ���ǹ����� ó�� ����� ��� ����ó�� ���
 * 	8) ����ó���� �ݵ�� �ؾ��ϴ� Ŭ������ �����Ѵ�
 * 	   =====================
 * 		=> IO, ������, ��Ʈ��ũ, �����ͺ��̽� ����
 */
import javax.swing.*;
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
		String num1=JOptionPane.showInputDialog("ù��° ���� �Է�:");
		String num2=JOptionPane.showInputDialog("�ι�° ���� �Է�:");
		//�迭�� �Է�
		int[] arr=new int[2];
		//���ڿ��� ������ ��ȯ
		arr[0]=Integer.parseInt(num1);
		arr[1]=Integer.parseInt(num2);
		
		int result=arr[0]/arr[1];
		System.out.println("result="+result);
			
		}catch(RuntimeException e)
		{
			//System.out.println(e.getMessage()); //�����޼��� Ȯ��
			e.printStackTrace(); //���° ���� �������� Ȯ��
		}
		System.out.println("ó������ �ٽ� �Է�!");
		
	}
}
