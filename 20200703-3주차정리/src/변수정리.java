
public class �������� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] com=new int[10]; //���ڸ� ���� 1~10 => �ߺ�(���Ƿ� ����)
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
		int su=0; //������ ����
		//�ߺ��� ������(false) ����, �ߺ��� �Ǹ�(true) ������ �ٽ� �߻�
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
