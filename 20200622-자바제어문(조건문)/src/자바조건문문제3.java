/*
 * 	사용자 입력 => 0, 1, 2
 * 
 * 	0이면 가위
 * 	1이면 바위
 * 	2면 보
 */
import java.util.*;
public class 자바조건문문제3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.print("가위(0),바위(1),보(2) 입력:");
		int user=scan.nextInt();
		
		if (user==0)
			System.out.println("user:가위");
		if (user==1)
				System.out.println("user:바위");
		if (user==2)
				System.out.println("user:보");
		
		// 컴퓨터
		int com=(int)(Math.random()*3);
				//==============>0.0 ~ 0.99 * 3 => 0.0 ~ 2.9
		//정수, 실수, 문자일 경우에는 사용이 가능하지만 ""문자열은 ==으로 비교가 불가능 => equals()
		if(com==0)
			System.out.println("컴퓨터:가위");
		if(com==1)
			System.out.println("컴퓨터:바위");
		if(com==2)
			System.out.println("컴퓨터:보");
		
		//결과를 비교
		/*
		 * 	컴퓨터
		 * 		가위
		 * 			사용자
		 * 			가위
		 * 			바위
		 * 			보
		 * 컴퓨터
		 * 		바위
		 * 			사용자
		 * 			가위
		 * 			바위
		 * 			보
		 * 컴퓨터
		 * 		보
		 * 			사용자
		 * 			가위
		 * 			바위
		 * 			보
		 */
		//컴퓨터가 가위일때
		//중첩조건문
		/*
		 *  
		 */
		

	}

}
