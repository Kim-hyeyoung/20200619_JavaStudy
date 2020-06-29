/*
 * 1 1 1 1 1
 * 2 2 2 2 2
 * 3 3 3 3 3
 * 4 4 4 4 4
 * 5 5 5 5 5 
 * 
 * 1 2 3 4 5
 * 6 7 8 9 10
 *11 12 13 14 15
 *16 17 18 19 20
 *21 22 23 24 25
 */
public class 반복문_2차for3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=5;j++)
			{
				System.out.printf("%2d\t",i);
			}
				System.out.println();
		}
		
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=5;j++)
			{
				System.out.printf("%2c\t",i+64); //알파벳으로 출력
			}
				System.out.println();
		}

	}

}
