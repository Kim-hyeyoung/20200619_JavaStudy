/*
 *  메소드
 *  	1) 자동으로 메모리에 저장 => 정적 메소드
 *  		=> 형식
 *  		static(실행하자마자 메모리에 저장되는 형식) 리턴형(결과값) 메소드명(매개변수..)
 * 			{
 * 				return값
 * 			} 		
 * 
 *  	2) 프로그래머가 메모리를 만든 다음 저장 => 인스턴스 메소드
 *  		=> new연산자를 이용하여 저장 가능
 *  		=> 프로그램의 중심
 *  		리턴형(결과값) 메소드명(매개변수..)
 * 			{
 *   			return값
 * 			} 
 * 
 *  	3) 메소드의 선언부만 사용 => 추상 메소드
 *  		리턴형(결과값) 메소드명(매개변수..); => 추상클래스(인터페이스)
 *  
 *  	1. 메소드 형태
 *  		선언부 => 메모리에 저장x
 *  		구현부 => 메모리에 저장o => 필요한 위치에서 사용 가능
 *  
 *  		리턴형 메소드명(매개변수..) => 선언부
 *  		{
 *  			가공(처리)
 *  			return 결과값
 *  		}	=> 구현부
 *  
 *  		결과값이 없는 경우(void) return 생략 가능
 *  		=> JVM에서 자동으로 return 추가
 *  		return : 메소드 종료 시점 => 모든 메소드에는  return이 있다
 *  
 *   		=> 리턴형(결과값) => 결과값은 반드시 하나만 설정
 *   							기본형(정수,실수..)
 *   							데이터가 여러 개일 경우 => 데이터를 모아서(배열,클래스) 한 번에 전송
 *   		=> 사용자 입력 값(매개변수,인자,인수) => 사용자 요청 값 (한 개일 수도,여러 개일 수도있지만 3개 이상 초과x => 배열,클래스)
 *   									=> 10명의 국어점수 평균
 *   		=> return문 => 모든 메소드에서 반드시 사용 => 메소드 종료
 *   						위치는 상관없음
 *   						예외) 결과값이 없는 경우 생략 가능
 *   
 *   
 */
/*
 *  메소드는 클래스 안에서 만든다
 *  메소드 안에 메소드는 선언할 수 없다
 */
// 사용자로부터 정수를 입력받아 해당 구구단을 출력하는 메소드
		/*
		 *  1)결과값o 매개변수 o => 구구단을 묶어서 넘겨준다
		 *  	string
		 *  2)결과값x 매개변수o => 메소드 안에서 출력
		 *  	void
		 */
import java.util.*;
public class 자바메소드1 {
	static String gugudan1(int dan)
	{
		String gu="";
		for(int i=1;i<=9;i++)
		{
			gu+=dan+"*"+i+"="+dan*i+"\n";
		}
		return gu;
	}
	static void gugudan2(int dan)
	{
		//전체처리 => 출력까지
		for(int i=1;i<=9;i++)
		{
			System.out.printf("%d*%d=%d\n",dan,i,dan*i);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.print("정수 입력:");
		//int dan=scan.nextInt();
		//구구단을 출력할 메소드 호출
		//gugudan2(dan);
		
		//String gu=gugudan1(9); //gugudan1(9)의 결과값을 gu에 저장
		//System.out.println(gu);
		
		for(int i=2;i<=9;i++)
		{
			String gu=gugudan1(i); //반복적인 기능 제거
			System.out.println(gu);
		}
		return; //(void)main 자동추가로 생략가능
		//메소드는 호출하면 항상 메소드의 시작부터 종료까지 반복해서 호출
		

		
		
		
		
		
		
		
		
		
		
	}

}
