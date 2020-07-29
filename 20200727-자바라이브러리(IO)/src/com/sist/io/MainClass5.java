package com.sist.io;
import java.util.*;
import java.io.*;
//파일 업로드 (파일 copy)
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class MainClass5 extends JFrame implements ActionListener{
	JTextField tf=new JTextField(25); //패널에 넣으려면 크기 지정해줘야 함(기본값 1이라 안보임)
	JButton b=new JButton("파일선택");
	public MainClass5()
	{
		JPanel p=new JPanel();
		p.add(tf);
		p.add(b);
		add("Center",p);
		setSize(450,250);
		setVisible(true);
		b.addActionListener(this); //this : 본인 클래스 안에 있다
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new MainClass5();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==b)
		{
			JFileChooser jc=new JFileChooser();
			if(jc.showOpenDialog(this)==jc.APPROVE_OPTION)
			{
				tf.setText(jc.getSelectedFile().getPath());//파일 카피(업로드)
				try
				{
					FileInputStream fis=new FileInputStream(tf.getText());
					FileOutputStream fos=new FileOutputStream("c:\\upload\\"+jc.getSelectedFile().getName());
					
					int i=0;
					byte[] buffer=new byte[1024];
					while((i=fis.read(buffer, 0, 1024))!=-1)
					{
						fos.write(buffer, 0, i); //i=읽은 바이트 수
					}
					fis.close();
					fos.close();
					JOptionPane.showMessageDialog(this, "파일 업로드 완료");
				}catch(Exception ex) {}
			}
		}
	}

}
