package com.sist.exception;
/*
 * ���� ó�� : ����Ǵ� ������ ���� �� �ִ� ���
 * try
 * {
 * 		���������� ����Ǵ� ����
 * }
 * catch (����Ǵ� ����Ŭ����)
 * {
 * 		����ó��
 * }
 * catch
 * {
 * 
 * }
 * catch
 * {
 * 
 * }
 * 
 * catch�� ���� �� ����ϴ� ��� ���� ����
 * ����ó�� ��������
 * 		�ֻ��� Ŭ���� : ��� Ŭ������ ���� Ŭ����
 * 		object
 * 		   |
 * 		Throwable
 * -----------------------
 * |				     |
 * error			Exception
 * 				-------------------------
 * 				|						|
 * 			checkException			uncheckException
 * 				...						|
 * 									RuntimeException => ����
 * 										|
 * 									   ....
 * 
 * => ���� Ŭ������ ���� ���� ó���� �Ʒ���.
 * => Exception �ϳ��� �ᵵ ��ü ���� ó�� ����!!
 */
public class MainClass4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//try
		//{
			
		//}catch(RuntimeException e) // ���� ���ߴ� ���� ó�� / ���� �� ���� catch���� runtime���� ó���� �������� �� �ʿ䰡 ����
		//{
			
		//}catch(NumberFormatException e)
		//{
			
		//}catch(ArrayIndexOfBoundsException e)
		//{
			
		//}catch(ArithmeticException e) 
		// ���������� ���������� catch�� ó��
		
		//===========================================
		
		try
		{
			int[] arr=new int[2];
			arr[0]=100;
			arr[2]=2; //error => ArrayIndexOutOfBoundsException e�� ó�� / ������ RuntimeException e�� ó��
		}catch(NumberFormatException e)
		{
			System.out.println("������ȯ �ȵ�");
		}catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("�迭 ���� ���");
		}catch(ArithmeticException e) 
		{
			System.out.println("0���� ���� ���");
		}catch(RuntimeException e) //���� ���ߴ� ���� �߻� ó��
		{
			System.out.println("����� ��� ������ ó��");
		}catch(Exception e) // exception ��� ó�� ����
		{
			System.out.println("������ ������ ��� ������ ó��");
		}catch(Throwable e) // error, exception ��� ó�� ����
		{
			System.out.println("���ܿ� ������ ���� ó��");
		} 
		
				
		
		
		
	}

}
