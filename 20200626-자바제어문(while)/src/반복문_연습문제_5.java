
public class 반복문_연습문제_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=0; //7의 배수의 합
		int b=0; //9의 배수의 합
		for(int i=1;i<=1000;i++)
		{
			if(i%7==0)
			{
				a+=i;
			}
			if(i%9==0)
			{
				b+=i;
			}
		}
		System.out.println("7의 배수:"+a);
		System.out.println("9의 배수:"+b);
		System.out.println("7의 배수+9의 배수:"+(a+b));
		
		a=0;
		b=0;
		int i=1;
		while(i<=1000)
		{
			if(i%7==0)
			{
				a+=i;
			}
			if(i%9==0)
			{
				b+=i;
			}
			i++;
		}
		System.out.println("7의 배수:"+a);
		System.out.println("9의 배수:"+b);
		System.out.println("7의 배수+9의 배수:"+(a+b));

	}

}
