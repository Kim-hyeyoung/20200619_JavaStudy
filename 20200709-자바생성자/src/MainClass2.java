
public class MainClass2 {
	String book="Java�� ����"; // �ν��Ͻ������� new�� �̿��ؼ� �޸� ������ ����� �����ؾ� ��� ����
	String author="���ü�";
	static String publisher="��������"; //���������� �ڵ����� �޸𸮿� ����
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MainClass2 m=new MainClass2(); //m�ȿ� String book�� String author �� ���� ����� / static String publisher�� �̹� ����Ǿ� ����
									//=> ȣ��� '.' �̿� => m.book , m.author
									// �ν��Ͻ������� new�� �̿��ؼ� �޸� ������ ����� �����ؾ� ��� ����
		System.out.println("å�̸�:"+m.book);
		System.out.println("����:"+m.author);
		System.out.println("���ǻ�:"+MainClass2.publisher);
		System.out.println("���ǻ�:"+publisher); //static�� �׳� ������ �� ����
		System.out.println("���ǻ�:"+m.publisher); //����
		/*
		 * static => ��ü�� ���ؼ� ���� =>  m.publisher
		 * 		  => Ŭ�������� ���� ���� => MainClass2.publisher
		 * 		  => ���� Ŭ������ �ִ� ��� => publisher
		 * 
		 * 		*** �������� new ��� ����� => ���÷���
		 */

	}

}
