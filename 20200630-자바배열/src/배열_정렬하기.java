/*
 * 	20 10 40 50 30
 * 		= DESC (내림차순) => 50 40 30 20 10
 * 		= ASC (오름차순) => 10 20 30 40 50
 * 
 * 	1. 선택정렬 => 왼쪽 고정
 * 		20 10 40 50 30
 * 		1R : 1,2 / 1,3 / 1,4 / 1,5  => 차례로 비교하여 (내림차순||오름차순)에 맞게 정렬 => 10 20 40 50 30
 * 		2R : 2,3 / 2,4 / 2,5 => 10 20 40 50 30 
 * 		3R : => 10 20 30 50 40
 * 		4R : => 10 20 30 40 50
 * 	2. 버블정렬 => 오른쪽 고정
 * 		20 10 40 50 30
 * 		1,2 / 2,3 / 3,4 / 4,5 => 차례로 비교하여 (내림차순||오름차순)에 맞게 정렬
 * 		=> 10 20 40 50 30
 * 		=> 10 20 40 50 30
 * 		=> 10 20 40 50 30
 * 		=> 10 20 40 30 50 : 1R
 * 
 */
public class 배열_정렬하기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 선택정렬
		// 오름차순
		
		int[] arr={30,10,40,20,50}; //ASC
		System.out.println("정렬전:");
		for(int i:arr)
		{
			System.out.print(i+" ");
		}
		System.out.println("\n정렬후:");
		
		//선택 정렬
		for(int i=0;i<arr.length-1;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]>arr[j])   //부등호 방향 바꾸면 내림차순
				{
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		for(int i:arr)
		{
			System.out.print(i+" ");
		}
		
		
		
		
		
		
	}

}
