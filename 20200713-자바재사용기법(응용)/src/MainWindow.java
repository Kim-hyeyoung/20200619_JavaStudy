/*윈도우 내용 변경 => 상속
	class A extends JFrame
*/
import javax.swing.JFrame;

public class MainWindow extends JFrame{
	public MainWindow()
	{
		setSize(800, 600);
		setVisible(true);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//생성자 호출
		new MainWindow();

	}

}
