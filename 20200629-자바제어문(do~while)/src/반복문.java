/*
 * �ݺ��� => �ݵ�� �� �� �̻��� �����ؾ� �� �� (do~while)
 * ����)
 * 		�ʱⰪ => int i=1;
 * 		do{
 * 			�ݺ� ���๮�� ���
 * 			system.out.print(i+" ");
 * 			������
 * 			i++;
 * 		}while(���ǽ�); => i<=5;
 * 	
 * 		i=1..2..3.. => true => do������ �̵�
 * 		i=5
 * 			1,2,3,4,5,i=6 => false => ����
 */
public class �ݺ��� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// �ʱⰪ
		int i=1; //�������� => Ƚ�� ����
		do {
			System.out.print(i+" "); // �ݺ� ���๮�� (�������� ������ ����)
			i++; // i�� 5�� �� ������ ����
		}while(i<=5);
		// do~while�� ���� �� => i=6
		System.out.println("\n===== while =====");
		// �ʱⰪ 
		i=1; //i����� �缳�� �ʿ�
		while(i<=5) {
			System.out.print(i+" ");
			i++;
		}
		
		System.out.println("\n===== for =====");
		for(i=1;i<=5;i++) {
			System.out.print(i+" ");
		}

	}

}
