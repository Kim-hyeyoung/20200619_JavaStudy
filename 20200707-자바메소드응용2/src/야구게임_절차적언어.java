/*
 * 1. 3개의 정수를 난수로 발생(중복없이) => 1~9까지
 * 2. 사용자 입력
 * 3. 비교
 * 4. 힌트
 * 5. 정답일 때 종료
 * =========조립 process()
 */
import java.util.*;

public class 야구게임_절차적언어 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1. 중복없는 난수 3개 발생
		int[] com=new int[3];
		int su=0; //난수 저장 변수
		boolean bCheck=false; //중복 여부 확인
		for(int i=0;i<3;i++)
		{
			bCheck=true;
			while(bCheck)
			{
				//난수 발생
				su=(int)(Math.random()*9)+1;
				bCheck=false;
				//while문 종료 조건
				//체크
				for(int j=0;j<1;j++)
				{
					if(com[j]==su)
					{
						bCheck=true;
						break;
					}
				}
			}
			com[i]=su;
			//System.out.print(com[i]+"\t");
		}
		//2. 사용자 입력
		int[] user=new int[3];
		//입력
		Scanner scan=new Scanner(System.in);
		while(true)
		{
			System.out.print("세자리 정수 입력:");
			int input=scan.nextInt();
			//오류처리 => 세자리 정수가 입력 안됐을 경우
			if(input<100 || input>999)
			{
				System.out.println("잘못된 입력입니다");
				//처음으로 이동
				continue;
			}
			//세자리 수 자리수별로 자르기
			user[0]=input/100;
			user[1]=(input%100)/10;
			user[2]=input%10;
			
			//두번째 오류처리 => 중복처리
			if(user[0]==user[1] || user[1]==user[2] ||user[0]==user[2])
			{
				System.out.println("중복된 정수는 사용할 수 없습니다");
				continue;
			}
			//세번째 오류처리 => 0사용 불가
			if(user[0]==0 ||user[1]==0 ||user[2]==0)
			{
				System.out.println("0은 사용할 수 없습니다");
				continue;
			}
			
			//비교
			int s=0,b=0;
			for(int i=0;i<3;i++)
			{
				for(int j=0;j<3;j++)
				{
					if(com[i]==user[j])
					{
						if(i==j)
							s++;
						else
							b++;
					}
				}
			}
			System.out.printf("Input Number:%d,Result:%dS-%dB\n",input,s,b);
			//종료여부
			if(s==3)
			{
				System.out.println("Game Over!!");
				break;
			}
		}
		
		
		

		
		
		
		
	}

}
