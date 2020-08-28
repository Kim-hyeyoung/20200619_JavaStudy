// ����������
package com.sist.client;
import javax.swing.*;

import com.sist.client.ControlPanel;

import java.awt.*; // Color , Layout
import java.awt.event.*; // interface
public class MainFrame extends JFrame implements ActionListener {
	JLabel title=new JLabel("��ȭ ���� & ��õ ���α׷�",JLabel.CENTER); 
	MenuForm mf=new MenuForm(); // �޴�
	HomeForm hf=new HomeForm(); // Ȩ
	BookListForm bf=new BookListForm(); // ������õ

	ControlPanel cp; // ��Ʈ���г�
	
	// ������
	public MainFrame() {
		cp=new ControlPanel(this);
		setLayout(null); // ����� ���Ƿ� ��ġ 
		
		// Ÿ��Ʋ
		title.setFont(new Font("���� ���", Font.PLAIN, 40));
		title.setBounds(10, 15, 1400, 100);
		add(title);
		
		// �޴�â
		mf.setBounds(15, 110, 110, 300);
		add(mf);

		// ��� ȭ��
		cp.setBounds(150, 110, 1200, 550);
		add(cp);
		
		
		
		
		mf.b1.addActionListener(this);
		mf.b2.addActionListener(this);
		mf.b3.addActionListener(this);
		mf.b4.addActionListener(this);
		
		cp.bf.b1.addActionListener(this);
		cp.bf.b2.addActionListener(this);
		cp.bf.b3.addActionListener(this);
		cp.bf.b4.addActionListener(this);
		cp.bf.tf.addActionListener(this);
		//  ������â
		setSize(1400,900); // ũ��
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE); // x��ư ������ ����
		
	}

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		UIManager.setLookAndFeel("com.jtattoo.plaf.hifi.HiFiLookAndFeel");
		new MainFrame();
	}
	
	
	// ��ư ������ �� 
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==mf.b1)
		{
			cp.card.show(cp, "HF");
		}
		else if(e.getSource()==cp.bf.b1)
	    {
	        cp.bf.bookAllData(1);
	    }
	    else if(e.getSource()==cp.bf.b2)
	    {
	       cp.bf.bookAllData(2);
	    }
	    else if(e.getSource()==cp.bf.b3)
	    {
	       cp.bf.bookAllData(3);
	    }
	      
	    else if(e.getSource()==cp.bf.b4 || e.getSource()==cp.bf.tf) //�˻�â���� �˻���ư(b4) or ����������(tf)
	    {
	         // 1 �Էµ� �� �б�
	         String ss=cp.bf.tf.getText();
	         if(ss.length()<1) //�Էµ� �˻�� �������
	         {
	            JOptionPane.showMessageDialog(this, "�˻�� �Է��ϼ���");
	            cp.bf.tf.requestFocus();
	            return; //�޼ҵ�����
	         }
	         cp.bf.BookFindData(ss);
	    }
		else if(e.getSource()==mf.b2)
		{
			cp.card.show(cp, "BF");
		}
		else if(e.getSource()==mf.b3)
		{
			cp.card.show(cp, "VF");
		}
		else if(e.getSource()==mf.b4)
		{
			cp.card.show(cp, "SF");
		}		
	}

	public static Image getImage(ImageIcon ii,int w,int h)
    {
       Image dimg = ii.getImage().getScaledInstance(w, h,
               Image.SCALE_SMOOTH);
       return dimg;
    }
}
