import java.util.Scanner;
public class ����15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.print("���� �Է� (10~99):");
		
		int a=scan.nextInt();
		
		if(a%11==0)
		{
			System.out.println("10�ڸ��� 1�ڸ��� ����");
		}
		else
		{
			System.out.println("10�ڸ��� 1�ڸ��� �ٸ���");
		}

	}

}
