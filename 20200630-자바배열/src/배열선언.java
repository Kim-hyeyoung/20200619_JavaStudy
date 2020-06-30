/*
 * 배열 
 * 	1) 같은 타입, 여러 개의 변수를 묶어서 관리하는 프로그램 (<-> 다른 타입 => 클래스) / 자동형변환 가능한 경우에는 다른 타입도 가능 ex) double[]a={100.10.5...}
 * 	2) 한 개의 변수명을 이용하여 여러개의 변수를 제어 / 구분자 : 번호로 구분을 한다(index번호) =>0부터 시작 ex) 5자리이면 0,1,2,3,4 (인덱스 중간에 없는 번호는 없다(순차적))
 * 	3) 메모리 주소를 이용해 접근하는 변수 => 참조변수(배열,클래스)
 * 
 * 배열 선언 방식
 * 1) 데이터형[] 배열명;
 * 			===== 변수의 명칭법과 동일
 * 2) 데이터형 배열명[];
 * 
 * 1) = 값을 초기화 하는 방법
 *			영화제목을 10개 모아서 관리 => String[] title=new String[10]; => null값으로 초기화
 * 	   		10명의 학생의 학점을 관리 => char[] hakjum=new char[10]; => '\0'으로 초기화
 * 	   		10명의 학생의 총점을 관리 => int[] total=new int[10];
 * 				=>new를 사용하면 메모리 공간이 생성되고 0값으로 초기화된다
 * 					double => 0.0
 * 					float => 0.0f
 * 					long => 0L
 * 2) = 직접 값을 넣는 방법
 * 		int[] arr={10,20,30,40,50};
 * 
 * ** 주의점
 *		1) 배열의 크기를 초과하면 error => ArrayIndexOutOfBoundsException
 *			n개 => 0 ~ n-1까지 => 만약 개수를 모르는 경우 : length
 *		2) 제어문 이용시에는 주로 for문 이용
 *			for에서 사용하는 초기값 => '0' 
 * 
 */
public class 배열선언 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 5명에 대한 점수 저장 => 총점, 평균 구하기
		int[] score= {80,90,75,90,85};
		int total=0;
		double avg=0.0;
		for(int i=0;i<score.length;i++)
		{
			total+=score[i];
		}
		avg=total/5.0;
		
		System.out.println("총점:"+total);
		System.out.println("평균:"+avg);

	}

}
