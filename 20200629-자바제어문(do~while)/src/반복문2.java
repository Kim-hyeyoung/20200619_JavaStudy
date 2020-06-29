/*
 * do~while
 * 사용자가 입력한 정수에 해당되는 구구단
 */
import java.util.*;
//BufferedReader => 스캐너보다 더 자주 사용되는 것, 예외처리 필요
public class 반복문2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		int user=0; //사용자 입력 변수
		int i=1; //1~9까지 변경하는 변수
		Scanner scan=new Scanner(System.in);
		//모든 클래스는 메모리에 저장할 때 "new"를 이용한다
		//예외 => Math.random() => static 메소드 : 시작과 동시에 메모리에 자동 저장
		System.out.print("2~9까지 사이의 정수 입력:");
		user=scan.nextInt();
		
		do {
			System.out.printf("%d*%d=%d\n",user,i,user*i);
			i++;
		}while(i<=9);
		*/
		
		int user=0; //사용자 입력 변수
		int i=9; //1~9까지 변경하는 변수
		Scanner scan=new Scanner(System.in);
		//모든 클래스는 메모리에 저장할 때 "new"를 이용한다
		//예외 => Math.random() => static 메소드 : 시작과 동시에 메모리에 자동 저장
		System.out.print("2~9까지 사이의 정수 입력:");
		user=scan.nextInt();
		
		do {
			System.out.printf("%d*%d=%d\n",user,i,user*i);
			i--;
		}while(i>=1);
		
		

	}

}
