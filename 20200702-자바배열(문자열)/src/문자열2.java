/*
 * ���ڿ��� ������ �� �ִ� ���� :String
 * 	=> �Ϲݺ����� ����
 * 	=> Ŭ������ ���� => ���(�޼ҵ�)
 * 
 * 	�ֿ� ���
 * 	= ���ڿ� �� : equals()
 * 	= ���� ���� : contains()
 * 	= ���ڿ� �߿� �� ���� ���� :charAt()
 * 	= ����� ������ ���� : length()
 * 	= ���� �ڸ��� : substring()
 * 	= ã�� ������ ��ġ : indexOf(), lastIndexOf()
 * 	= ��� ���������� ���ڿ��� ��ȯ : valueOf()
 * 	= ���� ���� ���� : trim()=> �¿츸 ����
 * 				ex) " Hello Java " => "Hello Java"
 * 	= ���ڿ�=>char() : toCharArray()
 * 	= startsWith, endsWith => �˻���
 * 	= ���ڿ��� ���ڷ� : parseInt("2") => ���� "2"�� ���� 2��
 */

// substring : �ʿ��� ���ڸ� ���� => ���¼� �м�(���, �λ�, �����)
/*
 *  "Hello Java"
 *  substring(int start) => ���ۺ��� ������ �ڸ��� => substring(6) => Java
 *  substring(int start,int end) => �߰��κ� �ڸ��� => substring(,)
 */

public class ���ڿ�2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String msg="100-010";
		//System.out.println(msg.substring(5)); //=> 56789
		//System.out.println(msg.substring(1,5)); //=>1234 => endindex�� -1�ؼ� �߶���� ������ 5���� �ڸ��� ������ endindex 6���� �ؾ� ��
		System.out.println(msg.substring(0,3));
		System.out.println(msg.substring(4,7));
		System.out.println(msg.substring(4));
		

	}

}
