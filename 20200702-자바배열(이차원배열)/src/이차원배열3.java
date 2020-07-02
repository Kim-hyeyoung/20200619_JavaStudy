/*
 * ============================
 * 				1		
 * 	============================
 * 			2	3	4
 * 	============================
 * 		5	6	7	8	9		
 * 	============================
 * 			10	11	12
 * 	============================
 * 				13
 * 	============================
 * 
 * 
 * 		 j_s	j_e
 * 	i=0    2	2
 * 	i=1    1	3
 * 	i=2    0	4
 * 
 * 	i�� j_s => i=i+j=2 => j=2-i  (��������� ���ϱ�)
 * 	i�� j_e => i+2=j => j=i+2
 * 
 *  i=3	   1	3
 * 	i=4	   2	2
 * 
 * 	i�� j_s => j=i-2
 * 	i�� j_e => i+j=6 => j=6-i
 * 
 */
public class �������迭3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int[][] arr=new int[5][5];
					
					int k=1;
					
					for(int i=0;i<3;i++)
					{
						for(int j=2-i;j<=i+2;j++)
						{
							arr[i][j]=k;
							k++;
						}
					}
					
					for(int i=3;i<5;i++)
					{
						for(int j=i-2;j<=6-i;j++)
						{
							arr[i][j]=k;
							k++;
						}
					}
					
					//���
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
