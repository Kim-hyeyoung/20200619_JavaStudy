/*
 *  사용자가 알파벳을 입력 ex) B => AB  /  D => ABCD
 *  char => scan.next().charAt(0)  => 
 *  ========문자열    ========첫번째 문자   => 문자열에서 첫번째문자 가져오기
 *  "ABCDE" => scan.next()
 *  ======
 *  "A" => charAt(0)
 *  "B" => charAt(1)
 */
import java.util.*;
public class 반복문_while2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char user=' ';
		char c='A';
		Scanner scan=new Scanner(System.in);
		System.out.print("알파벳 입력(대문자):");
		user=scan.next().charAt(0);
		while(c<=user)
		{
			System.out.print(c);
			c++;
		}
			
			
	}

}
