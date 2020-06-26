/*
 * 문자열 저장 변수 => String
 * 형식)
 * 		char c='A' => 문자 한개만 저장
 * 		String s="ABCDEFG" => 원하는 개수만큼 문자 저장  / 웹, 윈도우(모든 데이터 문자열)
 * 
 * 		String : 클래스
 * 		기능(java 제공)
 * 		=> 문자 개수 확인
 * 			String s="ABCDEF";
 * 			s.length()=>6
 * 		=> 글자 자르기
 * 			String s="ABCDEF";
 * 			s.charAt(0)=>'A'
 * 
 * 사용자 문자열을 입력하여 대문자 개수와 소문자 개수 확인 
 *
 */
import java.util.*;
public class 반복문_while3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="ABCDEFG"; // 문자열 저장
		//System.out.println(s);
		Scanner scan=new Scanner(System.in);
		System.out.print("문자열을 입혁하세요>>");
		s=scan.nextLine();//String으로 받은값을 저장
		System.out.println(s);
		//System.out.println("개수:"+s.length()); //scanner는 공백인식 못하므로 공백 입력시 문자개수를 제대로 못셈
													//=> nextLine()으로 공백포함하여 하나로 인식하도록 해야 함
		int a=0,b=0; //a는 소문자 개수, b는 대문자 개수
		int i=0; // 문자의 개수만큼 증가하는 변수 => 루프변수 
		/*
		 * ABCDEFG => 7
		 * 0123456         =>  배열이 0부터 시작하기 때문에 시작변수를 0으로 함
		 */                    //     　↓
		while(i<s.length()) //   부등호에 '='이 안 들어가는 이유
		{
			char c=s.charAt(i);
			if(c>='A' && c<='Z')
				b++;
			if(c>='a' && c<='z')
				a++;
			
			i++;
		}
		System.out.println("대문자 개수:"+b);
		System.out.println("소문자 개수:"+a);
		
	}

}
