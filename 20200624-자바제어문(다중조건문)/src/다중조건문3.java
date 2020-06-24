/*
 * 사칙연산
 * 	변수 => 정수 2개, 연산자(+,-,*,/)
 */
import java.util.*;
public class 다중조건문3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=0, b=0;
		char op='+';
		
		Scanner scan=new Scanner(System.in);
		System.out.println("두 개의 정수 입력(90 100):");
		a=scan.nextInt();
		b=scan.nextInt();
		
		System.out.println("연산자 입력(+,-,*,/):");
		op=scan.next().charAt(0);
		
		if(op=='+')
		{
			System.out.printf("%d+%d=%d\n",a,b,a+b);
		}
		else if(op=='-')
		{
			System.out.printf("%d-%d=%d\n",a,b,a-b);
		}
		else if(op=='*')
		{
			System.out.printf("%d*%d=%d\n",a,b,a*b);
		}
		else if(op=='/')
		{
			if(b==0)
			{
				System.out.println("0으로 나눌 수 없습니다");
			}
			else
			{
				System.out.printf("%d/%d=%.2f\n",a,b,a/(double)b); //double로 나눠야 소수점까지 출력 가능 (실수형)
			}
		}
		else
		{
			//연산자 외에 다른 문자를 입력 했을 때 처리
			System.out.println("잘못된 연산자 입력입니다");
		}
	}

}
