/*
 * do~while
 * ����ڰ� �Է��� ������ �ش�Ǵ� ������
 */
import java.util.*;
//BufferedReader => ��ĳ�ʺ��� �� ���� ���Ǵ� ��, ����ó�� �ʿ�
public class �ݺ���2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		int user=0; //����� �Է� ����
		int i=1; //1~9���� �����ϴ� ����
		Scanner scan=new Scanner(System.in);
		//��� Ŭ������ �޸𸮿� ������ �� "new"�� �̿��Ѵ�
		//���� => Math.random() => static �޼ҵ� : ���۰� ���ÿ� �޸𸮿� �ڵ� ����
		System.out.print("2~9���� ������ ���� �Է�:");
		user=scan.nextInt();
		
		do {
			System.out.printf("%d*%d=%d\n",user,i,user*i);
			i++;
		}while(i<=9);
		*/
		
		int user=0; //����� �Է� ����
		int i=9; //1~9���� �����ϴ� ����
		Scanner scan=new Scanner(System.in);
		//��� Ŭ������ �޸𸮿� ������ �� "new"�� �̿��Ѵ�
		//���� => Math.random() => static �޼ҵ� : ���۰� ���ÿ� �޸𸮿� �ڵ� ����
		System.out.print("2~9���� ������ ���� �Է�:");
		user=scan.nextInt();
		
		do {
			System.out.printf("%d*%d=%d\n",user,i,user*i);
			i--;
		}while(i>=1);
		
		

	}

}
