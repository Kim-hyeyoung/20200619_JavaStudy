
public class MainClass2 {
	String book="Java의 정석"; // 인스턴스변수는 new를 이용해서 메모리 공간을 만들고 저장해야 사용 가능
	String author="남궁성";
	static String publisher="도우출판"; //공유변수는 자동으로 메모리에 저장
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MainClass2 m=new MainClass2(); //m안에 String book과 String author 두 개가 저장됨 / static String publisher는 이미 저장되어 있음
									//=> 호출시 '.' 이용 => m.book , m.author
									// 인스턴스변수는 new를 이용해서 메모리 공간을 만들고 저장해야 사용 가능
		System.out.println("책이름:"+m.book);
		System.out.println("저자:"+m.author);
		System.out.println("출판사:"+MainClass2.publisher);
		System.out.println("출판사:"+publisher); //static은 그냥 가져올 수 있음
		System.out.println("출판사:"+m.publisher); //권장
		/*
		 * static => 객체를 통해서 접근 =>  m.publisher
		 * 		  => 클래스명을 통해 접근 => MainClass2.publisher
		 * 		  => 같은 클래스에 있는 경우 => publisher
		 * 
		 * 		*** 스프링은 new 사용 비권장 => 리플렉션
		 */

	}

}
