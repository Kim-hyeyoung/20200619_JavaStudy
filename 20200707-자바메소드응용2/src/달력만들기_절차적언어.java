/*
 * 순차적인 코딩 => 구조화된 코딩(메소드)
 * 				기능별로 묶어서 사용 가능(재사용,코드 중복 제거) => 수정, 추가 편리하게
 * 
 * 1. 사용자로부터 연도, 월 값을 입력 받는다
 * 2. 요일을 구한다 => 세분화
 * 3. 해당 요일부터 달력 출력
 */
import java.util.*;
public class 달력만들기_절차적언어 {
	static void process(int year,int month)
	{
		//System.out.println(year+"년도"+month+"월");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//1.사용자로부터 연도, 월 값을 입력 받는다
		Scanner scan=new Scanner(System.in);
		System.out.print("연도 입력:");
		//입력된 데이터를 메모리에 저장
		int year=scan.nextInt();
		System.out.print("월 입력:");
		int month=scan.nextInt();
		//저장된 year, month => main이 끝날 때까지 사용 가능
		//지역변수를 다른 메소드에서 사용할 때는 매개변수를 이용해야 함
		
		//2. 요일을 구한다 => 세분화
		//1)전년도까지의 총 날수의 합(year-1)
		int total=(year-1)*365
				+(year-1)/4
				-(year-1)/100
				+(year-1)/400;
		//2)전달까지의 총날수
		int[] lastDay= {31,28,31,30,31,30,31,31,30,31,30,31};
		//윤년이면
		if((year%4==0 && year%100!=0)||(year%400==0))
			lastDay[1]=29;
		else
			lastDay[1]=28;
				
		for(int i=0;i<month-1;i++)
		{
			total+=lastDay[i];
		}
		//요청한 달의 1일자의 요일
		total++;
		//요일 구하기
		int week=total%7;
		
		//출력
		System.out.println(year+"년도"+month+"월");
		String[] strWeek= {"일","월","화","수","목","금","토"};
		for(int i=0;i<7;i++) 
		{
			System.out.print(strWeek[i]+"\t");
		}
		/*
		System.out.print("일\t");
		System.out.print("월\t");
		System.out.print("화\t");
		System.out.print("수\t");
		System.out.print("목\t");
		System.out.print("금\t");
		System.out.print("토\t");
		*/
		
		System.out.println("\n\n");
		//달력 출력
		for(int i=1;i<=lastDay[month-1];i++)
		{
			//공백띄우기
			if(i==1)
			{
				for(int j=0;j<week;j++)
				{
					System.out.print("\t");
				}
			}
			//출력
			System.out.printf("%2d\t",i);
			//요일증가
			week++;
			if(week>6)
			{
				week=0;
				System.out.println();
			}
		}
		
		
		
		
	}

}
