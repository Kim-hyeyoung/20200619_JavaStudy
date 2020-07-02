/*	============================
 * 		1	2	3	4	5
 * 	============================
 * 			6	7	8
 * 	============================
 * 				9
 * 	============================
 * 			10	11	12
 * 	============================
 * 		13	14	15	16	17
 * 	============================
 * 
 * 
 * 		 j_s	j_e
 * 	i=0    0	4
 * 	i=1    1	3
 * 	i=2    2	2
 * 
 * 3행까지
 * 	i와 j_s => j_s=i
 * 	i와 j_e => i+j_e=4 => j_e=4-i
 * 
 * for(int i=0;i<3;i++)
 * {
 * 		for(int j=i;j<4-i;j++)
 * 		{
 * 		}
 * }
 * 
 * 
 * 3,4행도 2행까지와 동일하게 구성
 * 
 * 
 * 
 */
public class 이차원배열2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//5행 5열
		int[][] arr=new int[5][5];
		
		int k=1;
		
		for(int i=0;i<3;i++)
		{
			for(int j=i;j<=4-i;j++)
			{
				arr[i][j]=k;
				k++;
			}
		}
		
		for(int i=3;i<=4;i++)
		{
			for(int j=4-i;j<=i;j++)
			{
				arr[i][j]=k;
				k++;
			}
		}
		
		//출력
		for(int i=0;i<5;i++)
		{
			for(int j=0;j<5;j++)
			{
				if(arr[i][j]==0)
				
					System.out.print("\t");
				
				else 
					System.out.print(arr[i][j]+"\t");	
				
				
			}
			System.out.println("\n");
		}
		
		
		
		

	}

}
