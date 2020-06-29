/*
 * 반복제어문
 * 		= break => 반복문을 종료할 때
 * 		= continue => 특정부분을 제외하고 싶은 경우
 * 			=> 조건문과 같이 사용한다 (if)
 * 			=> break, continue는 한 개의 반복문만 제어할 수 있다
 * 			=> break => 반복문 전체 (for, do~while, while), swtich
 * 			=> continue => 반복문에서만 사용 가능
 * 					=> while(조건식으로 이동)
 * 					=> for(증가식으로 이동)
 * 			=> return => 보류 (메소드 종료)
 */
public class 반복제어문_break {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1~10까지 출력 => 5일 때 종료 => break;
		for(int i=1;i<=10;i++) {
			System.out.print(i+" "); //출력실행이 if조건보다 먼저이기 때문에 5까지 출력하고 종료됨!!!
			if(i==5)
				break;
		}
		
		System.out.println("===== 조건문 =====");
		//1~10까지 홀수만 출력
		
		//1. 조건문
		for(int i=1;i<=10;i++) {
			if(i%2!=0)
			System.out.print(i+" ");
		}
		//2. 2씩 증가
		System.out.println("\n===== 2씩 증가 =====");
		
		for(int i=1;i<=10;i+=2) {
			System.out.print(i+" ");
		}
		//3. continue 사용
		System.out.println("\n===== continue =====");
		for(int i=1;1<=10;i++) {
			if(i%2==0)
				continue;
			System.out.print(i+" ");
		}
	
	}

}
