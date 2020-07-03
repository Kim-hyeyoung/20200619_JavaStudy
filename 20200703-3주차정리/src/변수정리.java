
public class 변수정리 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] com=new int[10]; //숫자를 저장 1~10 => 중복(임의로 추출)
		/*
		for(int i=0;i<10;i++)
		{
			com[i]=(int)(Math.random()*10)+1;
		}
		for(int i:com)
		{
			System.out.print(i+" ");
		}
		*/
		int su=0; //난수값 저장
		//중복이 없으면(false) 저장, 중복이 되면(true) 난수를 다시 발생
		boolean bCheck=false;
		for(int i=0;i<10;i++)
		{
			bCheck=true;
			while(bCheck)
			{
				su=(int)(Math.random()*10)+1;
				bCheck=false;
				for(int j=0;j<i;j++)
				{
					if(com[j]==su)
					{
						bCheck=true;
						break;
					}
				}
			}
			com[i]=su;
		}
		for(int i:com)
		{
			System.out.print(i+" ");
		}
		
		
		
		
		
		

	}

}
