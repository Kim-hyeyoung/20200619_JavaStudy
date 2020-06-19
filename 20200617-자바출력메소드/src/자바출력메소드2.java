import java.util.Scanner; // 자바 폴더 안의 유틸 폴더 안에 모든 스캐너를 가져온다. 유틸에 있는 모든 클래스를 가져오려면 import java.util.*

public class 자바출력메소드2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * System.out.printf("%d*%d=%d",2,2,4); 
		 * System.out.printf("%d*%d=%d",2,3,6);
		 *///=> 이렇게 하면 옆으로 붙어서 출력되는 문제가 있음
		
		/*
		 * System.out.printf("%d*%d=%d\n",2,2,4); //=> 밑으로 출력되게 하려면 \n 삽입
		 * System.out.printf("%d*%d=%d",2,3,6);
		 */
		
		/*
		 * \n은 NewLine => 새로운 줄에 출력
		 * \t는 탭 => 일정 간격 띄기
		 */
		
		Scanner scan=new Scanner(System.in);
		/*
		 * 	Scanner : 데이터형
		 *  scan : 변수
		 *  new : 메모리에 저장
		 *  Scanner(System.in) : 초기화
		 * 
		 */
		System.out.print("1' 정수 입력:");  //첫번째 정수 입력
		int a=scan.nextInt(); // => 입력된 정수를 읽어와서 a라는 메모리에 저장해라
		//System.out.print("2' 정수 입력:");  //두번째 정수 입력    => 이 문장을 생략하면 입력시 100 200 하면 동시에 출력됨
		int b=scan.nextInt();  //next 뒤에는 데이터형 입력 => nextboolean은 true false 입력, next int는 정수 입력...
		//출력
		System.out.println("a="+a);
		System.out.println("b="+b);  //내가 키보드에 입력한 a, b값을 출력함
		
		// Scanner => 도스에서만 사용
		
	}

}
