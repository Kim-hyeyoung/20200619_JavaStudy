
class Member
{
	private String name; //���ٺҰ�
	public int age; //���ٰ���
	protected String addr; //���ٰ���
	String tel; //���ٰ���
	
	//�ʿ�� ���� ��� �����ϰ� �����
	public void setName(String n) //�޸𸮿� ���� => �ڵ�����(lombok)
	{
		name=n;
	}
	public String getName() //�޸𸮿��� ������ �б�
	{
		return name;
	}
}
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Member�� ����Ǿ� �ִ� ������ ����
		// Memeber�� ����
		Member m=new Member();
		//m.name="ȫ�浿";
		m.setName("ȫ�浿");
		m.age=30;
		m.addr="����";
		m.tel="010-1111-1111";
		
		System.out.println("�̸�:"+m.getName());
		System.out.println("����:"+m.age);
		System.out.println("�ּ�:"+m.addr);
		System.out.println("��ȭ:"+m.tel);
	}

}
