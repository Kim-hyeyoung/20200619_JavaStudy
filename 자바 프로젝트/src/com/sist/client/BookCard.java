package com.sist.client;

import javax.swing.JPanel;
import java.awt.*;
import java.net.*;
public class BookCard extends JPanel{
	String title,poster;
	Image img;
	public BookCard(String title,String poster)
	{
		this.title=title;
		this.poster=poster;
		try
		{
			img=Toolkit.getDefaultToolkit().getImage(new URL(poster));
		}catch(Exception ex) {}
		setToolTipText(title); //Ŀ�� ��ǳ��
	}
	public void paint(Graphics g) //�׸����� ���� ����
	{
		g.drawImage(img, 0, 0, getWidth(), getHeight(), this);
	}

}
