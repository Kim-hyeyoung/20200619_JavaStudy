/*
 * 사용자가 정수 입력=>2진법 출력
 * bit=>16bit=>32767
 * 17개의 변수 필요=> 16개 변수(16bit)+사용자입력 저장(1)
 * 
 * 노래제목,가수명,앨범,포스터,순위
 * =>50곡 =>변수 250개
 */
import java.util.*;
public class 자바배열_용도3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//0,1만 저장
		int[] binary=new int[16];
		//사용자가 요청한 정수 저장
		int user=0;
		int index=15; //2진수 뒤에서부터 저장하기 위함=> 뒤에서부터 저장해야 올바른 값으로 출력가능
		
		Scanner scan=new Scanner(System.in);
		System.out.println("정수 입력(0~32767):");
		user=scan.nextInt();
		System.out.println("=======Lib이용========");
		System.out.println(Integer.toBinaryString(user));
		System.out.println("======Lib이용X======");
		while(true) //종료시점=> break;
		{
			binary[index]=user%2;
			user=user/2; //1/2=0
			if(user==0)
				break;
			index--;
		}
		//결과 출력
		for(int i=0;i<16;i++)
		{
			if(i%4==0 && i!=0)				//4개씩 잘라서 출력 / i!=0 => 맨 앞칸에 공백을 주지 않기 위함
				System.out.print(" ");
				System.out.print(binary[i]);
		}
		
	

		
		
		
		
		
		
		
		
		
		
		
		

	}

}
