/*
 * 프로그램(저장된 데이터+명령문)
 * 변수 => 배열 => 클래스 => 파일 => 데이터베이스-
 * 명령문 => 메소드(한 개의 기능) => 클래스 => 패키지 => .jar(라이브러리)
 * 
 * 메소드 : 특정 작업을 수행하기 위한 컴퓨터의 명령문 집합
 * 			*** 한 가지 일만 수행
 * 			*** 세분화 작업
 * 	목적 : 재사용성 => 재사용 목적 => import
 * 		  중복 코드 제거
 * 사용법 : 구조화(단락(기능))
 * 메소드
 *  = 사용자 정의
 *  	형식)
 *  		반환형 메소드명(매개변수)
 *  		{
 *  			return 값;
 *  			반환형이 없는 경우에는 void => return 생략가능
 *  		}
 *  		=> 메소드 안에서 처리 => 출력 ex)일반 도스
 *  		=> 메소드 안에서 처리 => 결과값 전송 ex) 웹, 윈도우
 *  	= 호출)
 *  		메소드를 호출할 때
 *  		메소드명(값,값)    ex) void method(int a,int b)
 *  							=> method(10,20)
 *  		메소드를 호출하고 수행이 종료되면(return) 다시 호출된 위치로 돌아온다
 *  		int method()
 *  			int a=method()
 *  
 *  = 라이브러리
 * 		
 */
public class 자바메소드1 {
	static void aaa()
	{
		System.out.println("aaa() 호출 시작");
		bbb();
		System.out.println("aaa() 호출 종료");
	}
	static void bbb()
	{
		System.out.println("bbb() 호출 시작");
		ccc();
		System.out.println("bbb() 호출 종료");
	}
	static void ccc()
	{
		System.out.println("ccc() 호출 시작");
		ddd();
		System.out.println("ccc() 호출 종료");
	}
	static void ddd()
	{
		System.out.println("ddd() 호출 시작");
		System.out.println("ddd() 호출 종료");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
