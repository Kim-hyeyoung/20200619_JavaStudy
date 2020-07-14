/*
 * 재사용 : 기존에 만들어진 클래스를 사용 (반복 코딩을 제거)
 * 	1) 상속 (is-a)
 * 		이미 만들어진 기능을 변경해서 사용
 * 		public class MyWindow extends JFrame
 * 							  =======>확장된 클래스
 * 		**상속예외 :private, static
 * 	A클래스가 가지고 있는 모든 것이 상속 => 예외 :private, static, 생성자
 *  public class A
 * {
 * 		String name;
 * 		int age;
 * 		public void display();
 * }
 * 
 * 	public class B extends A
 * {
 * 		String name;
 * 		int age;
 * 		public void display();
 * }
 * 
 * 
 * 
 * 	2) 포함 (has-a)
 * 		이미 만들어진 기능을 변경없이 그대로 사용
 * 		public class MyWindow
 * 		{
 * 			JFrame f=new JFrame();
 * 		}
 * 

 */
import javax.swing.*;
public class MainClass extends JFrame { //String,Math,system은 상속x => 파이널 클래스
	/*
	public MainClass() //생성자는 가급적이면 public메소드로 선언한다
	{
		
	}
	*/
	public MainClass() {
		//기능
		setSize(300, 300); //super.setSize(300, 300); JFrame 요소
		setVisible(true); //this.setVisible(true);   ==> 이렇게 해도 동일하게 작동(쓰지 않아도 자동 추가)
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new MainClass();

	}

}
