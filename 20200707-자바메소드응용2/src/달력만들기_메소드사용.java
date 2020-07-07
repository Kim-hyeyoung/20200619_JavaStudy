/*
 *  1. ����ڷκ��� ����, �� ���� �Է� �޴´�
 * 	2. ������ ���Ѵ� => ����ȭ
 * 	3. �ش� ���Ϻ��� �޷� ���
 */
import java.util.*;

public class �޷¸����_�޼ҵ��� {
	//1. ����ڷκ��� ������ ���� �Է� �޴� �޼ҵ�
	static int userInput(String msg)
	{
		Scanner scan=new Scanner(System.in);
		System.out.print(msg+"�Է�:");
		int num=scan.nextInt();
		return num;		
	}
	//2. ������ ���ϴ� �޼ҵ�
	static int getWeek(int year,int month)
	{
		//1)���⵵������ �� ������ ��(year-1)
				int total=(year-1)*365
						+(year-1)/4
						-(year-1)/100
						+(year-1)/400;
				//2)���ޱ����� �ѳ���
				
						
				for(int i=1;i<=month-1;i++)
				{
					total+=lastDay(year,i);
				}
				//��û�� ���� 1������ ����
				total++;
				//���� ���ϱ�
				int week=total%7;
				return week;
	}
	//������ ������ ��¥�� �˷��ִ� �޼ҵ�
	static int lastDay(int year,int month)
	{
		int[] lastDay= {31,28,31,30,31,30,31,31,30,31,30,31};
		if(isYear(year))
			lastDay[1]=29;
		else
			lastDay[1]=28;
		return lastDay[month-1];
	}
	//���� ��� �޼ҵ�
	static boolean isYear(int year)
	{
		boolean bCheck=false;
		if((year%4==0 && year%100!=0)||(year%400==0))
			bCheck=true;
		return bCheck;
	}
	
	//�޷� ��� �޼ҵ�
	static void datePrint(int year,int month,int week)
	{
		int last=lastDay(year,month);
		String[] strWeek= {"��","��","ȭ","��","��","��","��"};
		for(int i=0;i<7;i++) 
		{
			System.out.print(strWeek[i]+"\t");
		}
		System.out.println();
		for(int i=1;i<=last;i++)
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
	//�޼ҵ� �������� �����ϴ� �޼ҵ�
	static void process()
	{
		int year=userInput("�⵵");
		int month=userInput("��");
		
		int week=getWeek(year,month);
		datePrint(year,month,week);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		process();
	}

}
