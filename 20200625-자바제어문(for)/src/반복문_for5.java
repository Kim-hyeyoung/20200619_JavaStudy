/*
 * =>1~100���� ¦���� ��, Ȧ���� ��
 * =>1~100���� 3�� ����� ��, 5�� ����� ��, 7�� ����� ���� ���
 * =>100~999���� 7�� ����� ����
 * =>1-2+3-4+5-6+7-8+9-10
 */
public class �ݺ���_for5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		int odd=0,even=0;
		for(int i=1;i<=100;i++) {
			if(i%2==0) 
				even+=i;
			else
				odd+=i;
		}
		System.out.println("1~100���� ¦���� ��:"+even);	
		System.out.println("1~100���� Ȧ���� ��:"+odd);	
			*/
		/*
		int three=0, five=0,seven=0;
		for(int i=1;i<=100;i++) {
			if(i%3==0)
				three+=i;
			if(i%5==0)
				five+=i;
			if(i%7==0)
				seven+=i;
		}
		System.out.println("1~100���� 3�� ����� ��:"+three);
		System.out.println("1~100���� 5�� ����� ��:"+five);
		System.out.println("1~100���� 7�� ����� ��:"+seven);
		*/
		/*
		int cnt=0;
		for(int i=100;i<=999;i++) {
			if(i%7==0)
				cnt++;  //������ �� ���� ++, +=���� �ָ� ������ ����
		}
		System.out.println("100~999���� 7�� ����� ����:"+cnt);
		*/
		/*
		int sum=0;
		for(int i=1;i<=10;i++)
			if(i%2==0)
				sum-=i;
			else
				sum+=i;
		System.out.println(sum);
		*/
		//=>�ڡڡ١ڡڡ١ڡڡ١ڡڡ�
		for(int i=1;i<=12;i++) {
			if(i%3==0)
				System.out.print("��");
			else
				System.out.print("��");
		}
	
		
		
		
		}

	}


