/*	***�ϱ�!!!!!
 * 	����ڰ� �⵵�� �Է� => ���⿩�� Ȯ��
 * 	= 4�⸶�� 2���� 29�� =>  year%4==0
 * 	= 100�⸶�� ���� => year%100!=0
 * 	= 400�⸶�� => year%400==0
 * 
 * 	����, �Ⱓ ���� => &&
 *  ����, �Ⱓ ����x => ||
 *  ���� => &&
 */
import java.util.*;
public class �ڹټ������ǹ�2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int year=0;
		Scanner scan=new Scanner(System.in);
		System.out.println("�⵵ �Է�");
		// �Է��� ���� �޴´� => year�� ����
		year=scan.nextInt();
		
		//���� ���� Ȯ��
		if((year%4==0 && year%100!=0) || (year%400==0)) //�����̶�� =>4�⿡ �ѹ�, 100�⸶�� ����, 400�⸶��
		{
			System.out.println(year+"��(��) �����Դϴ�");
		}
		else //������ �ƴ϶��
		{
			System.out.println(year+"��(��) ������  �ƴմϴ�");
		}
		
		

	}

}
