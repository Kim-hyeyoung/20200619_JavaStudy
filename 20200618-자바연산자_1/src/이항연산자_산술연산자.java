/*
 * 	이항연산자
 * 		산술연산자 (+, -, *, /, %)
 * 		=> 자바에서 제공하는 모든 연산자는 산술로 변환할 수 있다
 *		쉬프트연산자는 산술연산자로 하는 게 더 쉬움
 *		ex) x<<y  =>  x*2의 y승
 *		=> 자바프로그램에서 가장 많이 사용되는 연산자
 *		**주의점
 *			1) 형변환 => 가장 큰 데이터형으로 변경 
 *			2) /
 *				= 0으로 나누면 오류
 *				= 정수/정수=정수
 *			3) %
 *				= 나누고 나머지 => 부호는 나눠지는 수를 따라간다
 *					ex) (-5)%(-2)=>(-1)
 *						(5)%(-2)=>(1)
 *			4) 산술연산자의 우선순위는 *,/,%가 +,-보다 우선순위가 높다 => 우선순위를 잘 모르면 () 이용
 * 	
 */
public class 이항연산자_산술연산자 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int a=10/0;
		//System.out.println(a);
		int a=10;
		int b=3;
		
		int c=a+b;
		int d=a-b;
		int e=a*b;
		int m=a/b;
		int n=a%c;
		
		System.out.printf("%d+%d=%d%n",a,b,c);
		System.out.printf("%d-%d=%d%n",a,b,d);
		System.out.printf("%d*%d=%d%n",a,b,e);
		System.out.printf("%d/%d=%d%n",a,b,m);
		System.out.printf("%d%%%d=%d%n",a,b,n); //%d는 정수값, %n은 \n과 같음
		

	}

}
