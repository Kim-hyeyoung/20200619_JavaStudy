import javax.swing.*;
import java.awt.*;
public class Login extends JPanel{
	//��Ų
	private Image background;
	private JLabel la1,la2;
	//login
	JTextField tf;
	JPasswordField pf;
	JButton b1, b2;
	//mainform
	public Login()
	{
		//�̹��� ���� �б�
		background=Toolkit.getDefaultToolkit().getImage("c:\\javaDev\\background.jpg");
		
		setLayout(null);//���� ��ġ
		la1=new JLabel("���̵�",JLabel.RIGHT);
		la1.setBounds(450,675,80,30);
		tf=new JTextField();
		tf.setBounds(550, 675, 150, 30);
		
		add(la1);add(tf);
		
		la2=new JLabel("��й�ȣ",JLabel.RIGHT);
		la2.setBounds(450,710,80,30);
		pf=new JPasswordField();
		pf.setBounds(550, 710, 150, 30);
		
		add(la2);add(pf);
		
		b1=new JButton("�α���");
		b2=new JButton("ȸ������");
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
