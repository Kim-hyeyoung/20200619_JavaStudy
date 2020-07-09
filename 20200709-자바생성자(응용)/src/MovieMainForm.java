import javax.swing.*; //window 관련 클래스
import java.awt.*; //레이아웃(화면 배치)
import java.awt.event.*; //버튼,텍스트 엔터 => 행위 이벤트
//자바에서 지원하는 윈도우의 모든 기능을 사용한다
//자바에서 상속은 하나만 가능 (단일 상속)
public class MovieMainForm extends JFrame implements ActionListener{
	JMenuBar bar=new JMenuBar();
	JMenuItem home=new JMenuItem("Home");
	JMenuItem find=new JMenuItem("찾기");
	JMenuItem exit=new JMenuItem("종료");
	
	// 실행시 윈도우를 보여준다 => 생성자
	CardLayout card=new CardLayout();
	MovieList ml=new MovieList();
	MovieDetail md=new MovieDetail();
	MovieFind mf=new MovieFind();
	
	public MovieMainForm() {
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
		add("MF",mf);
		add("MD",md);
		add("ML",ml);
		//윈도우 크기 설정
		setSize(1300, 1000);
		//윈도우 보여주기
		setVisible(true);
		
		home.addActionListener(this);
		find.addActionListener(this);
		exit.addActionListener(this);
		
	
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
		
	}

}
