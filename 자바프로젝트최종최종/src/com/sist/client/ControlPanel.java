// ��Ʈ���г�
package com.sist.client;
import java.awt.*;
import javax.swing.*;
public class ControlPanel extends JPanel {
	CardLayout card=new CardLayout();
	MusicalDetailForm df=new MusicalDetailForm(); // �󼼺���
	BookListForm blf=new BookListForm(); // ����
	MangoListForm mlf=new MangoListForm(); // ����
	MusicListForm clf=new MusicListForm(); // ����
	NewsForm nf=new NewsForm(); // ����
	MusicalForm ff; // Ȩȭ��
	ClientMainFrame c; // ����

	public ControlPanel(ClientMainFrame c) {
		this.c=c;
		ff=new MusicalForm(c);
		setLayout(card);
		
		add("FF",ff); // Ȩ
		add("DF",df); // Ȩ ��
		add("BLF",blf); // ����
		add("MLF",mlf); // ����
		add("CLF",clf); // ����	
		add("NF",nf); // ����

	}
}
