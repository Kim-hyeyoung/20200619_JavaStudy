import java.util.Scanner; // �ڹ� ���� ���� ��ƿ ���� �ȿ� ��� ��ĳ�ʸ� �����´�. ��ƿ�� �ִ� ��� Ŭ������ ���������� import java.util.*

public class �ڹ���¸޼ҵ�2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * System.out.printf("%d*%d=%d",2,2,4); 
		 * System.out.printf("%d*%d=%d",2,3,6);
		 *///=> �̷��� �ϸ� ������ �پ ��µǴ� ������ ����
		
		/*
		 * System.out.printf("%d*%d=%d\n",2,2,4); //=> ������ ��µǰ� �Ϸ��� \n ����
		 * System.out.printf("%d*%d=%d",2,3,6);
		 */
		
		/*
		 * \n�� NewLine => ���ο� �ٿ� ���
		 * \t�� �� => ���� ���� ���
		 */
		
		Scanner scan=new Scanner(System.in);
		/*
		 * 	Scanner : ��������
		 *  scan : ����
		 *  new : �޸𸮿� ����
		 *  Scanner(System.in) : �ʱ�ȭ
		 * 
		 */
		System.out.print("1' ���� �Է�:");  //ù��° ���� �Է�
		int a=scan.nextInt(); // => �Էµ� ������ �о�ͼ� a��� �޸𸮿� �����ض�
		//System.out.print("2' ���� �Է�:");  //�ι�° ���� �Է�    => �� ������ �����ϸ� �Է½� 100 200 �ϸ� ���ÿ� ��µ�
		int b=scan.nextInt();  //next �ڿ��� �������� �Է� => nextboolean�� true false �Է�, next int�� ���� �Է�...
		//���
		System.out.println("a="+a);
		System.out.println("b="+b);  //���� Ű���忡 �Է��� a, b���� �����
		
		// Scanner => ���������� ���
		
	}

}
