/*
 * �������� �ڵ� => ����ȭ�� �ڵ�(�޼ҵ�)
 * 				��ɺ��� ��� ��� ����(����,�ڵ� �ߺ� ����) => ����, �߰� ���ϰ�
 * 
 * 1. ����ڷκ��� ����, �� ���� �Է� �޴´�
 * 2. ������ ���Ѵ� => ����ȭ
 * 3. �ش� ���Ϻ��� �޷� ���
 */
import java.util.*;
public class �޷¸����_��������� {
	static void process(int year,int month)
	{
		//System.out.println(year+"�⵵"+month+"��");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//1.����ڷκ��� ����, �� ���� �Է� �޴´�
		Scanner scan=new Scanner(System.in);
		System.out.print("���� �Է�:");
		//�Էµ� �����͸� �޸𸮿� ����
		int year=scan.nextInt();
		System.out.print("�� �Է�:");
		int month=scan.nextInt();
		//����� year, month => main�� ���� ������ ��� ����
		//���������� �ٸ� �޼ҵ忡�� ����� ���� �Ű������� �̿��ؾ� ��
		
		//2. ������ ���Ѵ� => ����ȭ
		//1)���⵵������ �� ������ ��(year-1)
		int total=(year-1)*365
				+(year-1)/4
				-(year-1)/100
				+(year-1)/400;
		//2)���ޱ����� �ѳ���
		int[] lastDay= {31,28,31,30,31,30,31,31,30,31,30,31};
		//�����̸�
		if((year%4==0 && year%100!=0)||(year%400==0))
			lastDay[1]=29;
		else
			lastDay[1]=28;
				
		for(int i=0;i<month-1;i++)
		{
			total+=lastDay[i];
		}
		//��û�� ���� 1������ ����
		total++;
		//���� ���ϱ�
		int week=total%7;
		
		//���
		System.out.println(year+"�⵵"+month+"��");
		String[] strWeek= {"��","��","ȭ","��","��","��","��"};
		for(int i=0;i<7;i++) 
		{
			System.out.print(strWeek[i]+"\t");
		}
		/*
		System.out.print("��\t");
		System.out.print("��\t");
		System.out.print("ȭ\t");
		System.out.print("��\t");
		System.out.print("��\t");
		System.out.print("��\t");
		System.out.print("��\t");
		*/
		
		System.out.println("\n\n");
		//�޷� ���
		for(int i=1;i<=lastDay[month-1];i++)
		{
			//�������
			if(i==1)
			{
				for(int j=0;j<week;j++)
				{
					System.out.print("\t");
				}
			}
			//���
			System.out.printf("%2d\t",i);
			//��������
			week++;
			if(week>6)
			{
				week=0;
				System.out.println();
			}
		}
		
		
		
		
	}

}
