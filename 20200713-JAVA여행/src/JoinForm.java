import javax.swing.*;
import java.awt.*;

public class JoinForm extends JPanel {
	private Image background;
	
	JLabel title=new JLabel("회원가입",JLabel.CENTER);
	JLabel la1,la2,la3,la4,la5,la6,la7,la8,la9,la10;
	JTextField tf1,tf2,tf3,tf4,tf5,tf6;
	JLabel dash=new JLabel("-");
	JButton b2=new JButton("우편번호검색");
	JPasswordField pf1,pf2;
	JRadioButton rb1,rb2;
	//초기화
	JButton b1;
	JComboBox telBox=new JComboBox();
	JTextField tf7,tf8,tf9;
	JLabel dash2=new JLabel("-");
	JButton b3=new JButton("회원가입");
	JButton b4=new JButton("취소");
	public JoinForm() 
	{
		background=Toolkit.getDefaultToolkit().getImage("c:\\javaDev\\background.jpg");
	
		la1=new JLabel("아이디",JLabel.RIGHT);
		la2=new JLabel("비밀번호",JLabel.RIGHT);
		la3=new JLabel("비밀번호 재확인",JLabel.RIGHT);
		la4=new JLabel("이름",JLabel.RIGHT);
		la5=new JLabel("생년월일",JLabel.RIGHT);
		la6=new JLabel("휴대폰 번호",JLabel.RIGHT);
		la7=new JLabel("이메일",JLabel.RIGHT);
		la8=new JLabel("거주구분",JLabel.RIGHT);
		la9=new JLabel("우편번호",JLabel.RIGHT);
		la10=new JLabel("주소",JLabel.RIGHT);
		
		
		tf1=new JTextField(); //아이디 입력
		tf2=new JTextField(); //이름
		tf3=new JTextField(); //생년월일
		tf4=new JTextField(); //휴대폰번호
		tf5=new JTextField(); //휴대폰번호
		tf6=new JTextField(); //이메일
		tf7=new JTextField(); //우편번호
		tf8=new JTextField();//우편번호
		tf9=new JTextField();//주소
		
		pf1=new JPasswordField(); //비밀번호 입력
		pf2=new JPasswordField(); //비밀번호 재확인 입력
		
		rb1=new JRadioButton("국내거주");
		rb2=new JRadioButton("해외거주");
		
		ButtonGroup gb=new ButtonGroup(); //라디오 버튼은 그룹으로 생성해야 하나씩 선택됨
		gb.add(rb1);
		gb.add(rb2); 
		
		b1=new JButton("중복체크");
		
		title.setFont(new Font("굴림체",Font.BOLD,45));
		
		//배치
		setLayout(null); //사용자정의 배치
		title.setBounds(10, 15, 1000, 55);
		//추가
		add(title);
		
		//아이디
		la1.setBounds(300, 100, 80, 30);
		tf1.setBounds(385, 100, 200, 30);
		b1.setBounds(590, 100, 150, 30);
		add(la1);add(tf1);add(b1);
		//비밀번호
		la2.setBounds(300, 135, 80, 30); //y좌표는 전칸의 y(100)와 height(30)를 합친 값+5정도로
		pf1.setBounds(385, 135, 200, 30);
		add(la2);add(pf1);
		//비밀번호 재확인
		la3.setBounds(300, 170, 80, 30);
		pf2.setBounds(385, 170, 200, 30);
		add(la3);add(pf2);
		//이름
		la4.setBounds(300, 205, 80, 30);
		tf2.setBounds(385, 205, 200, 30);
		add(la4);add(tf2);
		//생년월일
		la5.setBounds(300, 240, 80, 30);
		tf3.setBounds(385, 240, 95, 30);
		add(la5);add(tf3);
		//휴대폰 번호 콤보박스
		telBox.addItem("010");
		telBox.addItem("011");
		telBox.addItem("017");
		//휴대폰번호 입력
		la6.setBounds(300, 275, 80, 30);
		telBox.setBounds(385, 275, 100, 30);
		tf4.setBounds(490, 275,100 , 30);
		dash2.setBounds(595, 275, 20, 30);
		tf5.setBounds(620, 275, 100, 30);
		add(la6);add(telBox);add(tf4);add(dash2);add(tf5);
		//이메일
		la7.setBounds(300, 310, 80, 30);
		tf6.setBounds(385, 275, 100, 30);
		add(la7);add(tf6);
		//거주구분
		la8.setBounds(300, 345, 80, 30);
		rb1.setBounds(385, 345, 95, 30);
		rb2.setBounds(485, 345, 95, 30);
		add(la8);add(rb1);add(rb2);
		//우편번호
		la9.setBounds(300, 380, 80, 30);
		tf7.setBounds(490, 380, 100, 30);
		dash.setBounds(600, 380, 20, 30);
		tf8.setBounds(625, 380, 100, 30);
		b2.setBounds(730, 380, 150, 30);
		add(la9);add(tf7);add(dash);add(tf8);add(b2);
		//주소
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
	//변경
	
		
	

}
