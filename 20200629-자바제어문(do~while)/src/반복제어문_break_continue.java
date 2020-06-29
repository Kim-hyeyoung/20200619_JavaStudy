/*
 * updown 게임 => 잘못된 입력 => 성적계산
 * 게임 => 입력 관련 => continue, 종료 => break
 * 숫자를 맞출 때까지 게임을 계속
 */
import java.util.*;
public class 반복제어문_break_continue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 임의의 숫자를 저장(난수:com)
		int com=(int)(Math.random()*100)+1; //1~100사이 임의의 수를 추출 => 0.0 ~ 0.99 => 0.0 ~ 99.0=> 0 ~ 99 + 1 => 1~100
		//main은 재사용이 불가 => 프로그램은 프로그래머가 명령을 한 순서로 진행 => 한줄씩 수행한다
		//횟수 지정이 없는 경우 => 무한루프
		Scanner scan=new Scanner(System.in);
		while(true) {
			//사용자 입력값 받기
			System.out.print("1~100까지 사이의 정수 입력:");
			int user=scan.nextInt();
			
			if(user<1 || user>100) {
				//처음부터 다시 수행
				System.out.println("잘못된 입력입니다");
				continue;
			}
			//정상수행
			//비교
			if(user>com) {
				System.out.println("입력값보다 낮은 정수를 입력하세요");
			}
			else if(user<com) {
				System.out.println("입력값보다 높은 정수를 입력하세요");
			}
			else {
				System.out.println("Game Over!!");
				break; //혹은 system.exit(0)을 줘서 종료시킬 수도 있음
				//반복문 종료
			}
		}
		

	}

}
