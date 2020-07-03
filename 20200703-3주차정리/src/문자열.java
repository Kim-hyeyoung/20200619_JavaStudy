/*
 *  문자열을 저장하는 공간 (String)
 *  기본형 => 정수, 실수, 논리, 문자
 *  참조형 => 실제 저장 장소는 다른 곳에 있고 주소만 저장
 *   1) 저장방법
 *   	String s="문자저장"; => 많이 사용
 *   	String s=new String("");
 *   2) 주요기능
 *   	문자를 제어할 수 있는 기능(메소드) => 라이브러리 핵심
 *   	!!주의점 : 원본은 변경되지 않음!!
 *   	=> length() : 문자 개수
 *   	=> substring() : 문자를 자를 때
 *   	=> contains() : 문자열 중 포함된 단어가 있는지 확인
 *   	=> startsWith, endsWith : 서제스트(자동완성) : 검색기
 *   	=> trim() : 좌우 공백 제거
 *   		String s=" Hello Java "
 *   		s.trim() => "Hello Java"
 *   		가운데 공백 제거 => s.replace(" ","")
 *   	=> equals() : 문자열 비교할 때 사용  ===> 대소문 구분
 *   	=> split() : 문자를 구분해서 배열로 만듦(구분문자 포함)
 *   	=> replace, relaceAll : 문자를 변경할 경우
 *   	=> valueOf() : 모든 데이터형을 문자열로 변경
 *   	=> toLowerCase() : 소문자로 변환 
 *   	=> toUpperCase() : 대문자로 변환
 *   
 *   		
 */
import javax.swing.*;
import java.awt.event.*;
public class 문자열 extends JFrame implements ActionListener{ //텍스트에서 엔터 쳤을 때 처리
	JTextField tf=new JTextField();
	JTextField tf1=new JTextField();
	public 문자열() {
		add("North",tf);
		add("South",tf1);
		tf.setText(String.valueOf(20));
		setSize(350, 300);
		setVisible(true);
		
		tf.addActionListener(this); //tf에서 엔터 =>actionPerformed 호출
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new 문자열();

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==tf)
		{
			//tf1.setText(tf.getText().toUpperCase());
			tf1.setText(tf.getText().toLowerCase());
		}
	}

}
