package com.sist.data;
import java.io.FileWriter;
import java.util.*;
import java.util.ArrayList;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;



import sun.applet.Main;


public class BookManager {
	public void BookAllData()
	{
		try {
			ArrayList<BookVO> list=new ArrayList<BookVO>();
			String[] site= {"https://www.aladin.co.kr/shop/common/wbest.aspx?BranchType=1", 
							//����Ʈ���� cno1
							"https://www.aladin.co.kr/shop/common/wbest.aspx?BranchType=1&BestType=TodayHot",
							//�Ű�����Ʈ cno2
							"https://www.aladin.co.kr/shop/common/wbest.aspx?BranchType=1&BestType=SteadySeller"};
							//���׵𼿷� cno3
							
			//int mno=1;
			//int cno=1;//����Ʈ����
			//int mno=100;
			//int cno=2;//�Ű�����Ʈ
			int mno=163;
			int cno=3;//���׵𼿷�
			for(int i=1;i<=3;i++)//100��������
			{
				Document doc=Jsoup.connect("https://www.aladin.co.kr/shop/common/wbest.aspx?BranchType=1&BestType=SteadySeller").get();
				Elements link=doc.select("a.bo3");//�󼼺��� ���� Ŭ���ϴ� ���(��Ű�� �̸�)
				for(int j=0;j<link.size();j++)
				{
					//System.out.println(link.get(j).attr("href")); ���Ȯ�ο�
					
					try {
						String url=link.get(j).attr("href");
						Document doc2=Jsoup.connect(url).get();
						
						Element title=doc2.selectFirst("a.Ere_bo_title");
						System.out.println("����:"+title.text());
						
						Element subtitle=doc2.selectFirst("span.Ere_sub1_title");
						System.out.println("�μ���:"+subtitle.text());
						
						Element author=doc2.selectFirst("a.Ere_sub2_title");
						System.out.println("������:"+author.text());
						
						Element publish=doc2.select("a.Ere_sub2_title").get(1);
						System.out.println("���ǻ�:"+publish.text());
						
						Element cost=doc2.selectFirst("span.Ere_fs24");
						System.out.println("����:"+cost.text());
						
						Element poster=doc2.selectFirst("img#CoverMainImage");
						System.out.println("ǥ��:"+poster.attr("src"));
						
						String msg=mno+"|"+cno+"|"+title.text()+"|"+subtitle.text()+"|"+author.text()+"|"+publish.text()+"|"
								+cost.text()+"|"+poster.attr("src")+"\r\n";
						
						//���Ͽ� ����
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
		BookManager b=new BookManager();
		b.BookAllData();
		
	}
}
	
			
			
			
			
			
		

		
		
		
		
		
		
		
		
		
	
	
	
	

