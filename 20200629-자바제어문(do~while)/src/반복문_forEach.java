/*
 * forEach : 향상된 for문 => 출력용(웹, 모바일)
 * 						=============== front-end
 * 1)배열 2)컬렉션 => 데이터가 묶여있는 상태
 * for(데이터형 변수:배열,컬렉션)
 */
public class 반복문_forEach {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {1,2,3,4,5}; // => arr => arr[0](배열의 첫번째값 가져오기=>1)
		for(int i=0;i<5;i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		for(int i:arr)
		{
			System.out.print(i+" ");
		}

	}

}
