import javax.swing.*;
import java.awt.*;
public class Login extends JPanel{
	JLabel title=new JLabel("모두투어",JLabel.CENTER);
	//스킨
	private Image background;
	private JLabel la1,la2;
	//login
	JTextField tf;
	JPasswordField pf;
	JButton b1, b2;
	//mainform
	public Login()
	{
		//이미지 정보 읽기
		background=Toolkit.getDefaultToolkit().getImage("c:\\javaDev\\mainback.jpg");
		
		title.setFont(new Font("맑은 고딕",Font.BOLD,60));
		
		//배치
		setLayout(null); //사용자정의 배치
		title.setBounds(80, 300, 1000, 55);
		//추가
		add(title);
		
		setLayout(null);//직접 배치
		la1=new JLabel("아이디",JLabel.RIGHT);
		la1.setBounds(450,675,80,30);
		tf=new JTextField();
		tf.setBounds(550, 675, 150, 30);
		
		add(la1);add(tf);
		
		la2=new JLabel("비밀번호",JLabel.RIGHT);
		la2.setBounds(450,710,80,30);
		pf=new JPasswordField();
		pf.setBounds(550, 710, 150, 30);
		
		add(la2);add(pf);
		
		b1=new JButton("로그인");
		b2=new JButton("회원가입");
		JPanel p=new JPanel();
		p.add(b1);
		p.add(b2);
		p.setOpaque(false);
		
		p.setBounds(500, 745, 235, 35);
		add(p);
		
	}
	@Override
	protected void paintComponent(Graphics g) {
		g.drawImage(background, 0, 0, getWidth(), getHeight(), this);
	}
	

	

}
