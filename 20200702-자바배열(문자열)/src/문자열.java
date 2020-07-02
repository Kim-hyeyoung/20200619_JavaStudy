/*
 * 1. 배열
 * 		=> 같은 타입을 여러개 묶어서 관리
 * 		=> 배열생성 => 연속적인 메모리 구조 (인덱스)
 * 		=> 일차원 배열 [] , 이차원[][], 삼차원 [][][] == 일차원 정도만 공부해도 좋음
 * 				1) 문자열 배열
 * 					String[] arr == String arr[]
 * 				2) 정수 배열
 * 					int[] arr == int arr[]
 * 				3) 논리 배열
 * 					boolean[] arr == boolean arr[]
 * 			=> 선언 방식
 * 				String[] arr;
 * 				int[] arr;
 * 			=> 초기값
 * 				문자열 10개  => String[] arr;
 * 							arr=new String[10];  
 * 				정수 10개 => int[] arr;
 * 							arr=new int[10]; ====> 선언과 동시에 초기값 지정 가능 ==> int[] arr=new int[10];
 * 																		  int[] arr={10,20,30,40,50}; => 등록된 개수 (5개 배정)
 * 																			=> 선언시에 메모리 저장 개수를 등록해야 하기 때문에 고정적이다
 * 			=> 인덱스 사용
 * 				ex) int[] arr={10,20,30,40,50};
 * 					배열의 첫번째 주소
 * 					0x100(임의의 값 100임) 0x104  0x108...(증가하는 수는 형식을 따름=>이 경우 int의 값이 4byte이므로 4씩 증가)
 * 					arr[0] arr[1] arr[2] arr[3] arr[4] => 인덱스 번호는 0번부터 시작하여 자리값-1만큼 있음 (5개 저장시 4번까지)
 * 			=> 출력
 * 				=> for, while문을 이용하여 출력
 * 					== 횟수가 지정된 상태이기 때문에 for문을 자주 사용
 * 						1) 일반 for => 인덱스를 이용 => 제어용 (갑 변경,값 삭제)
 * 						2) 향상된 for문 (for-each) => 실제 저장된 값 (인덱스 번호x) => 출력용 (값 변경 불가)
 */
public class 문자열 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 정수 5개 저장 후 평균 구하기
		// 1. 정수 5개 저장하는 메모리 공간 설정(연속적으로 사용)
		int[] arr= {30,50,70,90,10};
		/*
		int total=arr[0]+arr[1]+arr[2]+arr[3]+arr[4];
		double avg=total/5.0;
		System.out.println("저장된 정수의 평균:"+avg);
		*/
		int total=0;
		for(int i=0;i<5;i++)
		{
			total+=arr[i];
		}
		System.out.println("저장된 정수의 평균:"+(total/5.0));
		
		//for-each
		//for(실제 저장된 데이터형:배열명)
		/*
		 * arr= {30,50,70,90,10};
		 * for(int i:arr)
		 * i=30
		 * i=50
		 * i=70
		 * i=90
		 * i=10
		 * 값이 없을 때 자동 종료
		 */
		total=0;
		for(int i:arr)
		{
			total+=i;
		}
		System.out.println("저장된 정수의 평균:"+(total/5.0));
		
		
		
		
		
		
		
		

	}

}
