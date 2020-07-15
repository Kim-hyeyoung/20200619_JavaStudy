
import javax.swing.*;
import java.awt.event.*;

import java.awt.*;

public class MainForm extends JFrame implements ActionListener{
	private CardLayout card=new CardLayout();//포함 클래스
	//화면 UI => 생성자에서 만듦 => 시작하면 바로 보여줘야하기 때문
	//생성자 : 한번만 호출 가능, 시작과 동시에 호출한다
	Login login=new Login();
	JoinForm join=new JoinForm();
	public MainForm()
	{
		setLayout(card);
		add("LOGIN",login);
		add("JOIN",join);
		
		setBounds(150, 50, 1200, 900);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		login.b2.addActionListener(this);
		join.b3.addActionListener(this);
	}

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		//UIManager.setLookAndFeel("com.jtattoo.plaf.mcwin.McWinLookAndFeel");
		new MainForm();
	
		

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==login.b2)
		{
			card.show(getContentPane(),"JOIN"); //클릭시 창이동
		}
		else if(e.getSource()==join.b3)
		{
			card.show(getContentPane(),"LOGIN");
		}
		
	}

}