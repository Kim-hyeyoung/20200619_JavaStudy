/*
 * 클래스 생성시 퍼블릭 메인 체크 안하면 메인으로 생성x
 * 그럴땐 main 직접생성
 */
public class MainClass1 {
	public static void main(String[] args) {
		// 표현 => 자바
		/*
		 * 정수
		 * 	= 10진법   10, 20...
		 * 	= 8진법
		 * 		011  => 9
		 * 	= 16진법
		 *      0x10
		 * 	= 2진법
		 *      0b1010
		 * 실수
		 *  = 저장 크기 => 4byte   10.5f, 10.5F   (4바이트라는 뜻, 메모리 관리에 용이)
		 *  = 저장 크기 => 8byte   10.5, 10.5d, 10.5D (d는 생략 가능, 디폴트)
		 * 문자
		 *  = ''   -> 한글자만 저장
		 * 문자열
		 *  = ""   -> 여러글자 저장
		 *  
		 *  UTF-8 => 2바이트로 변환해서 받는다  ex)한글깨짐 방지
		 * 
		 */
		System.out.println('A');	//한글도 사용 가능 ( c언어는 불가능 / java는 유니코드라 2바이트 가져오고, c언어는 아스키코드(ASC)라 1바이트 가져와서 그럼)
		System.out.println("Hello");
		System.out.println(10.5d);
		System.out.println(10.5f);
		System.out.println(10.5F);
		
		System.out.println(10);  //명령프롬프트에 10을 출력
		System.out.println(0b01010);
		System.out.println(012);
		System.out.println(0b01010);
		System.out.println(0xA);
		
		/*
		 * 	1. 기본문법
		 * ==========
		 * 	=> 대소문자 구분
		 * 		=> 라이브러리 (클래스는 대문자, 메소드는 소문자, 상수는 모두 대문자) ex) System은 클래스, println은 메소드, PI=3.14는 상수)
		 * 		PI=3.14
		 * 
		 * 		변수/상수
		 * 		
		 * 		int kor=100;
		 * 		final int KOR=200;   (파이널 붙어서 상수)
		 * 		=> 명령문이 종료 되면 반드시 ; 사용
		 * 
		 * 
		 * 	3. 들여쓰기
		 */		
		
	}
}
