	/*
	 * Ŭ����
	 * =====
	 * ����=> �������� ������ �� (�ݵ�� �������� ���� �����Ϳ��� ��) => �߻�ȭ
	 * ex) ��ȭ ����
	 * 	=> ��ȭ��, ����, �⿬, �帣, ����, �ٰŸ�...
	 * ������ ����
	 * ====================================================
	 * =�������(�ν��Ͻ� ����) => new�� ����� ������ ���� ����Ǵ� ����
	 * 	- �޸𸮰� ��������� ���� => new�� �̿��� ��
	 * 	- heap : ���α׷��Ӱ� �����ϴ� ���� (�ڵ�ó���� �ȵ�)
	 * 			 �޸𸮸� ������� ���� ��� => ����ó��,GabageCollection)
	 * =��������(��������/static) => �޸𸮰� �� ��, �������� ���
	 * 	- �޸𸮰� ��������� ���� => �����Ϸ��� �������� �� �ڵ����� ����
	 *  - �޼ҵ念��(static,�޼ҵ�)
	 *  =====================================================> ���α׷� ����ñ��� �޸� ����
	 * =�������� => ��������, �Ű�����
	 * 	- �޸𸮰� ��������� ���� => �޼ҵ� ȣ���
	 *  - �޸� ��ü ����, {}�� ����� �ڵ� ȸ�� => stack(LIFO)
	 *  
	 * ������ 
	 * 	=> ��������� �ʱⰪ �ο�
	 * 	=> ��� �̿�, �����б�, �����ϰ� �����Ͱ��� ������ �� ��, ���� => ���� ���� (�����Ϸ��� �ڵ����� �߰����� => default ������(�Ű������� ���� ������))
	 *  => �����ڴ� �ݵ�� �ʿ�
	 *  => �޸𸮿� ����(Ŭ����)
	 *     ==============
	 *     new ������() => �� ���� ȣ���Ѵ� => this(�ڽ�)
	 * 
	 * �޼ҵ� => ���
	 * 		������ �޼ҵ��(�Ű�����..)  �����
	 * 		{
	 * 			������
	 * 		} =>����ο� �����ΰ� �������� �����
	 * 		**������ �ȵ� �޼ҵ�
	 * 		= �ν��Ͻ� �޼ҵ� => Ŭ�������� ���� ���
	 * 		= ���� �޼ҵ� => static => ��� Ŭ���� �������� ���
	 * 		= �߻� �޼ҵ� => ����θ� ���� (���̺귯��=>����θ� �ְ� ������ ���α׷��Ӱ� �ϵ���)
	 * 
	 * 	=>
	 * 	=>
	 * 	=>
	 */
class Student{
	//�л� 1�� ���� ���� => �޸� ������ ���� �� ���� �� �ִ� (new)
	String name;
	String subject;
	int year;
	static String school;
	//Student(){} //=> default ������
}
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student.school="SIST";
		Student s=new Student(); //name,year,subject => ���� (s��� �ּҿ� ����)
		System.out.println(s); //Student@15db9742
		
		System.out.println(s.name);
		System.out.println(s.subject);
		System.out.println(s.year);

		s.name="ȫ�浿";
		s.subject="���߰�";
		s.year=3;
		
		System.out.println(s.name);
		System.out.println(s.subject);
		System.out.println(s.year);
		System.out.println(Student.school);
		
		
		Student s1=new Student();
		System.out.println(s1);
		s1.name="��û��";
		s1.subject="�����";
		s1.year=2;
		
		System.out.println(s1.name);
		System.out.println(s1.subject);
		System.out.println(s1.year);
		System.out.println(Student.school);
		
		String ss="Hello Java";
		ss.replace('H', 'K');
		String ss1="1234567890";
		String. valueOf(10);
	
		
	}

}
