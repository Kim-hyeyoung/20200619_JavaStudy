package com.sist.common;
//Client, Server 공통사용 클래스
//프로그램 기능 설정 => 내부 프로토콜(서버와 클라이언트의 약속)
//웹 서버
public class Function {
	//로그인 처리 / 이미 로그인 된사람
	public static final int LOGIN=100; //이미 로그인 된 사람
	public static final int MYLOG=110; //지금 로그인 하는 사람
	
	//방만들기
	//방들어가기
	//방나가기
	//대기실 수정
	//대기실 채팅
	public static final int WAITCHAT=500;
	//방에서 채팅
	//쪽지보내기
	//채팅 종료
	//1:1게임

}
