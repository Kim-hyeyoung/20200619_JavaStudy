/*
 * 	���׿�����
 * 		��������� (+, -, *, /, %)
 * 		=> �ڹٿ��� �����ϴ� ��� �����ڴ� ����� ��ȯ�� �� �ִ�
 *		����Ʈ�����ڴ� ��������ڷ� �ϴ� �� �� ����
 *		ex) x<<y  =>  x*2�� y��
 *		=> �ڹ����α׷����� ���� ���� ���Ǵ� ������
 *		**������
 *			1) ����ȯ => ���� ū ������������ ���� 
 *			2) /
 *				= 0���� ������ ����
 *				= ����/����=����
 *			3) %
 *				= ������ ������ => ��ȣ�� �������� ���� ���󰣴�
 *					ex) (-5)%(-2)=>(-1)
 *						(5)%(-2)=>(1)
 *			4) ����������� �켱������ *,/,%�� +,-���� �켱������ ���� => �켱������ �� �𸣸� () �̿�
 * 	
 */
public class ���׿�����_��������� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int a=10/0;
		//System.out.println(a);
		int a=10;
		int b=3;
		
		int c=a+b;
		int d=a-b;
		int e=a*b;
		int m=a/b;
		int n=a%c;
		
		System.out.printf("%d+%d=%d%n",a,b,c);
		System.out.printf("%d-%d=%d%n",a,b,d);
		System.out.printf("%d*%d=%d%n",a,b,e);
		System.out.printf("%d/%d=%d%n",a,b,m);
		System.out.printf("%d%%%d=%d%n",a,b,n); //%d�� ������, %n�� \n�� ����
		

	}

}
