/*
 * A-Z���� ���
 */
public class �ݺ���_for6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	for(char ch='A';ch<='Z';ch++) { //ch�� for�� �ȿ��� ���������� ���Ǳ� ������ �ߺ� ��� ����
		System.out.print(ch);
	}
	System.out.println();//�����ٷ� ������
	for(char ch='a';ch<='z';ch++) {
		System.out.print(ch);
	}
	System.out.println();
	for(int i=10;i>=1;i--) {
		System.out.println(i);
	}
		System.out.println("==============");
		
	for(int i=1,j=10;i<=10;i++,j--) { //������ ������ ����ص� ���ǽ��� �ϳ��� ����ؾ� ��(i<=10)
		System.out.println("i="+i+",j="+j);
	}
	
	}

}
