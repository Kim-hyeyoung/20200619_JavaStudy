/*
 * ���ڿ� �� : equals()
 * ���� ã�� : contains()
 * ���� ���ڿ� : startsWith()
 * ������ ���ڿ� : endsWith()
 * ���ڿ� �ڸ��� : substring()
 * ���� ���� : charAt()
 * ������ ���� :length()
 * ���鹮�� ���� : trim()
 * ������ ��ġ ã�� : indexOf(), lastIndexOf()
 * ����ȯ : valueOf()
 */
//�α��� ó��
import java.util.*;
public class ���ڿ�1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// id. pwd
		final String ID="admin";
		final String PWD="1234";
		
		Scanner scan=new Scanner(System.in);
		System.out.print("ID�� �Է�:");
		String id=scan.nextLine();
		System.out.print("��й�ȣ �Է�:");
		String pwd=scan.nextLine();
		
		// ���
		//if(id==ID && pwd==PWD)�� �Ұ��� => ���ڿ� �񱳽� ����� ���� ��ü�� ����� ���� �ƴ� �ּҰ��� ����Ǿ� �ֱ� ����!
		
		/*
		 * equals : ��ҹ��� ����
		 * equalsIgnoreCase : ��ҹ��� ���� X
		 */
		if(id.equalsIgnoreCase(ID) && pwd.equals(PWD)) 
		{
			System.out.println("�α��� �Ǿ����ϴ�");
		}
		else
		{
			System.out.println("ID�� ��й�ȣ�� Ʋ�Ƚ��ϴ�");
		}
		
		
		
		
		
		
		

	}

}
