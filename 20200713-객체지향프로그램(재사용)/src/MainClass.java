/*
 * ���� : ������ ������� Ŭ������ ��� (�ݺ� �ڵ��� ����)
 * 	1) ��� (is-a)
 * 		�̹� ������� ����� �����ؼ� ���
 * 		public class MyWindow extends JFrame
 * 							  =======>Ȯ��� Ŭ����
 * 		**��ӿ��� :private, static
 * 	AŬ������ ������ �ִ� ��� ���� ��� => ���� :private, static, ������
 *  public class A
 * {
 * 		String name;
 * 		int age;
 * 		public void display();
 * }
 * 
 * 	public class B extends A
 * {
 * 		String name;
 * 		int age;
 * 		public void display();
 * }
 * 
 * 
 * 
 * 	2) ���� (has-a)
 * 		�̹� ������� ����� ������� �״�� ���
 * 		public class MyWindow
 * 		{
 * 			JFrame f=new JFrame();
 * 		}
 * 

 */
import javax.swing.*;
public class MainClass extends JFrame { //String,Math,system�� ���x => ���̳� Ŭ����
	/*
	public MainClass() //�����ڴ� �������̸� public�޼ҵ�� �����Ѵ�
	{
		
	}
	*/
	public MainClass() {
		//���
		setSize(300, 300); //super.setSize(300, 300); JFrame ���
		setVisible(true); //this.setVisible(true);   ==> �̷��� �ص� �����ϰ� �۵�(���� �ʾƵ� �ڵ� �߰�)
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new MainClass();

	}

}
