/*
 * AaBbCcDd...Zz
 */
public class �ݺ���_for {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		for(int i=1;i<=5;i++) {
			System.out.println("Hello!!");
			System.out.println("Java=>For");
		}
		System.out.println("=============");
		for(int i=1;i<=5;i++) 
			System.out.println("Hello!!");
			System.out.println("Java=>For");   //�� ���ο� ���� ��°��� �޶���
		*/
		/*
		char c='a';
		for(char ch='A';ch<='Z';ch++) {
			System.out.print(ch+""+c++);
		}
		for(char ch='A';ch<='Z';ch++) {
			System.out.print(ch+""+(char)(ch+32)); //�� �Ʒ� ���� ���� �ٸ� �ڵ�
		}
		*/
		
		//���Ǿ��� 1~10 Ȧ���� ���=>���������� ��� ���
		/*
		for(int a=1;a<=10;a+=2) {
			System.out.print(a+"\t");
		}
		System.out.println();
		for(int a=2;a<=10;a+=2) {
			System.out.print(a+"\t");
		}
		*/
		//1~5 =>1,2,3,4,5
		/*
		System.out.println();
		for(int a=1;a<=5;a++) 
		{
			System.out.print(a);
			if(a<5) {
				System.out.print(",");
			}
		}
		*/
		//10 => 1010  15 => 1111
		System.out.println();
		int su=10;
		String s="";
		for(;;)
		{
			int a=su%2;
			System.out.print(a);
			s+=a+"";
			su=su/2;
			if(su==0)
				break;
		}
		for(int i=s.length()-1;i>=0;i--)
		{
			System.out.print(s.charAt(i));
		}
	}
}










