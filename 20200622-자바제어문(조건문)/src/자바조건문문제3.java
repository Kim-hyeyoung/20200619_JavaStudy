/*
 * 	����� �Է� => 0, 1, 2
 * 
 * 	0�̸� ����
 * 	1�̸� ����
 * 	2�� ��
 */
import java.util.*;
public class �ڹ����ǹ�����3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.print("����(0),����(1),��(2) �Է�:");
		int user=scan.nextInt();
		
		if (user==0)
			System.out.println("user:����");
		if (user==1)
				System.out.println("user:����");
		if (user==2)
				System.out.println("user:��");
		
		// ��ǻ��
		int com=(int)(Math.random()*3);
				//==============>0.0 ~ 0.99 * 3 => 0.0 ~ 2.9
		//����, �Ǽ�, ������ ��쿡�� ����� ���������� ""���ڿ��� ==���� �񱳰� �Ұ��� => equals()
		if(com==0)
			System.out.println("��ǻ��:����");
		if(com==1)
			System.out.println("��ǻ��:����");
		if(com==2)
			System.out.println("��ǻ��:��");
		
		//����� ��
		/*
		 * 	��ǻ��
		 * 		����
		 * 			�����
		 * 			����
		 * 			����
		 * 			��
		 * ��ǻ��
		 * 		����
		 * 			�����
		 * 			����
		 * 			����
		 * 			��
		 * ��ǻ��
		 * 		��
		 * 			�����
		 * 			����
		 * 			����
		 * 			��
		 */
		//��ǻ�Ͱ� �����϶�
		//��ø���ǹ�
		/*
		 *  
		 */
		

	}

}
