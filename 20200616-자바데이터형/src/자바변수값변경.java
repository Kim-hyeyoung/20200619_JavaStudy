/*
 * 	���� ����
 * 	���� �ʱ�ȭ
 * 	������ �� ����
 * 	�ٸ� ������ �� ����
 */
public class �ڹٺ��������� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// i, j�� ������ ������� �ʴ´� (�ĺ������ ��� ����)
		int a=100; //final int�� �ϸ� error!! -> ������ �ƴ� ����� ��(������)
		System.out.println("a="+a);
		a=200;
		System.out.println("a="+a);
		a=300;
		System.out.println("a="+a);
		
		int b=200;
		int c=b;
		int d=b+c;
		//c��� �޸𸮿� b�� ������ �ִ� ���� ����
		System.out.println("b="+b);
		System.out.println("c="+c);
		System.out.println("d="+d);
		
		int x,y,z;
		x=y=z=100;
		System.out.println("x="+x);
		System.out.println("y="+y);
		System.out.println("z="+z);
		
	}

}
