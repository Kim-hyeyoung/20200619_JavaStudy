package com.sist.project;
import java.io.FileWriter;
import java.util.*;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
public class MovieManager {
	public void movieAllData()
	{
		try {
			ArrayList<MovieVO> list=new ArrayList<MovieVO>();
			String[] site= {"https://movie.daum.net/premovie/released?reservationOnly=N&sort=reservation&page=",  //현재상영의 마지막페이지 주소 // for문 돌리기 위해서 마지막 페이지 번호 지움
							"https://movie.daum.net/premovie/scheduled?reservationOnly=N&sort=reservation&page=",  //개봉예정의 마지막페이지 주소// for문 돌리기 위해서 마지막 페이지 번호 지움
							"https://movie.daum.net/boxoffice/weekly",//박스오피스 주간
							"https://movie.daum.net/boxoffice/monthly",//박스오피스 월간
							"https://movie.daum.net/boxoffice/yearly"};//박스오피스 연간
			//int mno=1;
			//int cno=1;//현재상영작 긁기
			//int mno=64;//현재상영작 끝나는 번호 44이기 떄문
			//int cno=2; //개봉예정작 긁기
			//int mno=78;
			//int cno=3;//주간
			//int mno=88;
			//int cno=4;//월간
			int mno=107;
			int cno=5;//연간
			
			//for(int i=1;i<=3;i++) //현재상영 3페이지까지니까
			//for(int i=4;i<=6;i++) //개봉예정 4~6페이지
			{
				//사이트 연결해서 데이터를 한번에 읽어들인다 => 메모리에 저장 => Document
				Document doc=Jsoup.connect("https://movie.daum.net/boxoffice/yearly").get(); //주소url은 현재상영작/개봉예정작 등에 따라 변경
				//<a href="/moviedb/main?movieId=135083" class="name_movie"//현재상영 마지막 페이지 소스보기
				Elements link=doc.select("a.name_movie");//상세보기 위해 클릭하는 요소
				for(int j=0;j<link.size();j++)
				{
					//class Elements extends ArrayList
					//System.out.println(link.get(j).attr("href")); 출력확인용
					//상세보기 클릭 루프
					try { //없는 요소 건너뛰기 위해서 try~catch (=>애니메이션 출연없음)
						String url="https://movie.daum.net"+link.get(j).attr("href"); //"https://movie.daum.net"부분 앞에 붙여줘야 완전한 주소가 됨
						Document doc2=Jsoup.connect(url).get();
						
						//<span>데이터</span> => 태그사이 => text
						//<span"데이터"></span> => 태그 안 => attr
						Element poster=doc2.selectFirst("span.thumb_img img"); //포스트 소스 가져오기
						System.out.println("포스터:"+poster.attr("src"));
						Element title=doc2.selectFirst("span.txt_name"); //제목 소스 가져오기
						System.out.println("제목:"+title.text());
						Element score=doc2.selectFirst("div.info_origin a"); //평점 소스 가져오기
						System.out.println("평점:"+score.text());
						Element director=doc2.select("dd.type_ellipsis a.link_person").get(0); //감독 소스 가져오기
						System.out.println("감독:"+director.text());
						Element actor=doc2.select("dd.type_ellipsis a.link_person").get(1); //출연 소스 가져오기 //소스 이름이 같아서 인덱스 번호 줌 대신 selectfirst 아니고 select로
						System.out.println("출연:"+actor.text());
						Element genre=doc2.select("dl.list_movie dd").get(0); //장르 소스 가져오기
						System.out.println("장르:"+genre.text());
						Element regdate=doc2.select("dl.list_movie dd").get(2); //개봉일 소스 가져오기
						System.out.println("개봉일:"+regdate.text());
						Element grade=doc2.select("dl.list_movie dd").get(3); //등급 소스 가져오기
						System.out.println("등급:"+grade.text());
						Element showUser=doc2.selectFirst("dd#totalAudience em.emph_g"); //누적관객 소스 가져오기
						System.out.println("누적관객:"+showUser.text());
						Element story=doc2.selectFirst("div.desc_movie p");
						System.out.println("줄거리:"+story.text());
						
						String msg=mno+"|"+cno+"|"+title.text()+"|"+poster.attr("src")+"|"+score.text()+"|"+director.text()+"|"
								+actor.text()+"|"+genre.text()+"|"+grade.text()+"|"+showUser.text()+"|"+story.text()+"\r\n";
						
						//파일에 저장
						FileWriter fw=new FileWriter("c:\\javaDev\\daum_movie.txt",true);
						fw.write(msg);
						fw.close();
						
						mno++;
						
						
					}catch(Exception ex) {} 
				}
			}
		}catch(Exception ex) 
		{
			System.out.println(ex.getMessage()); //에러 메세지 출력 
		}
		//finally는 내 서버가 아니기 때문에 닫기 불가능..생략
	}
	public void daumNewsData()
	{
		try
		{
			for(int i=1;i<=11;i++) //1~11페이지 포문 돌리기
			{
				Document doc=Jsoup.connect("https://movie.daum.net/magazine/new?tab=nws&regdate=20200727&page="+i).get(); //다음영화=>뉴스
				Elements title=doc.select("strong.tit_line a.link_txt");
				Elements poster=doc.select("a.thumb_line span.thumb_img");
				Elements content=doc.select("a.desc_line");
				Elements author=doc.select("span.state_line");
				Elements link=doc.select("strong.tit_line a.link_txt");
				for(int j=0;j<title.size();j++)
				{
					System.out.println(title.get(j).text());
					System.out.println(poster.get(j).attr("style"));
					System.out.println(content.get(j).text());
					System.out.println(author.get(j).text());
					System.out.println(link.get(j).attr("href"));
					FileWriter fw=new FileWriter("c:\\javaDev\\daum_news.txt",true);
					String img=poster.get(j).attr("style");
					
					img=img.substring(img.indexOf("(")+1,img.lastIndexOf(")"));
					String data=title.get(j).text()+"|"
								+content.get(j).text().replace("|", " ")+"|"
								+author.get(j).text()+"|"
								+link.get(j).attr("href")+"|"
								+"https:"+img+"\r\n";
					fw.write(data);
					fw.close();
					
				}
			}
			
		}catch(Exception ex){}
	}
	public static void main(String[] args) {
		//객체 생성
		MovieManager m=new MovieManager();
		m.daumNewsData();
		//m.movieAllData();
		
	}
}


