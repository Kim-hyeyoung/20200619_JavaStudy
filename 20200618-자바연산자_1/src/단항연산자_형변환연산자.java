/*
 * 	�ʿ�ÿ� ���������� �����ؼ� ��� : ���� ����ȯ
 * 
 * 	int + double = double (�ڵ� ����ȯ)
 * 	char + int = int
 * 	int + long = long
 * 	char + int + long + double = double
 *  
 *  ����ȯ ���ܻ���
 *  1) boolean�� ����ȯ ����
 *  2) int ���ϴ� ������ �ϸ� ������� int
 *  	ex) byte + byte =int (byte (x))
 * 
 * 		
 */
public class ���׿�����_����ȯ������ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//byte b=10;
		//byte c=20;
		// byte d=b+c; byte�� byte�� ���ϸ� ������� int�̱� ������ ������!
		//int d=b+c;  //=>�ٸ��� ��ģ �ڵ�
		//byte d=(byte)(b+c); => Ȥ�� �̷��� ���ĵ� �ǳ� int�� �ϴ°� ����
		
		//�ڵ�����ȯ
		int a='A'; //a=65
		double d=10; // d=10.0���� �ڵ����� �ٲ㼭 ����
		char c=65; //c='A'
		System.out.println("a="+a);
		System.out.println("d="+d);
		System.out.println("c="+c);
		
		//��������ȯ
		int i=(int)10.5;
		int ii=(int)'A';
		System.out.println("i="+i);
		System.out.println("ii="+ii);
		
		

	}

}
