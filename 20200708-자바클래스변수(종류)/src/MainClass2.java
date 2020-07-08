/*
 * 사용자가 직접 데이터형을 만든다
 */
class MovieInfo{
	String title;
	String director;
	String actor;
	double reserve;
	int rank;  //인스턴스 변수 => 메모리 공간 생성 => 'new'
	static String site_name; //static은 공유변수이기 때문에 메모리를 공동으로 사용 => 값을 변경하면 모두 바뀜
	
}
//MovieInfo m1=new MovieInfo()
public class MainClass2 { //public을 쓰는 클래스가 저장명이 됨. 한 번만 사용가능. 없어도 됨(없으면 main이 있는 클래스가 저장명)

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MovieInfo m1=new MovieInfo();
		//m1 메모리에 저장되어 있는변수의 초기화   // MovieInfo[]=new  MovieInfo[50];
		m1.title="밤쉘-세상을 바꾼 폭탄선언";
		m1.director="제이 로치";
		m1.actor="샤를리즈 테론 , 니콜 키드먼 , 마고 로비";
		m1.reserve=15.2;
		m1.rank=1;
		m1.site_name="CGV";
		
		MovieInfo m2=new MovieInfo();
		//m2 메모리에 저장되어 있는변수의 초기화
		m2.title="다크나이트라이즈";
		m2.director="크리스토퍼 놀란";
		m2.actor="크리스찬 베일 , 조셉 고든 레빗 , 게리 올드만 , 앤 해서웨이 , 톰 하디 , 마리옹 꼬띠아르 , 모건 프리먼 , 마이클 케인 , 리암 니슨";
		m2.reserve=15.0;
		m2.rank=2;
		m2.site_name="롯데시네마";
		
		MovieInfo m3=new MovieInfo();
		//m3 메모리에 저장되어 있는변수의 초기화
		m3.title="#살아있다";
		m3.director="조일형";
		m3.actor="유아인, 박신혜";
		m3.reserve=2.6;
		m3.rank=3;
		m3.site_name="메가박스";
		
		System.out.println("영화관:"+m1.site_name); //=>이 경우 메가박스로 나옴
		
		MovieInfo.site_name="서울극장"; //m1,m2등이 아닌 클래스 이름으로도 변경 가능
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
