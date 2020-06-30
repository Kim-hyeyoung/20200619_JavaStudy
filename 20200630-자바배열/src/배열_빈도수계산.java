/*
 * 개수
 */
public class 배열_빈도수계산 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr=new int[10]; //1~9
		int[] count=new int[10];
		//초기값
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=(int)(Math.random()*10); //0~9
		}
		//출력 => 빈도수 계산
		for(int i:arr)
		{
			System.out.print(i);
		}
		
		System.out.println("\n=====결과=====");
		for(int i=0;i<arr.length;i++)
		{
			count[arr[i]]++;
		}
		
		//출력
		for(int i=0;i<arr.length;i++)
		{
			if(count[i]!=0)
			{
			System.out.println(i+"개수:"+count[i]);
			}
		}
		
		
		
		
		

	}

}
