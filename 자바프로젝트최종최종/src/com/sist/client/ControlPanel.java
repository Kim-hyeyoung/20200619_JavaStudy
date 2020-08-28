// 컨트롤패널
package com.sist.client;
import java.awt.*;
import javax.swing.*;
public class ControlPanel extends JPanel {
	CardLayout card=new CardLayout();
	MusicalDetailForm df=new MusicalDetailForm(); // 상세보기
	BookListForm blf=new BookListForm(); // 도서
	MangoListForm mlf=new MangoListForm(); // 맛집
	MusicListForm clf=new MusicListForm(); // 음악
	NewsForm nf=new NewsForm(); // 뉴스
	MusicalForm ff; // 홈화면
	ClientMainFrame c; // 메인

	public ControlPanel(ClientMainFrame c) {
		this.c=c;
		ff=new MusicalForm(c);
		setLayout(card);
		
		add("FF",ff); // 홈
		add("DF",df); // 홈 상세
		add("BLF",blf); // 도서
		add("MLF",mlf); // 맛집
		add("CLF",clf); // 음악	
		add("NF",nf); // 뉴스

	}
}
