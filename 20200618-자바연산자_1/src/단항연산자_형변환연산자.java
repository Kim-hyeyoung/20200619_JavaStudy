/*
 * 	필요시에 데이터형을 변경해서 사용 : 강제 형변환
 * 
 * 	int + double = double (자동 형변환)
 * 	char + int = int
 * 	int + long = long
 * 	char + int + long + double = double
 *  
 *  형변환 예외사항
 *  1) boolean은 형변환 제외
 *  2) int 이하는 연산을 하면 결과값이 int
 *  	ex) byte + byte =int (byte (x))
 * 
 * 		
 */
public class 단항연산자_형변환연산자 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//byte b=10;
		//byte c=20;
		// byte d=b+c; byte와 byte를 더하면 결과값이 int이기 때문에 오류임!
		//int d=b+c;  //=>바르게 고친 코딩
		//byte d=(byte)(b+c); => 혹은 이렇게 고쳐도 되나 int로 하는게 정석
		
		//자동형변환
		int a='A'; //a=65
		double d=10; // d=10.0으로 자동으로 바꿔서 저장
		char c=65; //c='A'
		System.out.println("a="+a);
		System.out.println("d="+d);
		System.out.println("c="+c);
		
		//강제형변환
		int i=(int)10.5;
		int ii=(int)'A';
		System.out.println("i="+i);
		System.out.println("ii="+ii);
		
		

	}

}
