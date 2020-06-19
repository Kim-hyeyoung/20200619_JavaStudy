import java.util.*; //Scanner => 이전에 만들어진 자바파일을 읽어 온다
public class 자바입출력메소드 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 입력값 받기
		/*
		 * System.out.println("정수 입력:");
		 * System.out.print("정수 입력:\n"); => 두 개는 출력 결과가 같음
		 */
		Scanner scan=new Scanner(System.in);
		/*
		 * System.out.println("정수 입력:"); //println을 쓰면 입력시 커서가 아래로 내려감. 그냥 print를 쓰는 게 나음   .   \n, \t 기억!!
		 * int a=scan.nextInt(); 
		 * System.out.println("a="+a);
		 */
		
		//System.out.print("실수 입력:");
		//double a=scan.nextDouble(); //데이터형 맞추도록
		//System.out.println("a="+a);
		
		//System.out.println(~100); //'~'하면 음수표현
		System.out.println(Integer.toBinaryString(240));  //2진법
		System.out.println(Integer.toHexString(240));     //16진법
		System.out.println(Integer.toOctalString(240));   //8진법
		
		System.out.println(0xf0); //16진표현
		System.out.println(0360); //8진표현
		System.out.println(0b11110000); //2진표현
		System.out.println(~100);
	}

}
