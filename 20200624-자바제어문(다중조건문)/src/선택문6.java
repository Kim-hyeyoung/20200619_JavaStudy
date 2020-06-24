//switch 중첩
/*
 * 	switch(정수)
 * {
 * 		case 1:
 * 			switch(정수)
 * 			{
 * 				case 'A':
 * 			}
 * }
 */
import java.util.*;
public class 선택문6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int user=0;
		int com=(int)(Math.random()*3); //0,1,2
		Scanner scan=new Scanner(System.in);
		System.out.println("가위(0),바위(1),보(2):");
		user=scan.nextInt();
		/*
		switch (com) {
		case 0:
			switch(user)
			{
			case 0:
				System.out.println("컴퓨터:가위,사용자:가위");
				System.out.println("비겼다");
				break;
			case 1:
				System.out.println("컴퓨터:가위,사용자:바위");
				System.out.println("사용자Win");
				break;
			case 2:
				System.out.println("컴퓨터:가위,사용자:보");
				System.out.println("컴퓨터Win");
				break;
			}
			break;
		case 1:
			switch(user)
			{
			case 0:
				System.out.println("컴퓨터:바위,사용자:가위");
				System.out.println("컴퓨터Win");
				break;
			case 1:
				System.out.println("컴퓨터:바위,사용자:바위");
				System.out.println("비겼다");
				break;
			case 2:
				System.out.println("컴퓨터:바위,사용자:보");
				System.out.println("사용자Win");
				break;
			}
			break;
		case 2:
			switch(user)
			{
			case 0:
				System.out.println("컴퓨터:보,사용자:가위");
				System.out.println("사용자Win");
				break;
			case 1:
				System.out.println("컴퓨터:보,사용자:바위");
				System.out.println("컴퓨터Win");
				break;
			case 2:
				System.out.println("컴퓨터:보,사용자:보");
				System.out.println("비겼다");
				break;
			}
			break;

		default:
			break;
		}
		*/
		String[] str= {"가위","바위","보"};
		System.out.println("컴퓨터:"+str[com]+",사용자:"+str[user]);
		
		switch(com-user)
		{
		case 2: case -1:
			System.out.println("사용자Win");
			break;
		case 1: case -2:
			System.out.println("컴퓨터Win");
			break;
		default: //case 0:
			System.out.println("비겼다");
		}

	}

}
