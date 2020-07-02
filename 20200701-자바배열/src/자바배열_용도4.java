/*
 * 배열=용도별로 묶어서 사용
 * byte[] b => File 전송
 * String[] s => 문자열이 많은 경우(이름,주소,전화번호)
 * int[] i => 성적계산,통계
 * double[] d => 통계,빈도수,레이팅
 * boolean[] b=> 존재여부 확인
 */
public class 자바배열_용도4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] s= {
				"cherry",
				"melon",
				"mango",
				"aloe",
				"lemon",
				"fig",
				"watermelon",
		};
		//과일명중에 가장 긴 과일은?
		//전체 과일 출력
		System.out.println("========전체 과일명 ========");
		for(String ss:s) //index가 존재하지 않고, 값을 변경할 수 없음
		{
			System.out.println(ss);
		}
		System.out.println("========================");
		System.out.println("과일명이 가장 짧은 과일은?");
		int min=100;
		for(String ss:s)
		{
			int len=ss.length(); //문자열 => 문자의 개수 가져오기
			if(min>len)
				min=len;
		}
		//출력
		for(String ss:s)
		{
			if(ss.length()==min)
				System.out.println(ss);
		}
		/*
		 * 문자 개수 확인 => 비밀번호
		 * String => char[] => 시작번호가 0
		 * "Hello Java"
		 *  0123456789
		 */
		
		String msg="Hello Java";
		System.out.println("9번째 문자는?");
		for(int i=0;i<msg.length();i++)
		{
			System.out.println(msg.charAt(i)); //charAt() => 문자열에서 원하는 문자추출, 0부터 시작
		}
	
		
		

	}

}
