/*
 * �ݺ����
 * 		= break => �ݺ����� ������ ��
 * 		= continue => Ư���κ��� �����ϰ� ���� ���
 * 			=> ���ǹ��� ���� ����Ѵ� (if)
 * 			=> break, continue�� �� ���� �ݺ����� ������ �� �ִ�
 * 			=> break => �ݺ��� ��ü (for, do~while, while), swtich
 * 			=> continue => �ݺ��������� ��� ����
 * 					=> while(���ǽ����� �̵�)
 * 					=> for(���������� �̵�)
 * 			=> return => ���� (�޼ҵ� ����)
 */
public class �ݺ����_break {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1~10���� ��� => 5�� �� ���� => break;
		for(int i=1;i<=10;i++) {
			System.out.print(i+" "); //��½����� if���Ǻ��� �����̱� ������ 5���� ����ϰ� �����!!!
			if(i==5)
				break;
		}
		
		System.out.println("===== ���ǹ� =====");
		//1~10���� Ȧ���� ���
		
		//1. ���ǹ�
		for(int i=1;i<=10;i++) {
			if(i%2!=0)
			System.out.print(i+" ");
		}
		//2. 2�� ����
		System.out.println("\n===== 2�� ���� =====");
		
		for(int i=1;i<=10;i+=2) {
			System.out.print(i+" ");
		}
		//3. continue ���
		System.out.println("\n===== continue =====");
		for(int i=1;1<=10;i++) {
			if(i%2==0)
				continue;
			System.out.print(i+" ");
		}
	
	}

}
