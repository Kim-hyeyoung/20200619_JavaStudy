// ����ȯ => �ڽ��� ���������� �ٸ� ������ ������������ ��ȯ
/*
 * 		boolean : ����
 * 		byte < char < int < long < float < double
 * 
 * 		���� => �Ǽ�, ����, ����           int a=(int)10L => long a=(long)10
 * 								double d=(double)10
 * 		�Ǽ� => ����, ����
 * 		���� => ����, �Ǽ�
 */
public class �ڹ�����ȯ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double d=5/(double)2; // �캯�� double �� ���� int�� ���Ǿ� 2.0���� ���� => �캯�� double ����Ͽ� �ùٸ� ������ ���
		System.out.println("d="+d);

	}

}
