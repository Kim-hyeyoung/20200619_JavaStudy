/*
 *  �޼ҵ� : �Ѱ��� ��ɸ� ���� => ������ �ٽ� ����� �� �ֵ��� �����
 *  ����
 *  	=����
 *  	=�ݺ� ����
 *  ����)	
 *  	��ȯ���� ���� ��� : void
 *  	�Ű������� ���� ��� : (�Ű����� => �ַ� ����ڰ� ��û�� ��)
 *  	��ȯ���� ����  : ����ڰ� ��û�� ������ ����� => �ݵ�� �� ���� ����
 *  										�������� ��� : �迭, Ŭ����
 *  	�Ű������� ���� : ���̵� �ߺ�üũ, �����ȣ �˻�
 *  
 *  	��ȯ��(������) �޼ҵ��(�Ű�����,�Ű�����..)
 *  	{
 *  		return(����) => ��ġ�� �� �������� �ƴϴ�(�߰����� ����ؼ� ���� ����)
 *  	}
 *  ex) void process()
 *  {
 *  	if(key==ENTER)
 *  		{
 *  			return;  // ������ ����
 *  		}
 *  	����
 *  	return; => return ���� �ؿ��� �ҽ� �ڵ��� �� �� ����
 *  }
 *  	ȣ��
 *  	int a=add(10,20)
 *  	void add(int a,int b)
 *  	add(10,20)
 *  	ȣ��ø��� �޼ҵ� ó������ return���� ���� => �ٽ� ȣ���� ��ġ�� ���ƿ´�
 *  
 *  
 *  
 *  
 */
//����ڰ� ������ �Է��ϸ� ���⿩�� Ȯ��
import java.util.*;
public class �ڹٸ޼ҵ� {
	//����� ���� �Է� �޼ҵ�
	static int userInput()
	{
		Scanner scan=new Scanner(System.in);
		System.out.print("������ �Է�:");
		int year=scan.nextInt();
		return year;
	}
	//���⿩�θ� Ȯ���ϴ� �޼ҵ� => ����
	static boolean isYear(int year)
	{
		boolean bCkeck=false;
		if((year%4==0 && year%100!=0) || (year%400==0))
		{
			bCkeck=true;
		}
		else
		{
			bCkeck=false;
		}
		return bCkeck;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		Scanner scan=new Scanner(System.in);
		System.out.print("������ �Է�:");
		int year=scan.nextInt();
		
		if((year%4==0 && year%100!=0) || (year%400==0))
		{
			System.out.println(year+"�⵵�� �����Դϴ�");
		}
		else
		{
			System.out.println(year+"�⵵�� ������ �ƴմϴ�");
		}
		*/
		int year=userInput();
		boolean bCheck=isYear(year);
		if(bCheck==true)
			System.out.println("�����Դϴ�");
		else
			System.out.println("������ �ƴմϴ�");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
