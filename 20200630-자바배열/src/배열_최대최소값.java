/*
 * 임의의 정수 5개를 저장한 후 최대값, 최소값 구하기
 */
public class 배열_최대최소값 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 정수 5개 저장 공간 만들기
		int[] arr=new int[5]; // 0 0 0 0 0
		// 5개의 초기값 변경 0 => 임의의 수
		for(int i=0;i<5;i++) //시작은 0부터이고 '='표시 붙이지 않음 0~4이기 때문에
		{
			arr[i]=(int)(Math.random()*100)+1;
		}
		//출력
		//int i => index가 아니라 실제 저장된 값을 대입
		for(int i:arr)
		{
			System.out.print(i+" ");
		}
		
		System.out.println("\n=====결과출력=====");
		
		//최소값 저장 공간
		int min=100; //int min=int arr[0];
		/*
		 * 최소값을 최대값으로 최대값을 최소값으로 초기값 지정해야 입력값과 비교하여 작거나 큰 수를 가져올 수 있다!!!
		 */
		//최대값 저장 공간
		int max=0;   //int max=int arr[0];
		
		//최소값
		for(int i=0;i<5;i++)
		{
			if(min>arr[i])
			{
				min=arr[i];
			}
		}
		System.out.println("최소값:"+min);
		//최대값
		for(int i=0;i<5;i++)
		{
			if(max<arr[i])
			{
				max=arr[i];
			}
		}
		System.out.println("최대값:"+max);

		
		
		
		
		
		
		
		
	}

}
