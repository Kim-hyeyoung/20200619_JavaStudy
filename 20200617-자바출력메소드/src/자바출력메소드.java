/*
 * 	화면 출력
 * 		= system.out.println() => 다음에 출력
 * 		ex) system.out.println("Hello")
 * 			system.out.println("Java")
 * 
 * 		=>	Hello
 * 			Java
 * 
 * 		= system.out.print() => 옆으로 출력
 * 		ex) system.out.print("Hello")
 * 			system.out.print("Java")
 * 
 * 		=> HelloJava
 * 
 * 		= system.out.printf() => 서식이 있는 출력
 *      점수 점수 점수 총점 평균 학점
 * 		80 80 80 240 80.0 B
 *		system.out.println("80 80 80 240 80.0 B")
 *		system.out.printf("%5d%5d%5d%5d%5f%5c",80,80,80,240,80.0,'B')  => 간격을 5정도 띄고 출력하라
 *
 *		%5d    80   (38.p 참조)
 *		00080      =>5글자를 출력하는데 앞에 3칸을 띄고 80을 출력
 *		%-5d
 *		80000		=>5글자를 출력하는데80을 출력하고 뒤에 세칸
 *
 *		%5.2f   80.0
 *		080.00		=>5글자를 출력하는데 소수점 2자리를 사용
 *
 *
 *
 */	
public class 자바출력메소드 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.printf("%.1f", 80.55); //%f는 무조건 소수점 6자리 출력 => 그래서 .0f로 입력  / 자릿수 잘리면 자동으로 반올림 됨
		int a=2;
		int b=2;
		System.out.println("2*2=4");
		System.out.println(a+"*"+b+"="+a*b);
		System.out.printf("%d*%d=%d",a,b,a*b); //jdk 1.5
		
		/*
		 * %d => 정수
		 * %f => 실수
		 * %c => 문자
		 * %s => 문자열
		 * 
		 * 
		 * 
		 * 
		 */
	}

}
