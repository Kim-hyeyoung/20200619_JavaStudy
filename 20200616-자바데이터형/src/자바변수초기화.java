
public class �ڹٺ����ʱ�ȭ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * int kor=78; int eng=85; int math=96;
		 */
		
		/*
		 * ���ڿ� ���� (35.p����)
		 * ======
		 * 7+7+"1"+7+7
		 * =======
		 * 14+"1"+7+7
		 * ======
		 * "141"+7+7  ���ڿ� ���� �޺κ��� ������ �ʰ� �׳� ���ڷ� ����
		 * "1417"+7
		 * "14177"
		 * 
		 * 
		 */
		
		/* System.out.println("����:"+(kor+eng+math)); */
		
		int a=97;
		char c=97;//char => ����, ���� (char�� ���ڷ� �ᵵ ���������� ��µ�)
		System.out.println("a="+a);
		System.out.println("c="+c);
		
		int d=1;
		int e='1';
		System.out.println("d="+d);
		System.out.println("e="+e);
		//char�� ���ڸ� ���� ����Ѵ�
		/*
		 * 	long =int
		 *   8     4
		 *   
		 *   int = long
		 *    4     8  => error!!!
		 *    
		 *    ����=> char = int  (char���� ���������� int �Է°���)
		 */
		float f=10.6f; //float f=10.6�� error!!!
		
		//byte < char < int < long < float < double
		System.out.println(100);//100�� int
		System.out.println(10.8);//10.8 double
		
		double i=21400000000L;
		
	}

}
