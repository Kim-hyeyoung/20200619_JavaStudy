/*
 * 중첩 for문
 * 		형식)
 * 			for(초기값;조건식;증가식) //세로출력(줄수)      
 * 			{
 * 				for(초기값;조건식;증가식) //가로출력
 * 				 {
 * 					반복 수행문장		
 *				 }
 * 			}
 * 			ex)
 * 				*****
 * 				*****
 *				*****
 * 				***** => 1차 for문은 4까지, 2차 for문은 5까지 => 실제 출력은 2차 for문 안에 있음
 */
public class 반복문_2차for1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1;i<=9;i++)
		{
			for(int j=2;j<=9;j++)
			{
				System.out.printf("%2d*%2d=%2d\t",j,i,j*i);
			}
			System.out.println();
		}

	}

}
