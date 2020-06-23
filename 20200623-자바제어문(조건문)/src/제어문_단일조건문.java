/*
 * 	자바에서 지원하는 제어문
 * 		= 조건문, 선택문
 * 			= 단일 조건문 (if)
 * 			형식)
 * 				if(조건문) => 조건문은 반드시 (부정,비교,논리)
 * 				{
 * 					조건이 true일 때만 수행하는 문장
 * 				}
 * 			= 선택 조건문 (if~else) => 로그인 처리, id중복체크
 * 			형식)
 * 				if(조건문)
 * 				{
 * 					조건이 true일 경우에 수행하는 문장
 * 				}
 * 				else
 * 				{
 * 					조건이 false일 경우에 수행하는 문장
 * 				}
 * 			= 다중 조건문 (if~else if~else if~else) => 하나라도 수행시 그 단계에서 문장을 종료
 * 			형식)
 * 				if(조건문)
 * 				{
 * 					조건이 true일 경우에 수행하는 문장 => 수행시 문장을 종료
 * 				}
 * 				else if(조건문)
 * 				{
 * 					조건이 true일 경우에 수행하는 문장
 * 				}
 *				else if(조건문)
 * 				{
 * 					조건이 true일 경우에 수행하는 문장
 * 				}
 * 				else
 * 				{
 * 					해당 조건이 없는 경우에 무조건 수행하는 문장
 * 				}
 * 			= 선택문 (switch~case)
 * 		= 반복문
 * 			= 반복횟수가 지정된 경우 (for)
 * 			= 반복횟수가 지정되지 않은 경우 (while)
 * 			= 반드시 한 번 이상 수행 (do~while)
 * 		= 반복제어문
 *			= break : 반복 종료
 *			= continue : 특정부분을 제외
 */
import java.util.*;
//정수 2개, char 1(+,-,*,/)
//사칙연산
public class 제어문_단일조건문 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b,c;
		//a,b => 사용자 입력
		//c=> 연산결과 저장
		char op='+';
		
		//사용자의 입력값을 받는다
		Scanner scan=new Scanner(System.in);
		System.out.print("첫번째 정수 입력:");
		a=scan.nextInt();
		
		System.out.print("두번째 정수 입력:");
		b=scan.nextInt();
		// '+' => "+"
		System.out.print("연산자(+,-,*,/):");
		op=scan.next().charAt(0);
		// "+" => 'x'
		//scanner는 char를 받아서 처리하는 기능이 없다=>문자열
		//system.in => 예외처리를 해야 한다
		
		//연산처리
		if(op=='+')
		{
			System.out.printf("%d+%d=%d\n",a,b,a+b);
		}
		if(op=='-')
		{
			System.out.printf("%d-%d=%d\n",a,b,a-b);
		}
		if(op=='*')
		{
			System.out.printf("%d*%d=%d\n",a,b,a*b);
		}
		if(op=='/')
		{
			if(b==0)
			{
				System.out.println("0으로 나눌 수 없습니다"); //오류처리!!!
			}
			else
			{
				System.out.printf("%d/%d=%.2f\n",a,b,a/(double)b); //소수점 처리
			}
		
		}
		System.out.println("프로그램 종료");
	}//main end=>프로그램 종료
	//main =>프로그램 시작, 종료 메소드

}
