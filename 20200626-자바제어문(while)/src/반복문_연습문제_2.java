
public class �ݺ���_��������_2 {

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
		System.out.println("����"+cnt);
		System.out.println("��"+sum);
		
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
		System.out.println("����"+cnt);
		System.out.println("��"+sum);
	}

}
