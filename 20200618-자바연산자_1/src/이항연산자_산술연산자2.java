/*
 * 		'A'+'B'
 * 		===
 * 		������ȯ
 * 		65+66 = 131 (int)
 * 
 * 		***������ : ���������� �ʰ��ϸ� error�� �ƴ϶� �����÷ο찡 �߻�
 * 		ex) int�� ������  1~10�̶��  11�� 1�� ����
 */
public class ���׿�����_���������2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//byte b1=64;
		//byte b2=64;
		//byte b3=(byte)(b1+b2);
		//System.out.println("b3="+b3);  // => �����÷ο�
		// % => double+int+char=>double
		
		int a=5;
		int b=2;
		System.out.println(a%b);
		System.out.println(-a%b);
		System.out.println(a%-b);
		System.out.println(-a%-b);
		
		System.out.println((int)(10.5+10.5));
		System.out.println((int)((int)10.5+(int)10.5));  // => 2���� ����� �ٸ�, �ʿ信 ���� ����ȯ
		

	}

}
