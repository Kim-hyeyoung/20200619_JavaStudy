import java.util.*;
public class �޷¸���� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int year=0,month=0;
		Scanner scan=new Scanner(System.in);
		System.out.print("�⵵ �Է�:");
		year=scan.nextInt();
		System.out.print("�� �Է�:");
		month=scan.nextInt();
		
		String[] strWeek= {"��","��","ȭ","��","��","��","��"};
		System.out.println(year+"�⵵ "+month+"��");
		
		for(String week:strWeek)
		{
			System.out.print(week+"\t");
		}
		
		//���� ���ϱ�
		/*
		 * 1) ���⵵������ �ѳ��� ��� / 1�⵵ 1�� 1��~2019�⵵ 12�� 31�ϱ��� ���
		 * 2) ���ޱ����� �ѳ��� ��� / 2020�� 1�� 1��~2020�� 6�� 30�ϱ��� ���
		 * 3) �Էµ� �ϱ����� �ѳ��� ���/
		 * ======================= +
		 * => ��ü�ѳ��� &7 => ������ ���� �� �ִ�
		 * 	 ==========
		 * 0,1,2,3,4,5,6
		 * 0(��)~6(��)
		 * => 1�⵵ 1�� 1�� => �����Ϸ� ����
		 */
		
		// 1) ���⵵������ �ѳ��� ��� / 1�⵵ 1�� 1��~2019�⵵ 12�� 31�ϱ��� ���
		int total=(year-1)*365
				+(year-1)/4   //������ => 4�⸶�� �ѹ��� ����
				-(year-1)/100 //100�⸶�� ����
				+(year-1)/400; //400�⸶�� �ѹ��� ����
		
		// 2) ���ޱ����� �ѳ��� ��� / 2020�� 1�� 1��~2020�� 6�� 30�ϱ��� ���
		int[] lastDay= {31,28,31,30,31,30,31,31,30,31,30,31};
		//1�� => ����x => 0
		//2��=> total+31
			//2���� ��� ���� ���
		if((year%4==0 && year%100!=0) || (year%400==0))
		{
			lastDay[1]=29;
		}
		else
		{
			lastDay[1]=28;
		}
		//3��=> total+31+28...
		
		for(int i=0;i<month-1;i++)
		{
			total+=lastDay[i];
		}
		
		
		//1������ ����
		total++;//1����
		
		int week=total%7;
	
		
		//�޷� ���
		System.out.println();
		for(int i=1;i<=lastDay[month-1];i++) //1�Ϻ��� �Է��� ���� ������ ������
		{
			if(i==1) // 1���� �տ� �����ֱ� (���� �޷� �κ�)
			{
				for(int j=0;j<week;j++)
				System.out.print("\t");
			}
			System.out.printf("%2d\t",i);
			week++;
			if(week>6) //������ ���
			{
				week=0; //�Ͽ���
				System.out.println();
			}
		}
		
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
