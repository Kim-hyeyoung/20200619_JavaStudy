/*
 * 윈도우
 * 	=container : component를 여러개 묶어서 화면 출력
 * 		= JFrame
 * 		= JWindow
 * 		= JDialog
 * 		=========== 단독 실행 가능
 * 		= JPanel
 * 		=========== 단독 실행 불가능
 * 	=component : 한 개의 기능만 가지고 있음
 * 		= JLabel : 일반 문자열 출력, 이미지 출력
 *  	버튼
 *  	=일반버튼 : JButton
 *  	=토글버튼 : JRadioButton, JCheckBox
 *  	=메뉴
 *  		입력창
 *  			=한줄입력 : JTextField
 *  			=비밀번호 : JPasswordField
 *  			=여러줄 입력 : JTextArea => 소개,내용출력
 *  			=여러줄 입력 : JTextPane => 채팅
 *  		목록창
 *  			=선택창 : JComboBox
 *  			=전체내용출력 : JList
 *  			=JTree
 *  			=JTable
 *  		화면분할
 *  			=JTabbedPane
 *  			=JSplitPane => div
 *  			=JInteralFrame
 *  ================================================ interface
 *  	배치(Layout), 사용자 정의 배치
 *  	=BorderLayout : 5군데 배치 가능(위,아래,가운데,왼쪽,오른쪽)
 *  	=FlowLayout
 *  	=GridLayout
 *  	=CardLayout
 *  	=사용자 정의 : setBounds
 */
import javax.swing.*;
import java.awt.*;
public class MainForm extends JFrame{
	private CardLayout card=new CardLayout();//포함 클래스
	//화면 UI => 생성자에서 만듦 => 시작하면 바로 보여줘야하기 때문
	//생성자 : 한번만 호출 가능, 시작과 동시에 호출한다
	로그인 login=new 로그인();
	public MainForm()
	{
		setLayout(card);
		add("LOGIN",login);
		/*
		 * Layout 설정
		 	JFrame, JWindow, JDialog =>BorderLayout
		 	JPanel => FlowLayout 
		 	사용자 정의 사용 => setLayout(null)
		 */
		setBounds(400, 600, 1024, 950);
		setVisible(true);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new MainForm();
		

	}

}
