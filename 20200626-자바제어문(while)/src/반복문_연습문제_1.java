
public class �ݺ���_��������_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0;
		int cnt=0;
		for(int i=100;i<=999;i++)
		{
			if(i%7==0)
			{
				cnt++;
				sum+=i;
			}
			
			
		}
		System.out.println("7�� ��� ����:"+cnt);
		System.out.println("7�� ��� ��:"+sum);
		
		sum=0;
		cnt=0;
		int i=100;
		while(i<=999)
			{
				if(i%7==0)
				{
					cnt++;
					sum+=i;
				}
				i++;
			}
		
		System.out.println("7�� ��� ����:"+cnt);
		System.out.println("7�� ��� ��:"+sum);
		
	}

}
