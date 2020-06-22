/*
 * 	20200622->제어문
 * 		=> 종류
 * 			1. 조건문
 * 				=> 단일조건문
 * 					if(조건문 => true/false)
 * 					{
 * 						실행문장 => 조건이 true일 경우에 처리하는 문장
 * 							  => 조건이 false가 되면 실행문장을 수행하지 않는다	
 * 					}
 * 					*** 모든 제어문은 {}을 사용하지 않으면 하나의 문장만 수행한다
 * 				=> 선택조건문
 * 						true일 경우 ex) 로그인 처리가 될 경우
 * 						false일 경우 ex) 로그인 처리가 안 된 경우
 * 					형식) => 사용빈도가 많다
 * 						if(조건문)
 * 							조건이 true일 경우 처리 문장
 * 						else
 * 							조건이 false일 경우 처리 문장
 * 				=> 다중조건문 : 조건에 해당하는 문장만 수행 => 한 번만 수행
 * 					형식)
 * 						if(조건문)
 * 							실행문장1 => 조건이 true일 때 수행하고 종료
 * 						else if(조건문)
 * 							실행문장2 => 조건이 true일 때 수행하고 종료
 * 						else if(조건문)
 * 							실행문장3 => 조건이 true일 때 수행하고 종료 
 * 						else
 * 							실행문장4 => 조건에 해당하는 사항이 없을 때 수행
 * 			2. 선택문
 * 			3. 반복문
 * 			4. 반복제어문
 * 		=> 형식
 * 		=> 흐름 이해
 * 		=> 구현
 */
public class 자바단일조건문 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int score=60;
		// score가 60이상이면 성공
		// 60이하면 실패
		if (score>=60)
			System.out.println("Success");
		if (score<60)
			System.out.println("Fail");
	}

}
