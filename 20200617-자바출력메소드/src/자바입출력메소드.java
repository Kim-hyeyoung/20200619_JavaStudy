import java.util.*; //Scanner => ������ ������� �ڹ������� �о� �´�
public class �ڹ�����¸޼ҵ� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// �Է°� �ޱ�
		/*
		 * System.out.println("���� �Է�:");
		 * System.out.print("���� �Է�:\n"); => �� ���� ��� ����� ����
		 */
		Scanner scan=new Scanner(System.in);
		/*
		 * System.out.println("���� �Է�:"); //println�� ���� �Է½� Ŀ���� �Ʒ��� ������. �׳� print�� ���� �� ����   .   \n, \t ���!!
		 * int a=scan.nextInt(); 
		 * System.out.println("a="+a);
		 */
		
		//System.out.print("�Ǽ� �Է�:");
		//double a=scan.nextDouble(); //�������� ���ߵ���
		//System.out.println("a="+a);
		
		//System.out.println(~100); //'~'�ϸ� ����ǥ��
		System.out.println(Integer.toBinaryString(240));  //2����
		System.out.println(Integer.toHexString(240));     //16����
		System.out.println(Integer.toOctalString(240));   //8����
		
		System.out.println(0xf0); //16��ǥ��
		System.out.println(0360); //8��ǥ��
		System.out.println(0b11110000); //2��ǥ��
		System.out.println(~100);
	}

}
