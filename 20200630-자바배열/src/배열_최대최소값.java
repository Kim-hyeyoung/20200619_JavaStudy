/*
 * ������ ���� 5���� ������ �� �ִ밪, �ּҰ� ���ϱ�
 */
public class �迭_�ִ��ּҰ� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ���� 5�� ���� ���� �����
		int[] arr=new int[5]; // 0 0 0 0 0
		// 5���� �ʱⰪ ���� 0 => ������ ��
		for(int i=0;i<5;i++) //������ 0�����̰� '='ǥ�� ������ ���� 0~4�̱� ������
		{
			arr[i]=(int)(Math.random()*100)+1;
		}
		//���
		//int i => index�� �ƴ϶� ���� ����� ���� ����
		for(int i:arr)
		{
			System.out.print(i+" ");
		}
		
		System.out.println("\n=====������=====");
		
		//�ּҰ� ���� ����
		int min=100; //int min=int arr[0];
		/*
		 * �ּҰ��� �ִ밪���� �ִ밪�� �ּҰ����� �ʱⰪ �����ؾ� �Է°��� ���Ͽ� �۰ų� ū ���� ������ �� �ִ�!!!
		 */
		//�ִ밪 ���� ����
		int max=0;   //int max=int arr[0];
		
		//�ּҰ�
		for(int i=0;i<5;i++)
		{
			if(min>arr[i])
			{
				min=arr[i];
			}
		}
		System.out.println("�ּҰ�:"+min);
		//�ִ밪
		for(int i=0;i<5;i++)
		{
			if(max<arr[i])
			{
				max=arr[i];
			}
		}
		System.out.println("�ִ밪:"+max);

		
		
		
		
		
		
		
		
	}

}
