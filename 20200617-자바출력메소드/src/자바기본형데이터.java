/*
 * 		자바 => 기본형
 * 				자바에서 지원하는 데이터형
 * 				논리형 => boolean => 값 " true/false : if(조건문)을 사용할 때 주로 사용하는 데이터형 => 턴에 사용
 * 													
 * 													
 * 
 * 
 */
//==============================================>>>>> upcating (자동형변환)
//  byte < short(char) < int < long < float < double
//<<<<<<<<<<<<<<<<<<<================================ downcasting (강제형변환)
/*
 * 		double d='a'; => d=97.0
 * 		char c='a' => c=a
 * 		int i='A' => i=65
 * 
 * 		byte b1=10;
 * 		byte b2=20;
 *		byte b3=b1+b2 =? error!!! (byte+byte=int!!) => int를 byte로 바꿔야 함
 *
 * 		byte a=10;
 * 		byte b=30;
 * 		byte c=(byte)(a*b) => byte에서 127까지 입력가능, a*b는 300이므로 초과된다
 * 
 * 			(int)10.5+(int)10.5 => 20
 * 			(int)(10.5+10.5) => 21  => int의 우선 순위에 따른 변화
 *
 * 
 */
public class 자바기본형데이터 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 사용 방법
		/*
		 * boolean b1=false; //False (x) 대문자사용x => 1byte System.out.println("b="+b1);
		 * b1=true; System.out.println("b="+b1);
		 * 
		 * System.out.println(Integer.toBinaryString(300)); byte a=10; byte b=30; byte
		 * c=(byte)(a*b); int c=(a*b); System.out.println("c="+c);
		 */

		
		System.out.println('A');
		System.out.println((int)'A');
		
		System.out.println('홍');
		System.out.println((int)'홍');
		
		//12619126112619 ㅋㅋㅋ
		System.out.println((char)12619);
		// 각문자는 숫자번호를 가지고 있다 (char는 정수형으로 인식한다)
	}

}
