/*
 * 	20 10 40 50 30
 * 		= DESC (��������) => 50 40 30 20 10
 * 		= ASC (��������) => 10 20 30 40 50
 * 
 * 	1. �������� => ���� ����
 * 		20 10 40 50 30
 * 		1R : 1,2 / 1,3 / 1,4 / 1,5  => ���ʷ� ���Ͽ� (��������||��������)�� �°� ���� => 10 20 40 50 30
 * 		2R : 2,3 / 2,4 / 2,5 => 10 20 40 50 30 
 * 		3R : => 10 20 30 50 40
 * 		4R : => 10 20 30 40 50
 * 	2. �������� => ������ ����
 * 		20 10 40 50 30
 * 		1,2 / 2,3 / 3,4 / 4,5 => ���ʷ� ���Ͽ� (��������||��������)�� �°� ����
 * 		=> 10 20 40 50 30
 * 		=> 10 20 40 50 30
 * 		=> 10 20 40 50 30
 * 		=> 10 20 40 30 50 : 1R
 * 
 */
public class �迭_�����ϱ� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ��������
		// ��������
		
		int[] arr={30,10,40,20,50}; //ASC
		System.out.println("������:");
		for(int i:arr)
		{
			System.out.print(i+" ");
		}
		System.out.println("\n������:");
		
		//���� ����
		for(int i=0;i<arr.length-1;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]>arr[j])   //�ε�ȣ ���� �ٲٸ� ��������
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
