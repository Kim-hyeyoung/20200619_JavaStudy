/*
 * *
 * **
 * ***
 * ****
 * *****
 * => 사용자가 입력한 개수
 */
import java.util.*;
public class 반복문_2차for6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		Scanner scan=new Scanner(System.in);
		int user=0;
		System.out.println("정수 입력:");
		user=scan.nextInt();
		for(int i=1;i<=user;i++) 
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		*/
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=5;j++)
			{
				System.out.printf("[%d,%d]",i,j);
			}
			System.out.println();
		}

	}

}
