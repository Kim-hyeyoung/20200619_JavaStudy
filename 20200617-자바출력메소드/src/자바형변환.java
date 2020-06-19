// 형변환 => 자신의 데이터형을 다른 형태의 데이터형으로 변환
/*
 * 		boolean : 제외
 * 		byte < char < int < long < float < double
 * 
 * 		정수 => 실수, 문자, 정수           int a=(int)10L => long a=(long)10
 * 								double d=(double)10
 * 		실수 => 정수, 문자
 * 		문자 => 정수, 실수
 */
public class 자바형변환 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double d=5/(double)2; // 우변에 double 안 쓰면 int로 계산되어 2.0으로 계산됨 => 우변에 double 사용하여 올바른 값으로 출력
		System.out.println("d="+d);

	}

}
