/*
 * 영화 클래스
 * 1영화명,2출연,3감독,4예매율,5순위
 */
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] title= {"밤쉘-세상을 바꾼 폭탄선언",
						"다크나이트라이즈",
						"#살아있다",
						"스왈로우",
						"조디악"};
		String[] actor= {"샤를리즈 테론 , 니콜 키드먼 , 마고 로비",
						"크리스찬 베일 , 조셉 고든 레빗 , 게리 올드만 , 앤 해서웨이 , 톰 하디 , 마리옹 꼬띠아르 , 모건 프리먼 , 마이클 케인 , 리암 니슨",
						"유아인, 박신혜",
						"헤일리 베넷 ,  오스틴 스토웰",
						"제이크 질렌할 ,마크 러팔로"};
		
		String[] director= {"제이 로치","크리스토퍼 놀란","조일형","카를로 미라벨라 데이비스 ","데이빗 핀처"};
		double[] reserve= {15.2,15.0,2.6,1.6,1.5};
		int[] rank= {1,2,3,4,5};
		
		for(int i=0;i<5;i++)
		{
			System.out.println("영화명:"+title[i]);
			System.out.println("감독:"+director[i]);
			System.out.println("출연:"+actor[i]);
			System.out.println("예매율:"+reserve[i]);
			System.out.println("영화순위:"+rank[i]);
			System.out.println("=====================");
		}
		

	}

}
