/*
 * 문자열 비교 : equals()
 * 문자 찾기 : contains()
 * 시작 문자열 : startsWith()
 * 끝나는 문자열 : endsWith()
 * 문자열 자르기 : substring()
 * 문자 추출 : charAt()
 * 문자의 개수 :length()
 * 공백문자 제거 : trim()
 * 문자의 위치 찾기 : indexOf(), lastIndexOf()
 * 형변환 : valueOf()
 */
//로그인 처리
import java.util.*;
public class 문자열1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// id. pwd
		final String ID="admin";
		final String PWD="1234";
		
		Scanner scan=new Scanner(System.in);
		System.out.print("ID를 입력:");
		String id=scan.nextLine();
		System.out.print("비밀번호 입력:");
		String pwd=scan.nextLine();
		
		// 결과
		//if(id==ID && pwd==PWD)는 불가능 => 문자열 비교시 저장된 문자 자체가 저장된 것이 아닌 주소값만 저장되어 있기 때문!
		
		/*
		 * equals : 대소문자 구분
		 * equalsIgnoreCase : 대소문자 구분 X
		 */
		if(id.equalsIgnoreCase(ID) && pwd.equals(PWD)) 
		{
			System.out.println("로그인 되었습니다");
		}
		else
		{
			System.out.println("ID나 비밀번호가 틀렸습니다");
		}
		
		
		
		
		
		
		

	}

}
