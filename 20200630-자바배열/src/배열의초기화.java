/*
 * = 배열 선언
 * 		데이터형[] 배열명;
 * = 배열 초기화 (메모리에 값을 입력)
 * 		ex) 1) int[] arr{10,20,30,40,50}; => 선언과 동시에 초기값
 * 			2) int[] arr=new int[5]; => 메모리 공간만 제작 / 나중에 값을 채운다
 * 			3) int[] arr; //선언
 * 			   arr[0]=10;
 * 			   arr[1]=20;..
 *  활용 => 제어문(for,while)
 *  
 *  	for => 제어 
 *  	for-each => 출력
 */
public class 배열의초기화 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 출력
		String[] names= {"홍길동","박문수","이순신","춘향이","심청이"}; //length=5
		for(int i=0;i<names.length;i++) //배열 개수를 모를 땐 length
		{
			//names[1]=""; 데이터값 변경 가능
			System.out.println(names[i]);
		}
		System.out.println("========= for-each ========");
		for(String name:names) //for(데이터형 :배열명)
		{
			System.out.println(name); //데이터값 변경이 불가능 => 출력만 가능
		}

	}

}
