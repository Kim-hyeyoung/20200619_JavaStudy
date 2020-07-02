import java.util.*;
public class 달력만들기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int year=0,month=0;
		Scanner scan=new Scanner(System.in);
		System.out.print("년도 입력:");
		year=scan.nextInt();
		System.out.print("월 입력:");
		month=scan.nextInt();
		
		String[] strWeek= {"일","월","화","수","목","금","토"};
		System.out.println(year+"년도 "+month+"월");
		
		for(String week:strWeek)
		{
			System.out.print(week+"\t");
		}
		
		//요일 구하기
		/*
		 * 1) 전년도까지의 총날수 계산 / 1년도 1월 1일~2019년도 12월 31일까지 계산
		 * 2) 전달까지의 총날수 계산 / 2020년 1월 1일~2020년 6월 30일까지 계산
		 * 3) 입력된 일까지의 총날수 계산/
		 * ======================= +
		 * => 전체총날수 &7 => 요일을 구할 수 있다
		 * 	 ==========
		 * 0,1,2,3,4,5,6
		 * 0(일)~6(토)
		 * => 1년도 1월 1일 => 월요일로 시작
		 */
		
		// 1) 전년도까지의 총날수 계산 / 1년도 1월 1일~2019년도 12월 31일까지 계산
		int total=(year-1)*365
				+(year-1)/4   //윤년계산 => 4년마다 한번씩 윤년
				-(year-1)/100 //100년마다 제외
				+(year-1)/400; //400년마다 한번씩 윤년
		
		// 2) 전달까지의 총날수 계산 / 2020년 1월 1일~2020년 6월 30일까지 계산
		int[] lastDay= {31,28,31,30,31,30,31,31,30,31,30,31};
		//1월 => 전달x => 0
		//2월=> total+31
			//2월일 경우 윤년 계산
		if((year%4==0 && year%100!=0) || (year%400==0))
		{
			lastDay[1]=29;
		}
		else
		{
			lastDay[1]=28;
		}
		//3월=> total+31+28...
		
		for(int i=0;i<month-1;i++)
		{
			total+=lastDay[i];
		}
		
		
		//1일자의 요일
		total++;//1일자
		
		int week=total%7;
	
		
		//달력 출력
		System.out.println();
		for(int i=1;i<=lastDay[month-1];i++) //1일부터 입력한 달의 마지막 날까지
		{
			if(i==1) // 1일자 앞에 공백주기 (전달 달력 부분)
			{
				for(int j=0;j<week;j++)
				System.out.print("\t");
			}
			System.out.printf("%2d\t",i);
			week++;
			if(week>6) //다음줄 출력
			{
				week=0; //일요일
				System.out.println();
			}
		}
		
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
