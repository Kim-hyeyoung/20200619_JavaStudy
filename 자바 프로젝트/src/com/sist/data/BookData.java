package com.sist.data;
import java.io.FileWriter;
import java.util.*;
import java.util.ArrayList;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;



import sun.applet.Main;

//데이터 수집용
public class BookData {
	public void BookAllData()
	{
		try {
			ArrayList<BookVO> list=new ArrayList<BookVO>();
			String[] site= {"https://www.aladin.co.kr/shop/common/wbest.aspx?BranchType=1", 
							//베스트셀러 cno1
							"https://www.aladin.co.kr/shop/common/wbest.aspx?BranchType=1&BestType=TodayHot",
							//신간베스트 cno2
							"https://www.aladin.co.kr/shop/common/wbest.aspx?BranchType=1&BestType=SteadySeller"};
							//스테디셀러 cno3
							
			int mno=1;
			int cno=1;//베스트셀러
			//int mno=101;
			//int cno=2;//신간베스트
			//int mno=193;
			//int cno=3;//스테디셀러
			for(int i=1;i<=2;i++)//100위까지만
			{
				Document doc=Jsoup.connect("https://www.aladin.co.kr/shop/common/wbest.aspx?BranchType=1").get();
				Elements link=doc.select("a.bo3");//상세보기 위해 클릭하는 요소(패키지 이름)
				for(int j=0;j<link.size();j++)
				{
					//System.out.println(link.get(j).attr("href")); 출력확인용
					
					try {
						String url=link.get(j).attr("href");
						Document doc2=Jsoup.connect(url).get();
						
						Element title=doc2.selectFirst("a.Ere_bo_title");
						System.out.println("서명:"+title.text());
						
						Element author=doc2.selectFirst("a.Ere_sub2_title");
						System.out.println("지은이:"+author.text());
						
						Element publish=doc2.select("a.Ere_sub2_title").get(1);
						System.out.println("출판사:"+publish.text());
						
						Element cost=doc2.selectFirst("span.Ere_fs24");
						System.out.println("가격:"+cost.text());
						
						Element info=doc2.select("div.conts_info_list1").get(0);
						System.out.println("기본정보:"+info.text());
						
						Element poster=doc2.selectFirst("img#CoverMainImage");
						System.out.println("표지:"+poster.attr("src"));
						
						
						String msg=mno+"|"+cno+"|"+title.text()+"|"+"|"+author.text()+"|"+publish.text()+"|"
								+cost.text()+"|"+info.text()+"|"+poster.attr("src")+"\r\n";
						
						//파일에 저장
						FileWriter fw=new FileWriter("c:\\javaDev\\book.txt",true);
						fw.write(msg);
						fw.close();
						
						mno++;
						
						
					}catch(Exception ex) {System.out.println(ex.getMessage());}
					
				}
			}
		}catch(Exception ex) 
		{
			System.out.println(ex.getMessage());
		}
	}
	public static void main(String[] args) {
		BookData b=new BookData();
		b.BookAllData();
		
	}
}
	
			
			
			
			
			
		

		
		
		
		
		
		
		
		
		
	
	
	
	

