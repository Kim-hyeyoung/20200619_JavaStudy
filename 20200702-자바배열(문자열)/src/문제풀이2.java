
public class 문제풀이2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr=new int[10];
		for(int i=0;i<10;i++)
		{
			arr[i]=(int)((Math.random()*10)+1);
		}
		int total=0;
		for(int i:arr)
		{
			total+=i;
		}
		System.out.println("평균:"+total/10.0);
	}

}
