/*
 * ���ڿ� ���� ���� => String
 * ����)
 * 		char c='A' => ���� �Ѱ��� ����
 * 		String s="ABCDEFG" => ���ϴ� ������ŭ ���� ����  / ��, ������(��� ������ ���ڿ�)
 * 
 * 		String : Ŭ����
 * 		���(java ����)
 * 		=> ���� ���� Ȯ��
 * 			String s="ABCDEF";
 * 			s.length()=>6
 * 		=> ���� �ڸ���
 * 			String s="ABCDEF";
 * 			s.charAt(0)=>'A'
 * 
 * ����� ���ڿ��� �Է��Ͽ� �빮�� ������ �ҹ��� ���� Ȯ�� 
 *
 */
import java.util.*;
public class �ݺ���_while3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="ABCDEFG"; // ���ڿ� ����
		//System.out.println(s);
		Scanner scan=new Scanner(System.in);
		System.out.print("���ڿ��� �����ϼ���>>");
		s=scan.nextLine();//String���� �������� ����
		System.out.println(s);
		//System.out.println("����:"+s.length()); //scanner�� �����ν� ���ϹǷ� ���� �Է½� ���ڰ����� ����� ����
													//=> nextLine()���� ���������Ͽ� �ϳ��� �ν��ϵ��� �ؾ� ��
		int a=0,b=0; //a�� �ҹ��� ����, b�� �빮�� ����
		int i=0; // ������ ������ŭ �����ϴ� ���� => �������� 
		/*
		 * ABCDEFG => 7
		 * 0123456         =>  �迭�� 0���� �����ϱ� ������ ���ۺ����� 0���� ��
		 */                    //     ����
		while(i<s.length()) //   �ε�ȣ�� '='�� �� ���� ����
		{
			char c=s.charAt(i);
			if(c>='A' && c<='Z')
				b++;
			if(c>='a' && c<='z')
				a++;
			
			i++;
		}
		System.out.println("�빮�� ����:"+b);
		System.out.println("�ҹ��� ����:"+a);
		
	}

}
