import javax.swing.*;
import java.awt.*;

public class JoinForm extends JPanel {
	private Image background;
	
	JLabel title=new JLabel("ȸ������",JLabel.CENTER);
	JLabel la1,la2,la3,la4,la5,la6,la7,la8,la9,la10;
	JTextField tf1,tf2,tf3,tf4,tf5,tf6;
	JLabel dash=new JLabel("-");
	JButton b2=new JButton("�����ȣ�˻�");
	JPasswordField pf1,pf2;
	JRadioButton rb1,rb2;
	//�ʱ�ȭ
	JButton b1;
	JComboBox telBox=new JComboBox();
	JTextField tf7,tf8,tf9;
	JLabel dash2=new JLabel("-");
	JButton b3=new JButton("ȸ������");
	JButton b4=new JButton("���");
	public JoinForm() 
	{
		background=Toolkit.getDefaultToolkit().getImage("c:\\javaDev\\background.jpg");
	
		la1=new JLabel("���̵�",JLabel.RIGHT);
		la2=new JLabel("��й�ȣ",JLabel.RIGHT);
		la3=new JLabel("��й�ȣ ��Ȯ��",JLabel.RIGHT);
		la4=new JLabel("�̸�",JLabel.RIGHT);
		la5=new JLabel("�������",JLabel.RIGHT);
		la6=new JLabel("�޴��� ��ȣ",JLabel.RIGHT);
		la7=new JLabel("�̸���",JLabel.RIGHT);
		la8=new JLabel("���ֱ���",JLabel.RIGHT);
		la9=new JLabel("�����ȣ",JLabel.RIGHT);
		la10=new JLabel("�ּ�",JLabel.RIGHT);
		
		
		tf1=new JTextField(); //���̵� �Է�
		tf2=new JTextField(); //�̸�
		tf3=new JTextField(); //�������
		tf4=new JTextField(); //�޴�����ȣ
		tf5=new JTextField(); //�޴�����ȣ
		tf6=new JTextField(); //�̸���
		tf7=new JTextField(); //�����ȣ
		tf8=new JTextField();//�����ȣ
		tf9=new JTextField();//�ּ�
		
		pf1=new JPasswordField(); //��й�ȣ �Է�
		pf2=new JPasswordField(); //��й�ȣ ��Ȯ�� �Է�
		
		rb1=new JRadioButton("��������");
		rb2=new JRadioButton("�ؿܰ���");
		
		ButtonGroup gb=new ButtonGroup(); //���� ��ư�� �׷����� �����ؾ� �ϳ��� ���õ�
		gb.add(rb1);
		gb.add(rb2); 
		
		b1=new JButton("�ߺ�üũ");
		
		title.setFont(new Font("����ü",Font.BOLD,45));
		
		//��ġ
		setLayout(null); //��������� ��ġ
		title.setBounds(10, 15, 1000, 55);
		//�߰�
		add(title);
		
		//���̵�
		la1.setBounds(300, 100, 80, 30);
		tf1.setBounds(385, 100, 200, 30);
		b1.setBounds(590, 100, 150, 30);
		add(la1);add(tf1);add(b1);
		//��й�ȣ
		la2.setBounds(300, 135, 80, 30); //y��ǥ�� ��ĭ�� y(100)�� height(30)�� ��ģ ��+5������
		pf1.setBounds(385, 135, 200, 30);
		add(la2);add(pf1);
		//��й�ȣ ��Ȯ��
		la3.setBounds(300, 170, 80, 30);
		pf2.setBounds(385, 170, 200, 30);
		add(la3);add(pf2);
		//�̸�
		la4.setBounds(300, 205, 80, 30);
		tf2.setBounds(385, 205, 200, 30);
		add(la4);add(tf2);
		//�������
		la5.setBounds(300, 240, 80, 30);
		tf3.setBounds(385, 240, 95, 30);
		add(la5);add(tf3);
		//�޴��� ��ȣ �޺��ڽ�
		telBox.addItem("010");
		telBox.addItem("011");
		telBox.addItem("017");
		//�޴�����ȣ �Է�
		la6.setBounds(300, 275, 80, 30);
		telBox.setBounds(385, 275, 100, 30);
		tf4.setBounds(490, 275,100 , 30);
		dash2.setBounds(595, 275, 20, 30);
		tf5.setBounds(620, 275, 100, 30);
		add(la6);add(telBox);add(tf4);add(dash2);add(tf5);
		//�̸���
		la7.setBounds(300, 310, 80, 30);
		tf6.setBounds(385, 275, 100, 30);
		add(la7);add(tf6);
		//���ֱ���
		la8.setBounds(300, 345, 80, 30);
		rb1.setBounds(385, 345, 95, 30);
		rb2.setBounds(485, 345, 95, 30);
		add(la8);add(rb1);add(rb2);
		//�����ȣ
		la9.setBounds(300, 380, 80, 30);
		tf7.setBounds(490, 380, 100, 30);
		dash.setBounds(600, 380, 20, 30);
		tf8.setBounds(625, 380, 100, 30);
		b2.setBounds(730, 380, 150, 30);
		add(la9);add(tf7);add(dash);add(tf8);add(b2);
		//�ּ�
		la10.setBounds(300, 415, 80, 30);
		tf9.setBounds(385, 415, 400, 30);
		add(la10);add(tf9);
	
		
		
		
		
		
		JPanel p=new JPanel();
		p.setOpaque(false);
		
		p.setBounds(385, 620, 400, 35);
		add(p);
		
		JPanel p2=new JPanel();
		p2.setOpaque(false);
		p2.add(b3);p2.add(b4);
		rb1.setOpaque(false);
		rb2.setOpaque(false);

		
		p2.setBounds(300, 665, 485, 35);
		add(p2);
		
	}

	@Override
	protected void paintComponent(Graphics g) {
		// TODO Auto-generated method stub
		super.paintComponent(g);
		g.drawImage(background, 0, 0, getWidth(), getHeight(), this);
	}
	//����
	
		
	

}
