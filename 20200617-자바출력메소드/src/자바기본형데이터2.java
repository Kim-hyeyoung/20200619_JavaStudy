/*
 * 		\t
 *		\n 		
 *		\"
 * 		\\
 * 		double d=123456.78
 * 		int a= (int)((d-123456)*100)
 * 
 * 		퍼블릭 클래스 자바기본형{
 * 			퍼블릭 스태틱 보이드 메인(스트링[] 매개)
 * 			{
 * 			}       => 이렇게 코딩할 수도 있긴 함 (다국어)
 */
public class 자바기본형데이터2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("C:\\javaDev\\javaStudy\\20200617-자바출력메소드\\src\\자바기본형데이터2.java");
		System.out.println("\"홍길동\""); // "홍길동"으로 출력하고 싶음
		System.out.print("Hello\t");
		System.out.print("Java!!\n");
		
		//double d=123456.78;   // 이렇게 하면 double이 8byte고 int가 4byte여서 78이 아닌 77로 나옴
		float d=123456.78F;    //  이렇게 4byte로 맞춰주면 78로 맞게 나옴
		int a= (int)((d-123456)*100); 
		System.out.println(a);    
		
		

	}

}
