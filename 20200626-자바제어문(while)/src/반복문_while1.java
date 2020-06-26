/*
 * while=> 무한루프 (데이터베이스(오라클), 파일읽기, 서버제작, 게임)
 * 				================         ======
 * 				파일:XML,JSON 
 * 				=> break(종료)
 * 형식)
 * 		초기값  ==1
 * 		while(조건식) ==2  => true일 경우{안의 내용 수행} / false일 경우(종료)
 * 		{
 * 			반복수행문장 ==3
 * 			증가식 ==4 => 조건식 비교
 * 		}
 * 
 * 		1~10 정수를 출력
 * 		1) 1~10까지 변경되는 변수 => 루프변수
 * 			int i=1;
 * 			while(i<=10)
 * 			{
 * 				system.out.println(i);
 * 				i++;   => i=11이 되면 false가 되서 종료됨
 * 			}
 *  정수값을 받아서 받은 정수 개수만큼 ★을 출력
 */
import java.util.*;
public class 반복문_while1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int user=0;
		int i=1; // 사용자가 요청한 값까지 변경할 변수 => while문에서 사용하는 변수
		//정수값을 받는다
		Scanner scan=new Scanner(System.in);
		System.out.print("정수 입력:");
		user=scan.nextInt();
		
		while(i<=user)
		{
			System.out.print("★");
			i++; //user의 개수가 될 때까지 루프 실행
		}
		

	}

}
