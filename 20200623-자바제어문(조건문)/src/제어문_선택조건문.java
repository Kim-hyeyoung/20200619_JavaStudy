/*
 * 	���� ���ǹ�
 * 	if(���ǹ�)
 * {
 * 		���ǹ��� true�� �����ϴ� ���� ����
 * }
 * else
 * {
 * 		���ǹ��� false�� �����ϴ� ���� ����
 * }
 * 	���ǹ� => �ٽ� (��������) (137.p)
 * 
 * 	==
 * 	&&
 * 	||
 * 	
 * 	���ڿ� => !=, == ������� �ʴ´�
 *  => equals()
 *     !equals()
 */
import java.util.*;
public class ���_�������ǹ� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ���� �Ѱ��� �Է� �޾Ƽ� ���ĺ����� Ȯ��
		// ��������
		char ch='A';
		Scanner scan=new Scanner(System.in);
		System.out.println("���� �Է�:");
		// �ڹٴ� ��� ���� ��ȣ�� 0���� �����Ѵ�
		ch=scan.next().charAt(0); //"ABC"�� �Է��ص� ù��° ������ 'A'�� ������
		
		if((ch>='A' && ch<='Z') || (ch>='a' && ch<='z')) {
			System.out.println(ch+"��(��) ���ĺ��Դϴ�");
		}
		else {
			System.out.println(ch+"��(��) ���ĺ��� �ƴմϴ�");
		}
	}

}
