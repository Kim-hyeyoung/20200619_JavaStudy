
import javax.swing.*;
import java.awt.event.*;

import java.awt.*;

public class MainForm extends JFrame implements ActionListener{
	private CardLayout card=new CardLayout();//���� Ŭ����
	//ȭ�� UI => �����ڿ��� ���� => �����ϸ� �ٷ� ��������ϱ� ����
	//������ : �ѹ��� ȣ�� ����, ���۰� ���ÿ� ȣ���Ѵ�
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
			card.show(getContentPane(),"JOIN"); //Ŭ���� â�̵�
		}
		else if(e.getSource()==join.b3)
		{
			card.show(getContentPane(),"LOGIN");
		}
		
	}

}