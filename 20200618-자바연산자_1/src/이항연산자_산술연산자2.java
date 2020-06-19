/*
 * 		'A'+'B'
 * 		===
 * 		정수변환
 * 		65+66 = 131 (int)
 * 
 * 		***주의점 : 데이터형을 초과하면 error가 아니라 오버플로우가 발생
 * 		ex) int의 범위가  1~10이라면  11은 1로 나옴
 */
public class 이항연산자_산술연산자2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//byte b1=64;
		//byte b2=64;
		//byte b3=(byte)(b1+b2);
		//System.out.println("b3="+b3);  // => 오버플로우
		// % => double+int+char=>double
		
		int a=5;
		int b=2;
		System.out.println(a%b);
		System.out.println(-a%b);
		System.out.println(a%-b);
		System.out.println(-a%-b);
		
		System.out.println((int)(10.5+10.5));
		System.out.println((int)((int)10.5+(int)10.5));  // => 2개의 결과가 다름, 필요에 따라 형변환
		

	}

}
