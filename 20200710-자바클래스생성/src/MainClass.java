	/*
	 * 클래스
	 * =====
	 * 변수=> 여러개를 저장할 때 (반드시 공통으로 들어가는 데이터여야 함) => 추상화
	 * ex) 영화 정보
	 * 	=> 영화명, 감독, 출연, 장르, 개봉, 줄거리...
	 * 변수의 종류
	 * ====================================================
	 * =멤버변수(인스턴스 변수) => new를 사용할 때마다 따로 저장되는 변수
	 * 	- 메모리가 만들어지는 시점 => new를 이용할 때
	 * 	- heap : 프로그래머가 관리하는 영역 (자동처리가 안됨)
	 * 			 메모리를 사용하지 않을 경우 => 직접처리,GabageCollection)
	 * =공유변수(정적변수/static) => 메모리가 한 개, 공통으로 사용
	 * 	- 메모리가 만들어지는 시점 => 컴파일러가 컴파일할 때 자동으로 생성
	 *  - 메소드영역(static,메소드)
	 *  =====================================================> 프로그램 종료시까지 메모리 저장
	 * =지역변수 => 지역변수, 매개변수
	 * 	- 메모리가 만들어지는 시점 => 메소드 호출시
	 *  - 메모리 자체 관리, {}을 벗어나면 자동 회수 => stack(LIFO)
	 *  
	 * 생성자 
	 * 	=> 멤버변수의 초기값 부여
	 * 	=> 제어문 이용, 파일읽기, 구현하고 데이터값을 가지고 올 때, 보안 => 생략 가능 (컴파일러가 자동으로 추가해줌 => default 생성자(매개변수가 없는 생성자))
	 *  => 생성자는 반드시 필요
	 *  => 메모리에 저장(클래스)
	 *     ==============
	 *     new 생성자() => 한 번만 호출한다 => this(자신)
	 * 
	 * 메소드 => 기능
	 * 		리턴형 메소드명(매개변수..)  선언부
	 * 		{
	 * 			구현부
	 * 		} =>선언부와 구현부가 합쳐져야 저장됨
	 * 		**저장이 안된 메소드
	 * 		= 인스턴스 메소드 => 클래스마다 따로 사용
	 * 		= 정적 메소드 => static => 모든 클래스 공통으로 사용
	 * 		= 추상 메소드 => 선언부만 존재 (라이브러리=>선언부만 있고 구현은 프로그래머가 하도록)
	 * 
	 * 	=>
	 * 	=>
	 * 	=>
	 */
class Student{
	//학생 1명에 대한 정보 => 메모리 공간을 여러 개 만들 수 있다 (new)
	String name;
	String subject;
	int year;
	static String school;
	//Student(){} //=> default 생성자
}
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student.school="SIST";
		Student s=new Student(); //name,year,subject => 저장 (s라는 주소에 저장)
		System.out.println(s); //Student@15db9742
		
		System.out.println(s.name);
		System.out.println(s.subject);
		System.out.println(s.year);

		s.name="홍길동";
		s.subject="개발과";
		s.year=3;
		
		System.out.println(s.name);
		System.out.println(s.subject);
		System.out.println(s.year);
		System.out.println(Student.school);
		
		
		Student s1=new Student();
		System.out.println(s1);
		s1.name="심청이";
		s1.subject="광고과";
		s1.year=2;
		
		System.out.println(s1.name);
		System.out.println(s1.subject);
		System.out.println(s1.year);
		System.out.println(Student.school);
		
		String ss="Hello Java";
		ss.replace('H', 'K');
		String ss1="1234567890";
		String. valueOf(10);
	
		
	}

}
