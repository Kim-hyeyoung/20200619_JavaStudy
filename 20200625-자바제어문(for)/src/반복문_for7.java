/*
 * for => Ƚ���� ������ �ݺ���
 * => UPDOWN ����
 * => ��ǻ�Ͱ� 1~100������ ������ �߻�
 * => ����ڰ� ������ ���ߴ� ����
 * 		��Ʈ => ����, ����
 */
import java.util.*; //����� �Է�
public class �ݺ���_for7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 1. ��ǻ�Ͱ� ���� �߻� (1~100)
		 * 		0.0~0.99 * 100 = 0.0~99.0 + 1 => (int)1.0~100.0
		 */
		int com=(int)(Math.random()*100)+1;
		// 2. ����� �Է�
		Scanner scan=new Scanner(System.in);
		int cnt=0;
		for(;;) {   //���ѷ��� => ������ while(true)�� ���� ��찡 �� ���� => ����ڰ� ������� ������ �𸣱� ������ ����
			//����� �Է°� �ޱ�
			System.out.println("1~100������ ���� �Է�:");
			int user=scan.nextInt();
			if(user<1 || user>100) { //����ó��
				System.out.println("�߸��� �Է��Դϴ�!!");
				continue; // ó������ �ٽ� ���ư��� ���� => for���� ���������� �̵�
			} 
			//���������� �Է��� �� ����
			cnt++;
			//��
			if(com>user) {
				System.out.println("�Էµ� ������ ���� ���� �Է��ϼ���");
			}
			else if(com<user){
				System.out.println("�Էµ� ������ ���� ���� �Է��ϼ���");
			}
			else {
				System.out.println("Game Over!!");
				System.out.println("�Է�Ƚ��:"+cnt); //�Է�Ƚ�� ī��Ʈ
				//����
				break; //for�� ����
			}
		}
		
		System.out.println("���α׷� ����");
		

	}

}
