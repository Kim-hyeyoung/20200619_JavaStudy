/*
 * ========
 *  3 6 9
 * ========  int[] com={3,6,9};
 * 
 * ===결과===  =>야구게임
 * S:●
 * B:●●
 * ========
 */
import java.util.*;
public class 자바배열_용도2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] com= {3,6,9};
		//사용자 입력값 저장
		int[] user=new int[3];
		Scanner scan=new Scanner(System.in);
		//입력받기
		while(true)
		{
			System.out.print("3자리 정수를 입력:"); //100~999
			//조건
			int input=scan.nextInt();
			//잘못된 입력 처리 (범위를 벗어난 경우)
			if(input<100 || input>999)
			{
				System.out.println("잘못된 입력입니다"); //while문 처음으로 이동
				continue;
			}
			//잘못된 입력 처리 (중복된 수가 들어간 경우)
			//저장=>123
			//각 자리수의 수를 구하는 법
			user[0]=input/100; //123/100 =>1
			user[1]=(input%100)/10; //123%100 =>23/10=>2
			user[2]=(input%10); //123/10 =>3
			
			if(user[0]==user[1]||user[1]==user[2]||user[0]==user[2])
			{
				System.out.println("중복된 수는 사용할 수 없습니다");
				continue;
			}
			
			//비교
			int s=0,b=0;
			for(int i=0;i<3;i++) //com
			{
				for(int j=0;j<3;j++) //user
				{
					if(com[i]==user[j])//같은 수가 있는지 확인
					{
						if(i==j)
							s++;
						else
							b++;
					}
				}
			}
			
			//결과값 출력
			System.out.println("=====결과=====");
			System.out.print("S:");
			for(int i=0;i<s;i++)
			{
				System.out.print("●");
			}
			System.out.print("\nB:");
			for(int i=0;i<b;i++)
			{
				System.out.print("●");
			}
			System.out.println("\n===========");
			
			//while 종료 여부
			if(s==3)
			{
				System.out.println("Game Over!!");
				break;
			}
			
			
		}
		
		
		
		

		
		
		
		
		
		
		
	}

}
