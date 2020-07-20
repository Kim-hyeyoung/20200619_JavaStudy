package com.sist.inter;
/*
 * �ڹ����� �������̽�
 * 1) window (javax.swing)
 * 	  ActionListener :��ư, �޴�, �ؽ�Ʈ����
 * 	  MouseListener
 *    MouseMotionListener
 *    KeyListener
 *    FocusListener
 *    ItemListener
 * 2) �����ͺ��̽� ����
 * 	  Connection
 * 	  Statement
 * 	  ResultSet
 */
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class MainClass2 extends JFrame implements ActionListener,MouseListener,ItemListener{ //���� ����� ','�� ����
	JButton b1;
	JTextField tf;
	JLabel la;
	JComboBox box;
	public MainClass2()
	{
		b1=new JButton("Ŭ��");
		tf=new JTextField();
		la=new JLabel(new ImageIcon("c:\\javaDev\\air.jpg"));
		box=new JComboBox();
		box.addItem("ȫ�浿");
		box.addItem("�ڹ���");
		box.addItem("�̼���");
		add("West",b1);
		add("Center",la);
		add("South",tf);
		add("North",box);
		
		setSize(450,500);
		setVisible(true);
		
		//�̺�Ʈ ���
		//=> b1�̶�� ��ư�� Ŭ���ϸ� actionperformed() ȣ��
		b1.addActionListener(this); //this => �ڽ� mainclass2
		tf.addActionListener(this); //mainclass2�� �ƴ� �ٸ� Ŭ������ ����� �����ߴٸ� (this)�� �ƴ�(new Ŭ������) ������
		la.addMouseListener(this);
		box.addItemListener(this);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new MainClass2();

	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==la)
		{
			if(e.getClickCount()==2) //����Ŭ�� �̺�Ʈ
			{
				JOptionPane.showMessageDialog(this, "�󼼺���� �̵�");
			}
		}
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==b1)
		{
			JOptionPane.showMessageDialog(this, "��ưŬ��");
		}
		else if(e.getSource()==tf)
		{
			String msg=tf.getText();
			JOptionPane.showMessageDialog(this, msg);
		}
	}

	@Override
	public void itemStateChanged(ItemEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==box)
		{
			String name=(String)box.getSelectedItem();
			JOptionPane.showMessageDialog(this, name);
		}
	}

}
