/*
 * ����
 */
public class �迭_�󵵼���� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr=new int[10]; //1~9
		int[] count=new int[10];
		//�ʱⰪ
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=(int)(Math.random()*10); //0~9
		}
		//��� => �󵵼� ���
		for(int i:arr)
		{
			System.out.print(i);
		}
		
		System.out.println("\n=====���=====");
		for(int i=0;i<arr.length;i++)
		{
			count[arr[i]]++;
		}
		
		//���
		for(int i=0;i<arr.length;i++)
		{
			if(count[i]!=0)
			{
			System.out.println(i+"����:"+count[i]);
			}
		}
		
		
		
		
		

	}

}
