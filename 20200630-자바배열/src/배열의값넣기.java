import java.util.Arrays;

/*
 * �迭�� �� �ֱ�
 * 	1) ���� �Է�
 * 	2) ����� �Է°� => Scanner
 * 	3) �����̿�
 * =================
 * 	4) File�б�
 *  5) web���� �о����
 *  6) ����Ŭ 
 *  
 *  ===========================
 *  �迭 => 0������ �Է�
 *     => �� �ں��� �Է�
 *     
 *     Stack => LILO ex) ������
 *     Que => FIFO ex) ����öž��
 *     
 *     �ڷᱸ�� : �����͸� �����ϴ� ������ ��� ������ ���ΰ�
 *     �˰��� : ���α׷� ¥�� ����
 *     ����Ʈ���� ����
 */
// 3���� �л��� ���� ���� => ����,����,���� ���� �Է� => ����, ���, ����, ��� ���ϱ�
import java.util.*;
public class �迭�ǰ��ֱ� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		int[] arr= {30,20,50,10,40};
		Arrays.sort(arr);
		for(int a:arr)
		{
			System.out.print(a+" ");
		}
		*/  // ���̺귯�� Ȱ���� ���
		
		int[] kor=new int[3];
		int[] eng=new int[3];
		int[] math=new int[3];
		
		int[] total=new int[3];
		double[] avg=new double[3];
		char[] hakjum=new char[3];
		int[] rank=new int[3];
		
		/*
		 * 	for(int i=0;i<3;i++)
		 * 		{
		 * 			Scanner scan=new Scanner(System.in);     //new => ���ο� ������ ���� => �޸𸮰� �� ����� => Ư���� ��찡 �ƴϸ� for���ȿ� scanner(x)
		 * 		}
		 */
		
		Scanner scan=new Scanner(System.in);
		
		for(int i=0;i<3;i++) 
		{
			System.out.printf("%d��° �������� �Է�:",i+1);
			kor[i]=scan.nextInt();
			
			System.out.printf("%d��° �������� �Է�:",i+1);
			eng[i]=scan.nextInt();
			
			System.out.printf("%d��° �������� �Է�:",i+1);
			math[i]=scan.nextInt();
			
			total[i]=kor[i]+eng[i]+math[i];
			avg[i]=total[i]/3.0;
		}
		//���� ���
		for(int i=0;i<3;i++)
		{
			char c='A';
			switch(total[i]/30)
			{
			case 10:
			case 9:
				c='A';
				break;
			case 8:
				c='B';
				break;
			case 7:
				c='C';
				break;
			case 6:
				c='D';
				break;
			default:
				c='F';
				break;
			}
			hakjum[i]=c;
		}
		//��� ���
		for(int i=0;i<3;i++)
		{
			rank[i]=1;
			for(int j=0;j<3;j++)
			{
				if(total[i]<total[j])
				{
					rank[i]++;
				}
			}
		}
		
		System.out.printf("%-6s%-6s%-6s%-7s%-7s%-6s%-6s\n","����","����","����","����","���","����","���");
		
		for(int i=0;i<3;i++)
		{
			System.out.printf("%-5d%-5d%-5d%-7d%-7.2f%-5c%-5d\n",kor[i],eng[i],math[i],total[i],avg[i],hakjum[i],rank[i]);
		}
		//for-each�� �迭 �ϳ��� ��� / �� ��� ������ ����̱� ������ for-each ��� x
		
		
		
		
		
		
		
		
		
		
		

	}

}
