//����=>����,����,����
public class MainClass3 {
	//��������
	int a=10;
	int b=20;
	MainClass3(){
		a=100;
		b=200;
	}
	//����ڰ� ���� a,b�� �Է�
	MainClass3(int c,int d)
	{
		a=c;
		b=d;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MainClass3 m=new MainClass3();
		System.out.println("a="+m.a);
		System.out.println("b="+m.b);
		MainClass3 m1=new MainClass3(1000,2000);
		System.out.println("a="+m1.a);
		System.out.println("b="+m1.b);

	}

}
