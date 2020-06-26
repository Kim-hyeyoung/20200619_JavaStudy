/*
 * 	while문 주의점
 * 	1) while문은 조건이 없는 경우 error <=> for(;;)문은 상관없음(무한루프)
 * 	2) while문 무한루프 => while(true):가장 많이 등장
 *  사용자가 5입력 => 1~5까지 합 구하기 
 */
import java.util.*;
public class 반복문_while5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int user=0; //사용자 요청 변수
		int i=1; // 사용자가 요청한 변수까지 증가하도록 하는 루프(증가)변수 / 0불필요하게 더하지 않기 위해 1로 시작
		int sum=0; //누적하여 저장할 곳
		Scanner scan=new Scanner(System.in);
		System.out.println("정수를 입력:");
		user=scan.nextInt();
		while(i<=user)
		{
			sum+=i;
			i++;
		}
		System.out.println(sum);
		
		i=1; // i를 1로 초기화
		//System.out.println("i="+i);
		while(i<=5)
		{
			System.out.print(i);
			i++;
		}
		System.out.println();
		i=5;
		while(i>=1)
		{
			System.out.print(i);
			i--;
		}
	}

}
