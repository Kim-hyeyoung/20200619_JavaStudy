/*
 * 	다중 조건문 => 조건이 많은 경우에 사용
 * 	========조건에 맞는 문장만 실행(1번만 수행)
 * 	int a=15;
 * 	if(a%3==0)
 * 		system.out,println("3의 배수"); => 3의 배수이자 5의 배수인데 여기서 종료되므로 오류!!! => else if가 아니라 if문으로 처리해야 함
 * 	if(a%5==0)
 * 		system.out,println("5의 배수");
 * 	if(a%7==0)
 * 		system.out,println("7의 배수");
 * 
 * 	성적 계산 =>
 * 
 * 	*3개의 점수를 받아서 총점, 평균, 학점 출력
 */
import java.util.*;
public class 다중조건문 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 변수 => 저장 공간을 설정
		int kor=0, eng=0, math=0;
		int total=0;
		double avg=0.0;
		char hakjum='A';
		// 입력을 받는다 => 변수에 저장
		Scanner scan=new Scanner(System.in);
		System.out.print("국어 점수 입력:");
		kor=scan.nextInt(); // 키보드로 입력한 정수를 읽어온다
		System.out.print("영어 점수 입력:");
		eng=scan.nextInt();
		System.out.print("수학 점수 입력:");
		math=scan.nextInt();
		// 총점, 평균, 학점 계산
		total=kor+eng+math;
		avg=total/3.0; // 소수점이하 출력
		System.out.println("====성적====");
		System.out.println("국어 점수:"+kor);
		System.out.println("영어 점수:"+eng);
		System.out.println("수학 점수:"+math);
		System.out.println("총점:"+total);
		System.out.printf("평균:%.2f\n",avg);
		// 학점
		if(avg>=90)
			hakjum='A';
		else if(avg>=80)
			hakjum='B';
		else if(avg>=70)
			hakjum='C';
		else if(avg>=60)
			hakjum='D';
		else 
			hakjum='F';
		System.out.println("학점:"+hakjum);
		
		
	}

}
