/*
 * ����ڰ� ���� �Է�=>2���� ���
 * bit=>16bit=>32767
 * 17���� ���� �ʿ�=> 16�� ����(16bit)+������Է� ����(1)
 * 
 * �뷡����,������,�ٹ�,������,����
 * =>50�� =>���� 250��
 */
import java.util.*;
public class �ڹٹ迭_�뵵3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//0,1�� ����
		int[] binary=new int[16];
		//����ڰ� ��û�� ���� ����
		int user=0;
		int index=15; //2���� �ڿ������� �����ϱ� ����=> �ڿ������� �����ؾ� �ùٸ� ������ ��°���
		
		Scanner scan=new Scanner(System.in);
		System.out.println("���� �Է�(0~32767):");
		user=scan.nextInt();
		System.out.println("=======Lib�̿�========");
		System.out.println(Integer.toBinaryString(user));
		System.out.println("======Lib�̿�X======");
		while(true) //�������=> break;
		{
			binary[index]=user%2;
			user=user/2; //1/2=0
			if(user==0)
				break;
			index--;
		}
		//��� ���
		for(int i=0;i<16;i++)
		{
			if(i%4==0 && i!=0)				//4���� �߶� ��� / i!=0 => �� ��ĭ�� ������ ���� �ʱ� ����
				System.out.print(" ");
				System.out.print(binary[i]);
		}
		
	

		
		
		
		
		
		
		
		
		
		
		
		

	}

}
