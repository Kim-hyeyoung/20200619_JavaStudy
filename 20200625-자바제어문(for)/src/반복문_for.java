/*
 * 반복문 -for, while, do~while
 * =====프로그래머의 사용 빈도
 * 		for : 반복 횟수가 있는 경우에 주로 사용
 * 		while : 반복 횟수가 없는 경우에 주로 사용
 * 			for <-> while 변경 가능해야 함 / 다중조건문 <-> 선택문
 * 		do~while : 조건을 나중에 검색 => 한번 이상은 반드시 수행!
 * 
 * 		1) for
 * 		형식)
 * 					1		2		4
 * 				   =======  ====  ===
 * 				for(int i=1;i<=10;i++)
 * 				{
 * 					3 반복 수행문장 : 10번을 수행하는 문장
 * 				}
 * 				1. 1부터 시작 => i=1
 * 				2. i가 10이 될 떄까지
 * 				3. 수행문장
 * 				4. 증가 => i++
 * 				=> 초기값, 조건식, 수행문장, 증가식 (2,3,4가 값이 false가 될 때까지 반복된다)
 * 					true => 반복
 * 					false => 종료
 * 				=> 실제형식
 * 					for(초기값(변수);조건(비교연산자,논리연산자,부정연산자);증가(증감))
 * 				!!!주의 : 조건식이 false가 없으면 무한루프가 된다!!!
 * 				
 */
public class 반복문_for {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1~10까지 출력
		for(int i=1;i<=10;i++)
		{
			System.out.println(i);
	    }

	}

}
