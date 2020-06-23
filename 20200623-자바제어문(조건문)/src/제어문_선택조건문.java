/*
 * 	선택 조건문
 * 	if(조건문)
 * {
 * 		조건문이 true면 수행하는 문장 구현
 * }
 * else
 * {
 * 		조건문이 false면 수행하는 문장 구현
 * }
 * 	조건문 => 핵심 (조건제작) (137.p)
 * 
 * 	==
 * 	&&
 * 	||
 * 	
 * 	문자열 => !=, == 사용하지 않는다
 *  => equals()
 *     !equals()
 */
import java.util.*;
public class 제어문_선택조건문 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 문자 한개를 입력 받아서 알파벳인지 확인
		// 변수설정
		char ch='A';
		Scanner scan=new Scanner(System.in);
		System.out.println("문자 입력:");
		// 자바는 모든 시작 번호가 0부터 시작한다
		ch=scan.next().charAt(0); //"ABC"를 입력해도 첫번째 글자인 'A'만 가져옴
		
		if((ch>='A' && ch<='Z') || (ch>='a' && ch<='z')) {
			System.out.println(ch+"는(은) 알파벳입니다");
		}
		else {
			System.out.println(ch+"는(은) 알파벳이 아닙니다");
		}
	}

}
