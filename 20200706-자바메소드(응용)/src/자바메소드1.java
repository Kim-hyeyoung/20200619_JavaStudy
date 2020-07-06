/*
 * 5개의 정수를 보낸다
 * 5개 정수 => sort => 전송
 * 			====
 * 			select
 */
public class 자바메소드1 {
	static int[] sort(int[] arr,String type)
	{
		//sort
		for(int i=0;i<arr.length-1;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(type.contentEquals("ASC"))
				{
					if(arr[i]>arr[j])
					{
						int temp=arr[i];
						arr[i]=arr[j];
						arr[j]=temp;
					}
				}
				if(type.contentEquals("DESC"))
				{
					if(arr[i]<arr[j])
					{
						int temp=arr[i];
						arr[i]=arr[j];
						arr[j]=temp;
					}
				}
			}
		}
		return arr;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 호출
		int[] arr= {10,40,30,50,20};
		System.out.println("정렬 전:");
		for(int i:arr)
		{
			System.out.print(i+" ");
		}
		System.out.println("\n정렬 후:");
		int[] result=sort(arr,"ASC");
		for(int i:result)
		{
			System.out.print(i+" ");
		}
		System.out.println();
		result=sort(arr,"DESC");
		for(int i:result)
		{
			System.out.print(i+" ");
		}

	}

}
