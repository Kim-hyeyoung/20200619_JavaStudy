
public class 자바변수초기화 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * int kor=78; int eng=85; int math=96;
		 */
		
		/*
		 * 문자열 결합 (35.p참조)
		 * ======
		 * 7+7+"1"+7+7
		 * =======
		 * 14+"1"+7+7
		 * ======
		 * "141"+7+7  문자열 결합 뒷부분은 계산되지 않고 그냥 문자로 붙음
		 * "1417"+7
		 * "14177"
		 * 
		 * 
		 */
		
		/* System.out.println("총점:"+(kor+eng+math)); */
		
		int a=97;
		char c=97;//char => 문자, 숫자 (char는 숫자로 써도 문자형으로 출력됨)
		System.out.println("a="+a);
		System.out.println("c="+c);
		
		int d=1;
		int e='1';
		System.out.println("d="+d);
		System.out.println("e="+e);
		//char는 문자를 정수 취급한다
		/*
		 * 	long =int
		 *   8     4
		 *   
		 *   int = long
		 *    4     8  => error!!!
		 *    
		 *    예외=> char = int  (char에는 예외적으로 int 입력가능)
		 */
		float f=10.6f; //float f=10.6은 error!!!
		
		//byte < char < int < long < float < double
		System.out.println(100);//100은 int
		System.out.println(10.8);//10.8 double
		
		double i=21400000000L;
		
	}

}
