/*
 * =>1~100까지 짝수의 합, 홀수의 합
 * =>1~100까지 3의 배수의 합, 5의 배수의 합, 7의 배수의 합을 출력
 * =>100~999까지 7의 배수의 개수
 * =>1-2+3-4+5-6+7-8+9-10
 */
public class 반복문_for5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		int odd=0,even=0;
		for(int i=1;i<=100;i++) {
			if(i%2==0) 
				even+=i;
			else
				odd+=i;
		}
		System.out.println("1~100까지 짝수의 합:"+even);	
		System.out.println("1~100까지 홀수의 합:"+odd);	
			*/
		/*
		int three=0, five=0,seven=0;
		for(int i=1;i<=100;i++) {
			if(i%3==0)
				three+=i;
			if(i%5==0)
				five+=i;
			if(i%7==0)
				seven+=i;
		}
		System.out.println("1~100까지 3의 배수의 합:"+three);
		System.out.println("1~100까지 5의 배수의 합:"+five);
		System.out.println("1~100까지 7의 배수의 합:"+seven);
		*/
		/*
		int cnt=0;
		for(int i=100;i<=999;i++) {
			if(i%7==0)
				cnt++;  //개수를 셀 때는 ++, +=으로 주면 합으로 나옴
		}
		System.out.println("100~999까지 7의 배수의 개수:"+cnt);
		*/
		/*
		int sum=0;
		for(int i=1;i<=10;i++)
			if(i%2==0)
				sum-=i;
			else
				sum+=i;
		System.out.println(sum);
		*/
		//=>★★☆★★☆★★☆★★☆
		for(int i=1;i<=12;i++) {
			if(i%3==0)
				System.out.print("☆");
			else
				System.out.print("★");
		}
	
		
		
		
		}

	}


