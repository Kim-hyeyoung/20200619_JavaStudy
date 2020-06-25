/*
 * for => 횟수가 지정된 반복문
 * => UPDOWN 게임
 * => 컴퓨터가 1~100사이의 난수를 발생
 * => 사용자가 난수를 맞추는 게임
 * 		힌트 => 높다, 낮다
 */
import java.util.*; //사용자 입력
public class 반복문_for7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 1. 컴퓨터가 난수 발생 (1~100)
		 * 		0.0~0.99 * 100 = 0.0~99.0 + 1 => (int)1.0~100.0
		 */
		int com=(int)(Math.random()*100)+1;
		// 2. 사용자 입력
		Scanner scan=new Scanner(System.in);
		int cnt=0;
		for(;;) {   //무한루프 => 원래는 while(true)로 쓰는 경우가 더 많음 => 사용자가 몇번만에 맞힐지 모르기 때문에 무한
			//사용자 입력값 받기
			System.out.println("1~100사이의 정수 입력:");
			int user=scan.nextInt();
			if(user<1 || user>100) { //오류처리
				System.out.println("잘못된 입력입니다!!");
				continue; // 처음으로 다시 돌아가서 수행 => for문의 증가식으로 이동
			} 
			//정상적으로 입력이 된 상태
			cnt++;
			//비교
			if(com>user) {
				System.out.println("입력된 값보다 높은 수를 입력하세요");
			}
			else if(com<user){
				System.out.println("입력된 값보다 낮은 수를 입력하세요");
			}
			else {
				System.out.println("Game Over!!");
				System.out.println("입력횟수:"+cnt); //입력횟수 카운트
				//종료
				break; //for문 종료
			}
		}
		
		System.out.println("프로그램 종료");
		

	}

}
