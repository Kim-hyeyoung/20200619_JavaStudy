/*
 * �迭=�뵵���� ��� ���
 * byte[] b => File ����
 * String[] s => ���ڿ��� ���� ���(�̸�,�ּ�,��ȭ��ȣ)
 * int[] i => �������,���
 * double[] d => ���,�󵵼�,������
 * boolean[] b=> ���翩�� Ȯ��
 */
public class �ڹٹ迭_�뵵4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] s= {
				"cherry",
				"melon",
				"mango",
				"aloe",
				"lemon",
				"fig",
				"watermelon",
		};
		//���ϸ��߿� ���� �� ������?
		//��ü ���� ���
		System.out.println("========��ü ���ϸ� ========");
		for(String ss:s) //index�� �������� �ʰ�, ���� ������ �� ����
		{
			System.out.println(ss);
		}
		System.out.println("========================");
		System.out.println("���ϸ��� ���� ª�� ������?");
		int min=100;
		for(String ss:s)
		{
			int len=ss.length(); //���ڿ� => ������ ���� ��������
			if(min>len)
				min=len;
		}
		//���
		for(String ss:s)
		{
			if(ss.length()==min)
				System.out.println(ss);
		}
		/*
		 * ���� ���� Ȯ�� => ��й�ȣ
		 * String => char[] => ���۹�ȣ�� 0
		 * "Hello Java"
		 *  0123456789
		 */
		
		String msg="Hello Java";
		System.out.println("9��° ���ڴ�?");
		for(int i=0;i<msg.length();i++)
		{
			System.out.println(msg.charAt(i)); //charAt() => ���ڿ����� ���ϴ� ��������, 0���� ����
		}
	
		
		

	}

}
