// 국어 영어 수학=> 총점, 평균, 학점
import java.util.*;
public class 자바메소드2 {
	static int userInput(String subject)
	{
		Scanner scan=new Scanner(System.in);
		System.out.print(subject+"점수입력:");
		int score=scan.nextInt();
		return score;
	}
	static int total(int kor,int eng,int math)
	{
		return kor+eng+math;
	}
	//평균
	static void avg(int total)
	{
		System.out.printf("평균:%.2f\n",total/3.0);
	}
	static void hakjum(int total)
	{
		int avg=total/3;
		if(avg>=90)
			System.out.println("A학점");
		else if(avg>=80)
			System.out.println("B학점");
		else if(avg>=70)
			System.out.println("C학점");
		else if(avg>=60)
			System.out.println("D학점");
		else
			System.out.println("F학점");
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int kor=userInput("국어");
		int eng=userInput("영어");
		int math=userInput("수학");
		int total=total(kor,eng,math); //변수명과 메소드명이 같아도 됨
		
		System.out.println("국어점수:"+kor);
		System.out.println("영어점수:"+eng);
		System.out.println("수학점수:"+math);
		System.out.println("총점:"+total);
		avg(total);
		hakjum(total);
		

	}

}
