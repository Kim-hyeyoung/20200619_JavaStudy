
public class 반복문_연습문제_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0;
		int cnt=0;
		for(int i=100;i<=999;i++)
		{
			if(i%4!=0)
			{
				sum+=i;
				cnt++;
			}
		}
		System.out.println("개수"+cnt);
		System.out.println("합"+sum);
		
		cnt=0;
		sum=0;
		int i=100;
		while(i<=999)
			{
				if(i%4!=0)
				{
					sum+=i;
					cnt++;
				}
			i++;
			}
		System.out.println("개수"+cnt);
		System.out.println("합"+sum);
	}

}
