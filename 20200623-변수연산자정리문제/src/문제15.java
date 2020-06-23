import java.util.Scanner;
public class 문제15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.print("정수 입력 (10~99):");
		
		int a=scan.nextInt();
		
		if(a%11==0)
		{
			System.out.println("10자리와 1자리가 같다");
		}
		else
		{
			System.out.println("10자리와 1자리가 다르다");
		}

	}

}
