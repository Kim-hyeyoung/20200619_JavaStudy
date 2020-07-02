/*
 * 문자열을 저장할 수 있는 공간 :String
 * 	=> 일반변수의 역할
 * 	=> 클래스의 역할 => 기능(메소드)
 * 
 * 	주요 기능
 * 	= 문자열 비교 : equals()
 * 	= 포함 문자 : contains()
 * 	= 문자열 중에 한 개의 문자 :charAt()
 * 	= 저장된 문자의 개수 : length()
 * 	= 문자 자르기 : substring()
 * 	= 찾는 문자의 위치 : indexOf(), lastIndexOf()
 * 	= 모든 데이터형을 문자열로 변환 : valueOf()
 * 	= 공백 문자 제거 : trim()=> 좌우만 제거
 * 				ex) " Hello Java " => "Hello Java"
 * 	= 문자열=>char() : toCharArray()
 * 	= startsWith, endsWith => 검색기
 * 	= 문자열을 숫자로 : parseInt("2") => 문자 "2"를 정수 2로
 */

// substring : 필요한 문자만 추출 => 형태소 분석(명사, 부사, 형용사)
/*
 *  "Hello Java"
 *  substring(int start) => 시작부터 끝까지 자르기 => substring(6) => Java
 *  substring(int start,int end) => 중간부분 자르기 => substring(,)
 */

public class 문자열2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String msg="100-010";
		//System.out.println(msg.substring(5)); //=> 56789
		//System.out.println(msg.substring(1,5)); //=>1234 => endindex는 -1해서 잘라오기 때문에 5까지 자르고 싶으면 endindex 6으로 해야 함
		System.out.println(msg.substring(0,3));
		System.out.println(msg.substring(4,7));
		System.out.println(msg.substring(4));
		

	}

}
