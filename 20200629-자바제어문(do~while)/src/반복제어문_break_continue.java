/*
 * updown ���� => �߸��� �Է� => �������
 * ���� => �Է� ���� => continue, ���� => break
 * ���ڸ� ���� ������ ������ ���
 */
import java.util.*;
public class �ݺ����_break_continue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ������ ���ڸ� ����(����:com)
		int com=(int)(Math.random()*100)+1; //1~100���� ������ ���� ���� => 0.0 ~ 0.99 => 0.0 ~ 99.0=> 0 ~ 99 + 1 => 1~100
		//main�� ������ �Ұ� => ���α׷��� ���α׷��Ӱ� ����� �� ������ ���� => ���پ� �����Ѵ�
		//Ƚ�� ������ ���� ��� => ���ѷ���
		Scanner scan=new Scanner(System.in);
		while(true) {
			//����� �Է°� �ޱ�
			System.out.print("1~100���� ������ ���� �Է�:");
			int user=scan.nextInt();
			
			if(user<1 || user>100) {
				//ó������ �ٽ� ����
				System.out.println("�߸��� �Է��Դϴ�");
				continue;
			}
			//�������
			//��
			if(user>com) {
				System.out.println("�Է°����� ���� ������ �Է��ϼ���");
			}
			else if(user<com) {
				System.out.println("�Է°����� ���� ������ �Է��ϼ���");
			}
			else {
				System.out.println("Game Over!!");
				break; //Ȥ�� system.exit(0)�� �༭ �����ų ���� ����
				//�ݺ��� ����
			}
		}
		

	}

}
