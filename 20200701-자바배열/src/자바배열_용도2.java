/*
 * ========
 *  3 6 9
 * ========  int[] com={3,6,9};
 * 
 * ===���===  =>�߱�����
 * S:��
 * B:�ܡ�
 * ========
 */
import java.util.*;
public class �ڹٹ迭_�뵵2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] com= {3,6,9};
		//����� �Է°� ����
		int[] user=new int[3];
		Scanner scan=new Scanner(System.in);
		//�Է¹ޱ�
		while(true)
		{
			System.out.print("3�ڸ� ������ �Է�:"); //100~999
			//����
			int input=scan.nextInt();
			//�߸��� �Է� ó�� (������ ��� ���)
			if(input<100 || input>999)
			{
				System.out.println("�߸��� �Է��Դϴ�"); //while�� ó������ �̵�
				continue;
			}
			//�߸��� �Է� ó�� (�ߺ��� ���� �� ���)
			//����=>123
			//�� �ڸ����� ���� ���ϴ� ��
			user[0]=input/100; //123/100 =>1
			user[1]=(input%100)/10; //123%100 =>23/10=>2
			user[2]=(input%10); //123/10 =>3
			
			if(user[0]==user[1]||user[1]==user[2]||user[0]==user[2])
			{
				System.out.println("�ߺ��� ���� ����� �� �����ϴ�");
				continue;
			}
			
			//��
			int s=0,b=0;
			for(int i=0;i<3;i++) //com
			{
				for(int j=0;j<3;j++) //user
				{
					if(com[i]==user[j])//���� ���� �ִ��� Ȯ��
					{
						if(i==j)
							s++;
						else
							b++;
					}
				}
			}
			
			//����� ���
			System.out.println("=====���=====");
			System.out.print("S:");
			for(int i=0;i<s;i++)
			{
				System.out.print("��");
			}
			System.out.print("\nB:");
			for(int i=0;i<b;i++)
			{
				System.out.print("��");
			}
			System.out.println("\n===========");
			
			//while ���� ����
			if(s==3)
			{
				System.out.println("Game Over!!");
				break;
			}
			
			
		}
		
		
		
		

		
		
		
		
		
		
		
	}

}
