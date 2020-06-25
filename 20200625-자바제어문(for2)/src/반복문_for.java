/*
 * AaBbCcDd...Zz
 */
public class 반복문_for {

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
			System.out.println("Java=>For");   //블럭 여부에 따라 출력값이 달라짐
		*/
		/*
		char c='a';
		for(char ch='A';ch<='Z';ch++) {
			System.out.print(ch+""+c++);
		}
		for(char ch='A';ch<='Z';ch++) {
			System.out.print(ch+""+(char)(ch+32)); //위 아래 같은 내용 다른 코딩
		}
		*/
		
		//조건없이 1~10 홀수만 출력=>일정간격을 띄고 출력
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










