import javax.swing.*;
import java.awt.*;
public class 로그인 extends JPanel{
	//스킨
	private Image Back;
	private JLabel la1,la2;
	//login
	JTextField tf;
	JPasswordField pf;
	JButton b1, b2;
	//mainform
	public 로그인()
	{
		//이미지 정보 읽기
		Back=Toolkit.getDefaultToolkit().getImage("c:\\javaDev\\Back.jpeg");
		
		setLayout(null);//직접 배치
		la1=new JLabel("아이디",JLabel.RIGHT);
		la1.setBounds(745,775,80,30);
		tf=new JTextField();
		tf.setBounds(830, 775, 150, 30);
		
		add(la1);add(tf);
		
		la2=new JLabel("비밀번호",JLabel.RIGHT);
		la2.setBounds(745,810,80,30);
		pf=new JPasswordField();
		pf.setBounds(830, 810, 150, 30);
		
		add(la2);add(pf);
		
		b1=new JButton("로그인");
		b2=new JButton("취소");
		JPanel p=new JPanel();
		p.add(b1);
		p.add(b2);
		p.setOpaque(false);
		
		p.setBounds(745, 850, 235, 35);
		add(p);
		
	}
	@Override
	protected void paintComponent(Graphics g) {
		g.drawImage(Back, 0, 0, getWidth(), getHeight(), this);
	}
	

	

}
