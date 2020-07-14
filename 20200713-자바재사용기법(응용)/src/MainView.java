import javax.swing.*;
import java.awt.*;
public class MainView extends JPanel{
	Image Back;
	public MainView()
	{
		Back=Toolkit.getDefaultToolkit().getImage("c:\\javaDev\\Back.jpeg");
	}
	//메소드 내용 변경

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

	}

	@Override
	protected void paintComponent(Graphics g) {
		g.drawImage(Back, 0, 0, getWidth(), getHeight(), this);
	}

}
