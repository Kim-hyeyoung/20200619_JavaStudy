/*
 * 	char���� ���� => ���� ����
 * 
 * 	=> char clpha='A';
 * 	=> alpha�� �빮�ڸ� �ҹ��ڷ� ���
 * 	=> alpha�� �ҹ��ڸ� �빮�ڷ� ���
 * 
 * 	1. ���
 * 		������ (�񱳿�����, ��������, ����������)
 * 		�ܵ�ó�� => ���������, ����������, ���Կ�����
 * 				==========================
 * 					���� => ���
 * 		����ó�� => ����ȯ (���� ����ȯ)
 * 				double => int => (int)double
 * 				int => char => (char)int
 */


public class �ڹ����ǹ�����5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char alpha='a';
		
		if
		(alpha>='a' && alpha<='z')
			System.out.println((char)(alpha-32)); //alpha�� �ҹ��ڸ� �빮�ڷ� ���
		
		if 
		(alpha>='A' && alpha<='Z')
		System.out.println((char)(alpha+32)); //alpha�� �빮�ڸ� �ҹ��ڷ� ���
		

	}

}
