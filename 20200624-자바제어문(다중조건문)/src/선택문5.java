
public class 선택문5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10;
		switch(a)
		{
		case 10:
		{
			int b=100;
			System.out.println("a="+a+",b="+b);
			break;
		}
		case 11:
		{
			int b=200; // 같은 블럭 안에서 같은 변수명은 사용 불가, 블럭을 따로 사용하면 가능
			System.out.println("a="+a+",b="+b);
			break;
		}
		}

	}

}
