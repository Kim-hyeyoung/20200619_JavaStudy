/*
 * 	ȭ�� ���
 * 		= system.out.println() => ������ ���
 * 		ex) system.out.println("Hello")
 * 			system.out.println("Java")
 * 
 * 		=>	Hello
 * 			Java
 * 
 * 		= system.out.print() => ������ ���
 * 		ex) system.out.print("Hello")
 * 			system.out.print("Java")
 * 
 * 		=> HelloJava
 * 
 * 		= system.out.printf() => ������ �ִ� ���
 *      ���� ���� ���� ���� ��� ����
 * 		80 80 80 240 80.0 B
 *		system.out.println("80 80 80 240 80.0 B")
 *		system.out.printf("%5d%5d%5d%5d%5f%5c",80,80,80,240,80.0,'B')  => ������ 5���� ��� ����϶�
 *
 *		%5d    80   (38.p ����)
 *		00080      =>5���ڸ� ����ϴµ� �տ� 3ĭ�� ��� 80�� ���
 *		%-5d
 *		80000		=>5���ڸ� ����ϴµ�80�� ����ϰ� �ڿ� ��ĭ
 *
 *		%5.2f   80.0
 *		080.00		=>5���ڸ� ����ϴµ� �Ҽ��� 2�ڸ��� ���
 *
 *
 *
 */	
public class �ڹ���¸޼ҵ� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.printf("%.1f", 80.55); //%f�� ������ �Ҽ��� 6�ڸ� ��� => �׷��� .0f�� �Է�  / �ڸ��� �߸��� �ڵ����� �ݿø� ��
		int a=2;
		int b=2;
		System.out.println("2*2=4");
		System.out.println(a+"*"+b+"="+a*b);
		System.out.printf("%d*%d=%d",a,b,a*b); //jdk 1.5
		
		/*
		 * %d => ����
		 * %f => �Ǽ�
		 * %c => ����
		 * %s => ���ڿ�
		 * 
		 * 
		 * 
		 * 
		 */
	}

}
