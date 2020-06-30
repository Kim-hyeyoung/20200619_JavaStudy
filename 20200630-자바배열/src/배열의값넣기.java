import java.util.Arrays;

/*
 * 배열에 값 넣기
 * 	1) 직접 입력
 * 	2) 사용자 입력값 => Scanner
 * 	3) 난수이용
 * =================
 * 	4) File읽기
 *  5) web에서 읽어오기
 *  6) 오라클 
 *  
 *  ===========================
 *  배열 => 0번부터 입력
 *     => 맨 뒤부터 입력
 *     
 *     Stack => LILO ex) 주차장
 *     Que => FIFO ex) 지하철탑승
 *     
 *     자료구조 : 데이터를 저장하는 공간을 어떻게 구성할 것인가
 *     알고리즘 : 프로그램 짜는 순서
 *     소프트웨어 패턴
 */
// 3명의 학생의 성적 관리 => 국어,영어,수학 점수 입력 => 총점, 평균, 학점, 등수 구하기
import java.util.*;
public class 배열의값넣기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		int[] arr= {30,20,50,10,40};
		Arrays.sort(arr);
		for(int a:arr)
		{
			System.out.print(a+" ");
		}
		*/  // 라이브러리 활용한 경우
		
		int[] kor=new int[3];
		int[] eng=new int[3];
		int[] math=new int[3];
		
		int[] total=new int[3];
		double[] avg=new double[3];
		char[] hakjum=new char[3];
		int[] rank=new int[3];
		
		/*
		 * 	for(int i=0;i<3;i++)
		 * 		{
		 * 			Scanner scan=new Scanner(System.in);     //new => 새로운 공간이 생성 => 메모리가 안 사라짐 => 특별한 경우가 아니면 for문안에 scanner(x)
		 * 		}
		 */
		
		Scanner scan=new Scanner(System.in);
		
		for(int i=0;i<3;i++) 
		{
			System.out.printf("%d번째 국어점수 입력:",i+1);
			kor[i]=scan.nextInt();
			
			System.out.printf("%d번째 영어점수 입력:",i+1);
			eng[i]=scan.nextInt();
			
			System.out.printf("%d번째 수학점수 입력:",i+1);
			math[i]=scan.nextInt();
			
			total[i]=kor[i]+eng[i]+math[i];
			avg[i]=total[i]/3.0;
		}
		//학점 계산
		for(int i=0;i<3;i++)
		{
			char c='A';
			switch(total[i]/30)
			{
			case 10:
			case 9:
				c='A';
				break;
			case 8:
				c='B';
				break;
			case 7:
				c='C';
				break;
			case 6:
				c='D';
				break;
			default:
				c='F';
				break;
			}
			hakjum[i]=c;
		}
		//등수 계산
		for(int i=0;i<3;i++)
		{
			rank[i]=1;
			for(int j=0;j<3;j++)
			{
				if(total[i]<total[j])
				{
					rank[i]++;
				}
			}
		}
		
		System.out.printf("%-6s%-6s%-6s%-7s%-7s%-6s%-6s\n","국어","영어","수학","총점","평균","학점","등수");
		
		for(int i=0;i<3;i++)
		{
			System.out.printf("%-5d%-5d%-5d%-7d%-7.2f%-5c%-5d\n",kor[i],eng[i],math[i],total[i],avg[i],hakjum[i],rank[i]);
		}
		//for-each는 배열 하나만 출력 / 이 경우 여러개 출력이기 때문에 for-each 사용 x
		
		
		
		
		
		
		
		
		
		
		

	}

}
