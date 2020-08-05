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
			String[] site= {"https://movie.daum.net/premovie/released?reservationOnly=N&sort=reservation&page=",  //������� ������������ �ּ� // for�� ������ ���ؼ� ������ ������ ��ȣ ����
							"https://movie.daum.net/premovie/scheduled?reservationOnly=N&sort=reservation&page=",  //���������� ������������ �ּ�// for�� ������ ���ؼ� ������ ������ ��ȣ ����
							"https://movie.daum.net/boxoffice/weekly",//�ڽ����ǽ� �ְ�
							"https://movie.daum.net/boxoffice/monthly",//�ڽ����ǽ� ����
							"https://movie.daum.net/boxoffice/yearly"};//�ڽ����ǽ� ����
			//int mno=1;
			//int cno=1;//������� �ܱ�
			//int mno=64;//������� ������ ��ȣ 44�̱� ����
			//int cno=2; //���������� �ܱ�
			//int mno=78;
			//int cno=3;//�ְ�
			//int mno=88;
			//int cno=4;//����
			int mno=107;
			int cno=5;//����
			
			//for(int i=1;i<=3;i++) //����� 3�����������ϱ�
			//for(int i=4;i<=6;i++) //�������� 4~6������
			{
				//����Ʈ �����ؼ� �����͸� �ѹ��� �о���δ� => �޸𸮿� ���� => Document
				Document doc=Jsoup.connect("https://movie.daum.net/boxoffice/yearly").get(); //�ּ�url�� �������/���������� � ���� ����
				//<a href="/moviedb/main?movieId=135083" class="name_movie"//����� ������ ������ �ҽ�����
				Elements link=doc.select("a.name_movie");//�󼼺��� ���� Ŭ���ϴ� ���
				for(int j=0;j<link.size();j++)
				{
					//class Elements extends ArrayList
					//System.out.println(link.get(j).attr("href")); ���Ȯ�ο�
					//�󼼺��� Ŭ�� ����
					try { //���� ��� �ǳʶٱ� ���ؼ� try~catch (=>�ִϸ��̼� �⿬����)
						String url="https://movie.daum.net"+link.get(j).attr("href"); //"https://movie.daum.net"�κ� �տ� �ٿ���� ������ �ּҰ� ��
						Document doc2=Jsoup.connect(url).get();
						
						//<span>������</span> => �±׻��� => text
						//<span"������"></span> => �±� �� => attr
						Element poster=doc2.selectFirst("span.thumb_img img"); //����Ʈ �ҽ� ��������
						System.out.println("������:"+poster.attr("src"));
						Element title=doc2.selectFirst("span.txt_name"); //���� �ҽ� ��������
						System.out.println("����:"+title.text());
						Element score=doc2.selectFirst("div.info_origin a"); //���� �ҽ� ��������
						System.out.println("����:"+score.text());
						Element director=doc2.select("dd.type_ellipsis a.link_person").get(0); //���� �ҽ� ��������
						System.out.println("����:"+director.text());
						Element actor=doc2.select("dd.type_ellipsis a.link_person").get(1); //�⿬ �ҽ� �������� //�ҽ� �̸��� ���Ƽ� �ε��� ��ȣ �� ��� selectfirst �ƴϰ� select��
						System.out.println("�⿬:"+actor.text());
						Element genre=doc2.select("dl.list_movie dd").get(0); //�帣 �ҽ� ��������
						System.out.println("�帣:"+genre.text());
						Element regdate=doc2.select("dl.list_movie dd").get(2); //������ �ҽ� ��������
						System.out.println("������:"+regdate.text());
						Element grade=doc2.select("dl.list_movie dd").get(3); //��� �ҽ� ��������
						System.out.println("���:"+grade.text());
						Element showUser=doc2.selectFirst("dd#totalAudience em.emph_g"); //�������� �ҽ� ��������
						System.out.println("��������:"+showUser.text());
						Element story=doc2.selectFirst("div.desc_movie p");
						System.out.println("�ٰŸ�:"+story.text());
						
						String msg=mno+"|"+cno+"|"+title.text()+"|"+poster.attr("src")+"|"+score.text()+"|"+director.text()+"|"
								+actor.text()+"|"+genre.text()+"|"+grade.text()+"|"+showUser.text()+"|"+story.text()+"\r\n";
						
						//���Ͽ� ����
						FileWriter fw=new FileWriter("c:\\javaDev\\daum_movie.txt",true);
						fw.write(msg);
						fw.close();
						
						mno++;
						
						
					}catch(Exception ex) {} 
				}
			}
		}catch(Exception ex) 
		{
			System.out.println(ex.getMessage()); //���� �޼��� ��� 
		}
		//finally�� �� ������ �ƴϱ� ������ �ݱ� �Ұ���..����
	}
	public void daumNewsData()
	{
		try
		{
			for(int i=1;i<=11;i++) //1~11������ ���� ������
			{
				Document doc=Jsoup.connect("https://movie.daum.net/magazine/new?tab=nws&regdate=20200727&page="+i).get(); //������ȭ=>����
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
		//��ü ����
		MovieManager m=new MovieManager();
		m.daumNewsData();
		//m.movieAllData();
		
	}
}


