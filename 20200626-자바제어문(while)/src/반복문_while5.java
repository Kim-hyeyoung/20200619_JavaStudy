/*
 * 	while�� ������
 * 	1) while���� ������ ���� ��� error <=> for(;;)���� �������(���ѷ���)
 * 	2) while�� ���ѷ��� => while(true):���� ���� ����
 *  ����ڰ� 5�Է� => 1~5���� �� ���ϱ� 
 */
import java.util.*;
public class �ݺ���_while5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int user=0; //����� ��û ����
		int i=1; // ����ڰ� ��û�� �������� �����ϵ��� �ϴ� ����(����)���� / 0���ʿ��ϰ� ������ �ʱ� ���� 1�� ����
		int sum=0; //�����Ͽ� ������ ��
		Scanner scan=new Scanner(System.in);
		System.out.println("������ �Է�:");
		user=scan.nextInt();
		while(i<=user)
		{
			sum+=i;
			i++;
		}
		System.out.println(sum);
		
		i=1; // i�� 1�� �ʱ�ȭ
		//System.out.println("i="+i);
		while(i<=5)
		{
			System.out.print(i);
			i++;
		}
		System.out.println();
		i=5;
		while(i>=1)
		{
			System.out.print(i);
			i--;
		}
	}

}
