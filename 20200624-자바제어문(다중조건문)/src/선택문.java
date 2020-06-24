/*
 * 선택문
 * 	=> switch(a)(정수,문자,문자열)
 * 		{
 * 			//정수
 * 			case 정수값:
 * 				처리문장
 * 			case 정수값:
 * 				처리문장           ======> 콜론(:), case뒤 값(라벨)은 중복x
 * 		}
 * 형식)
 * 	switch(정수){  => break가 없는 경우에는 모든 문장을 수행
 * 		case 1:
 * 			처리문장1
 * 		case 2:
 * 			처리문장2
 *		 case 3:
 * 			처리문장3
 * 		}
 * 
 */
import java.util.*;
public class 선택문 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int select=0;
		Scanner scan=new Scanner(System.in);
		System.out.println("정수(1~5):");
		select=scan.nextInt();
		
		switch(select) 
		{
		case 1:
			System.out.println("1번을 입력하였습니다");
			break; //switch문장을 종료한다 (없으면 마지막 케이스까지 전부다 출력됨)
		case 2:
			System.out.println("2번을 입력하였습니다");
			break;
		case 3:
			System.out.println("3번을 입력하였습니다");
			break;
		case 4:
			System.out.println("4번을 입력하였습니다");
			break;
		case 5:
			System.out.println("5번을 입력하였습니다");
			break;
		default: //5번 외의 다른 숫자 입력시 처리
			System.out.println("1~5번까지만 사용하세요");
			
		}
	}

}
