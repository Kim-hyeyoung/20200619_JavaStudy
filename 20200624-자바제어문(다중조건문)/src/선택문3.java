//3개의 정수를 입력받아서 학점 계산
import java.util.*;
public class 선택문3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//변수
		int kor=0, eng=0, math=0;
		char score='A';
		//입력
		Scanner scan=new Scanner(System.in);
		System.out.println("점수 3개를 입력하세요(90 90 90)");
		kor=scan.nextInt();
		eng=scan.nextInt();
		math=scan.nextInt();
		//츨력
		switch((kor+eng+math)/30)//3으로 나누면 100까지 나와서 case를 100개 만들어야함=>30으로 나누기, case에는 실수가 들어올 수 없어서 정수로 나눔
		{
		case 10:
		case 9:
			score='A';
			break;
		case 8:
			score='B';
			break;
		case 7:
			score='C';
			break;
		case 6:
			score='D';
			break;
		//case 5:
		//case 4:
		//case 3:
		//case 2:
		//case 1:
			default: //case5개 나열하지 않고 나머지는 모두 디폴트로 잡아준다
			score='F';
			break;
		}
		
		System.out.println("===결과===");
		System.out.println("학점:"+score);
		
		

	}

}
