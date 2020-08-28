package com.sist.main;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

import com.sist.dao.MusicDAO;
import com.sist.dao.MusicVO;


public class MusicMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MusicDAO dao=new MusicDAO();
		try
		{
			int k=1;
			for(int i=1;i<=4;i++)
			{
				Document doc=Jsoup.connect("https://www.genie.co.kr/chart/top200?ditc=D&ymd=20200807&hh=09&rtm=Y&pg="+i).get();
				//System.out.println(doc);
				Elements title=doc.select("td.info a.title");
				Elements singer=doc.select("td.info a.artist");
				Elements album=doc.select("td.info a.albumtitle");
				Elements poster=doc.select("a.cover img");
				Elements temp=doc.select("span.rank");//state+idcrement
				
				for(int j=0;j<title.size();j++)
				{
					System.out.println("순위:"+k);
					System.out.println("노래명:"+title.get(j).text());
					System.out.println("가수명:"+singer.get(j).text());
					System.out.println("앨범명:"+album.get(j).text());
					System.out.println("포스터:"+poster.get(j).attr("src"));
					//System.out.println("상태:"+temp.get(j).text());
					String str=temp.get(j).text();
					String idcrement="";
					String state="";
					if(str.equals("유지"))
					{
						idcrement="0";
						state="유지";
					}
					else if(str.equals("new"))
					{
						idcrement="0";
						state="new";
					}
					else
					{
						idcrement=str.replaceAll("[^0-9]", ""); //숫자제외하고 지우기
						state=str.replaceAll("[^가-힣]", "");//한글제외하고 지우기
					}
					System.out.println("상태:"+state);
					System.out.println("등폭:"+idcrement);
					//System.out.println("동영상 키:"+youtubeKeyData(title.get(j).text()));
					System.out.println("=======================================");
					
					MusicVO vo=new MusicVO();
					vo.setMno(k);
					vo.setTitle(title.get(j).text());
					vo.setSinger(singer.get(j).text());
					vo.setAlbum(album.get(j).text());
					vo.setPoster(poster.get(j).attr("src"));
					vo.setState(state);
					vo.setIdcrement(Integer.parseInt(idcrement));
					vo.setKey(youtubeKeyData(title.get(j).text()));
					
					dao.musicInsert(vo);
					
					Thread.sleep(100);
					k++;
				}
				
			}
		}catch(Exception ex){}
		
		//youtubeKeyData("다시 여기 바닷가");

	}
	public static String youtubeKeyData(String title)
	{
		String key="";
		try
		{
			Document doc=Jsoup.connect("https://www.youtube.com/results?search_query="+title).get();
			Pattern p=Pattern.compile("/watch\\?v=[^가-힣]+");//원하는 데이터 찾기 , [^가-힣]+ : +는 한글자 이상 가져오기 위함
			Matcher m=p.matcher(doc.toString());//doc안에서 p와 일치하는 문자를 찾아라
			// /watch?v=ESKfHHtiSjs
			while(m.find())
			{
				//System.out.println(m.group());
				String str=m.group();
				str=str.substring(str.indexOf("=")+1,str.indexOf("\""));
				key=str;
				break;
			}
		}catch(Exception ex) {System.out.println(ex.getMessage());}
		return key;
	}

	
	
	
	
	
	
	
	
}
