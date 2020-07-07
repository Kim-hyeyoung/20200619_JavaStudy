/*
 * 사용자가 정수를 입력하면 짝수인지 홀수인지 확인
 * 메소드=>결과값 반환 => return
 * 		  메소드 자체에서 출력 => return값 x => void
 */
import java.util.*;
public class 자바메소드3 {
	static int userInput()
	{
		Scanner scan=new Scanner(System.in);
		System.out.print("정수입력:");
		int num=scan.nextInt();
		return num;
		
	}
	static void process(int num)
	{
		if(num%2==0)
			System.out.println(num+"는(은) 짝수입니다");
		else
			System.out.println(num+"는(은) 홀수입니다");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 사용자 입력값 받기
		int num=userInput();
		process(num);

	}

}
