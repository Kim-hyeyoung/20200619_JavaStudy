
public class ����Ǯ��1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1���� 100���� 3�� ����� ���ϴ� while���� ��ĭ�� ������ �ڵ�
		/*
		char[] c=new char[10];
		int[] n= {0,1,2,3,4,5};
		char[] day= {'��','��','ȭ','��','��','��','��'};
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
