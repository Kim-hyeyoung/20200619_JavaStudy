/*
 * 1		
 * 22
 * 333
 * 4444
 * 55555
 * 
 * 1
 * 12
 * 123
 * 1234
 * 12345
 * 
 * 11111
 * 2222
 * 333
 * 44
 * 5
 */

public class 반복문_2차for5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 줄수i 공백j 숫자
		 */
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(i);
			}
			System.out.println();
		}
		
		System.out.println("===========");
		
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(j);
			}
			System.out.println();
		}
		
		System.out.println("===========");
		
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=6-i;j++)
			{
				System.out.print(i);
			}
			System.out.println();
		}
		

	}

}
