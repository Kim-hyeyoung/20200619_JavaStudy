/*
 * ���ù�
 * 	=> switch(a)(����,����,���ڿ�)
 * 		{
 * 			//����
 * 			case ������:
 * 				ó������
 * 			case ������:
 * 				ó������           ======> �ݷ�(:), case�� ��(��)�� �ߺ�x
 * 		}
 * ����)
 * 	switch(����){  => break�� ���� ��쿡�� ��� ������ ����
 * 		case 1:
 * 			ó������1
 * 		case 2:
 * 			ó������2
 *		 case 3:
 * 			ó������3
 * 		}
 * 
 */
import java.util.*;
public class ���ù� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int select=0;
		Scanner scan=new Scanner(System.in);
		System.out.println("����(1~5):");
		select=scan.nextInt();
		
		switch(select) 
		{
		case 1:
			System.out.println("1���� �Է��Ͽ����ϴ�");
			break; //switch������ �����Ѵ� (������ ������ ���̽����� ���δ� ��µ�)
		case 2:
			System.out.println("2���� �Է��Ͽ����ϴ�");
			break;
		case 3:
			System.out.println("3���� �Է��Ͽ����ϴ�");
			break;
		case 4:
			System.out.println("4���� �Է��Ͽ����ϴ�");
			break;
		case 5:
			System.out.println("5���� �Է��Ͽ����ϴ�");
			break;
		default: //5�� ���� �ٸ� ���� �Է½� ó��
			System.out.println("1~5�������� ����ϼ���");
			
		}
	}

}
