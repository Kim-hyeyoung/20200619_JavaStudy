import java.util.*;
public class 자바조건2번문제풀이 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.print("국어점수 영어점수 수학점수 입력:");
		int kor=scan.nextInt();
		int eng=scan.nextInt();
		int math=scan.nextInt();
		int total=kor+eng+math;
		double avg=total/3.0;
		char score='A';
		
		if (avg>=90 && avg<100)
			score='A';
		if (avg>=80 && avg<90)
			score='B';
		if (avg>=70 && avg<80)
			score='C';
		if (avg>=60 && avg<70)
			score='D';
		if (avg<60) 
			score='F'; 
		
		System.out.println("국어점수:"+kor);
		System.out.println("영어점수:"+eng);
		System.out.println("수학점수:"+math);
		System.out.println("총점:"+total);
		System.out.printf("평균:%.2f%n",avg);
		System.out.println("학점:"+score);
		
		
	}

}
