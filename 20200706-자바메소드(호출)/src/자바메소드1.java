/*
 * ���α׷�(����� ������+��ɹ�)
 * ���� => �迭 => Ŭ���� => ���� => �����ͺ��̽�-
 * ��ɹ� => �޼ҵ�(�� ���� ���) => Ŭ���� => ��Ű�� => .jar(���̺귯��)
 * 
 * �޼ҵ� : Ư�� �۾��� �����ϱ� ���� ��ǻ���� ��ɹ� ����
 * 			*** �� ���� �ϸ� ����
 * 			*** ����ȭ �۾�
 * 	���� : ���뼺 => ���� ���� => import
 * 		  �ߺ� �ڵ� ����
 * ���� : ����ȭ(�ܶ�(���))
 * �޼ҵ�
 *  = ����� ����
 *  	����)
 *  		��ȯ�� �޼ҵ��(�Ű�����)
 *  		{
 *  			return ��;
 *  			��ȯ���� ���� ��쿡�� void => return ��������
 *  		}
 *  		=> �޼ҵ� �ȿ��� ó�� => ��� ex)�Ϲ� ����
 *  		=> �޼ҵ� �ȿ��� ó�� => ����� ���� ex) ��, ������
 *  	= ȣ��)
 *  		�޼ҵ带 ȣ���� ��
 *  		�޼ҵ��(��,��)    ex) void method(int a,int b)
 *  							=> method(10,20)
 *  		�޼ҵ带 ȣ���ϰ� ������ ����Ǹ�(return) �ٽ� ȣ��� ��ġ�� ���ƿ´�
 *  		int method()
 *  			int a=method()
 *  
 *  = ���̺귯��
 * 		
 */
public class �ڹٸ޼ҵ�1 {
	static void aaa()
	{
		System.out.println("aaa() ȣ�� ����");
		bbb();
		System.out.println("aaa() ȣ�� ����");
	}
	static void bbb()
	{
		System.out.println("bbb() ȣ�� ����");
		ccc();
		System.out.println("bbb() ȣ�� ����");
	}
	static void ccc()
	{
		System.out.println("ccc() ȣ�� ����");
		ddd();
		System.out.println("ccc() ȣ�� ����");
	}
	static void ddd()
	{
		System.out.println("ddd() ȣ�� ����");
		System.out.println("ddd() ȣ�� ����");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
