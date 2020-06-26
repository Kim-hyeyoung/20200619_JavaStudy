
public class ¹Ýº¹¹®_¿¬½À¹®Á¦_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=0; //Â¦¼öÇÕ
		int b=0; //È¦¼öÇÕ
		for(int i=1;i<=30;i++)
		{
			if(i%2==0)
			{
				a+=i;
			}
			if(i%2!=0)
			{
				b+=i;
			}
		}
		
		System.out.println("Â¦¼öÇÕ:"+a);
		System.out.println("Â¦¼öÇÕ:"+b);

		
		a=0;
		b=0;
		int i=1;
		while(i<=30)
		{
			if(i%2==0)
			{
				a+=i;
			}
			if(i%2!=0)
			{
				b+=i;
			}
			i++;
		}
		System.out.println("Â¦¼öÇÕ:"+a);
		System.out.println("Â¦¼öÇÕ:"+b);	
	}

}
