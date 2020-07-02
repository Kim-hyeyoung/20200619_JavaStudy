
public class 문제풀이1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1에서 100까지 3의 배수를 더하는 while문의 빈칸에 적절한 코드
		/*
		char[] c=new char[10];
		int[] n= {0,1,2,3,4,5};
		char[] day= {'일','월','화','수','목','금','토'};
		boolean[] bool={true,false,false,true};
		*/
		int[] arr= {1,2,3,4,5,6,7,8,9,10};
		
		for(int i=1;i<10;i++)
		{
			if(i%3==0)
				System.out.print(i);
		}
		for(int i:arr)
		{
			if(i%3==0)
				System.out.print(i);
		}
		
	}

}
