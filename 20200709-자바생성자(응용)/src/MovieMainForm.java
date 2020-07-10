import javax.swing.*; //window 관련 클래스
import javax.swing.border.LineBorder;

import java.awt.*; //레이아웃(화면 배치)
import java.awt.event.*; //버튼,텍스트 엔터 => 행위 이벤트
import java.net.URL;
//자바에서 지원하는 윈도우의 모든 기능을 사용한다
//자바에서 상속은 하나만 가능 (단일 상속)
public class MovieMainForm extends JFrame implements ActionListener,MouseListener{
	JMenuBar bar=new JMenuBar();
	JMenuItem home=new JMenuItem("Home");
	JMenuItem find=new JMenuItem("찾기");
	JMenuItem exit=new JMenuItem("종료");
	
	// 실행시 윈도우를 보여준다 => 생성자
	CardLayout card=new CardLayout();
	MovieList ml=new MovieList();
	MovieDetail md=new MovieDetail();
	MovieFind mf=new MovieFind();
	
	int curpage=1;
	int totalpage=194;
	//명시적 초기화
	
	MovieMainForm() {
		//메뉴설정
		JMenu menu=new JMenu("메뉴");
		menu.add(home);
		menu.add(find);
		menu.addSeparator(); //메뉴바 구분선
		menu.add(exit);
		bar.add(menu);
		
		//윈도우에 설정
		setJMenuBar(bar);
		//레이아웃 설정
		setLayout(card);
		add("ML",ml);
		add("MF",mf);
		add("MD",md);
		//윈도우 크기 설정
		setSize(1300, 1000);
		//윈도우 보여주기
		setVisible(true);
		
		home.addActionListener(this);
		find.addActionListener(this);
		exit.addActionListener(this);
		
		ml.b1.addActionListener(this); //이전 버튼
		ml.b2.addActionListener(this); //다음 버튼
		
		moviePrint(1);
		
		for(int i=0;i<2;i++)
		{
			for(int j=0;j<5;j++)
			{
				ml.movie[i][j].addMouseListener(this);
			}
		}
		
	
	}
	void moviePrint(int page)
	{
		MovieVO[] movies=MovieManager.movieListData(page);
		int k=0;
		for(MovieVO vo:movies)
		{
			try
			{
				//포스터 읽기
				URL url=new URL(vo.poster);
				Image img=getImage(new ImageIcon(url),ml.movie[0][0].getWidth(),ml.movie[0][0].getHeight());
				ml.movie[k/5][k%5].setIcon(new ImageIcon(img)); //1차원 배열을 2차원으로 [x][y]에서 k/5값이 [x] k%5값이 [y]
				k++;
			}catch(Exception ex) {}
		}
		
		ml.pLa.setText(curpage+" page / "+totalpage+"pages");
	}
	static Image getImage(ImageIcon ii,int w,int h)
	{
		Image dimg=ii.getImage().getScaledInstance(w, h, Image.SCALE_SMOOTH);
		return dimg;
	}
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		UIManager.setLookAndFeel("com.jtattoo.plaf.hifi.HiFiLookAndFeel");
		new MovieMainForm(); //생성자는 반드시 new로 호출!!!

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==home)
		{
			card.show(getContentPane(), "ML");
		}
		else if(e.getSource()==find)
		{
			card.show(getContentPane(), "MF");
		}
		else if(e.getSource()==exit)
		{
			System.exit(0);
		}
		else if(e.getSource()==ml.b1) //이전버튼 클릭시 수행
		{
			if(curpage>1)
			{
				curpage--;
				moviePrint(curpage);
			}
		}
		else if(e.getSource()==ml.b2) //다음버튼 클릭시 수행
		{
			if(curpage<totalpage)
			{
				curpage++;
				moviePrint(curpage);
			}
		}
		
	}
	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mousePressed(MouseEvent e) { //클릭하면서 움직이기
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseEntered(MouseEvent e) { //마우스 갖다대면 바뀌는거
		// TODO Auto-generated method stub
		for(int i=0;i<2;i++)
		{
			for(int j=0;j<5;j++)
			{
				if(e.getSource()==ml.movie[i][j])
				{
					LineBorder line=new LineBorder(Color.cyan,5);
					ml.movie[i][j].setBorder(line);
				}
				
			}
		}
		
	}
	@Override
	public void mouseExited(MouseEvent e) { //마우스 갖다댔다가 떼면 원상복귀
		// TODO Auto-generated method stub
		for(int i=0;i<2;i++)
		{
			for(int j=0;j<5;j++)
			{
				ml.movie[i][j].setBorder(null);
			}
		}
		
	}

}
