/*
 * A-Z까지 출력
 */
public class 반복문_for6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	for(char ch='A';ch<='Z';ch++) { //ch는 for문 안에서 지역변수로 사용되기 때문에 중복 사용 가능
		System.out.print(ch);
	}
	System.out.println();//다음줄로 내리기
	for(char ch='a';ch<='z';ch++) {
		System.out.print(ch);
	}
	System.out.println();
	for(int i=10;i>=1;i--) {
		System.out.println(i);
	}
		System.out.println("==============");
		
	for(int i=1,j=10;i<=10;i++,j--) { //변수를 여러개 사용해도 조건식은 하나만 사용해야 함(i<=10)
		System.out.println("i="+i+",j="+j);
	}
	
	}

}
