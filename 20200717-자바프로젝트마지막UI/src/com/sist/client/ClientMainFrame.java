package com.sist.client;
//������ => JFrame
//������ ���õ� Ŭ������ �о�´�

import javax.swing.*;//������ ����
import java.awt.*; //color, layout(��ġ)
import java.awt.event.*;//interface(��ư����)
/*
 * ����
 * 	=��� (is-a) : ������ Ŭ������ �����ؼ� ���
 * 	=���� (has-a) : ������ Ŭ������ ������� ���
 */
public class ClientMainFrame extends JFrame implements ActionListener{
	//������ ũ�� ���� => �����ڿ��� ���
	JLabel title=new JLabel("������ & ���� ��õ����Ʈ",JLabel.CENTER);
	MenuForm mf=new MenuForm();
	ChatForm cf=new ChatForm();
	ControllPanel cp=new ControllPanel();
	
	public ClientMainFrame()
	{
		/*
		 * Ŭ�������� ������ ��� => ������ �ƴ϶� ������ ��
		 * ex) �����ͺ��̽� : ����Ŭ ����
		 * 	       ��Ʈ��ũ : ����
		 * 	       �� : ��Ű���� ���б�
		 */
		//����Ʈ ���� ��ġ
		title.setFont(new Font("����ü",Font.BOLD,55));
		//title.setOpaque(true);
		//title.setBackground(Color.green);
		setLayout(null); //���� ���� ��ġ�ϱ� ����
		title.setBounds(10, 15, 1570, 100);
		//�����쿡 �߰�
		add(title);
		
		//�޴���ġ
		mf.setBounds(10, 120, 100, 300);
		add(mf);
		
		//ä����
		cf.setBounds(115, 760, 1465, 200);
		add(cf);
		
		//����Ʈ���ȭ��
		cp.setBounds(115, 120, 1465, 635);
		add(cp);
		
		//������ ȭ�� ��ü ����
		setSize(1600, 1000);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE); //X��ư Ŭ���� ����(�޸� �Ҵ�x)
		
		mf.b1.addActionListener(this);
		mf.b2.addActionListener(this);
		
	}
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		//�����ڴ� ȣ��ÿ� �ݵ�� 'new ������();'
		UIManager.setLookAndFeel("com.jtattoo.plaf.mcwin.McWinLookAndFeel");
		new ClientMainFrame();

	}
	public static Image getImage(ImageIcon ii,int w,int h)
	    {
	    	Image dimg = ii.getImage().getScaledInstance(w, h,
	    	        Image.SCALE_SMOOTH);
	    	return dimg;
	    }
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==mf.b1)
		{
			cp.card.show(cp, "DF");
		}
		if(e.getSource()==mf.b2)
		{
			cp.card.show(cp, "LF");
		}
	}

}
