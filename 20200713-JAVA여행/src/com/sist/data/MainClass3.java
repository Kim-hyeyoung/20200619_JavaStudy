package com.sist.data;

import java.io.FileWriter;
import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

import jdk.jfr.events.FileWriteEvent;

public class MainClass3 {
	public static TourListVO[] categoryFoodData()
	{
		TourListVO[] food=new TourListVO[10];
		try
		{
			Document doc=Jsoup.connect("https://www.mangoplate.com/top_lists/1965_hotel_bingsu").get();
			Elements title=doc.select("span.title h3"); //가게 이름 10개씩 묶어서 title에 저장
			Elements score=doc.select("strong.point span");
			Elements address=doc.select("p.etc");
			Elements poster=doc.select("img.center-croping");
			Elements review=doc.select("p.short_review");
			for(int i=0;i<10;i++)
			{
				System.out.println(title.get(i).text());
				System.out.println(score.get(i).text());
				System.out.println(address.get(i).text());
				System.out.println(poster.get(i).attr("data-original"));
				System.out.println(review.get(i).text());
				System.out.println("====================================================");
				food[i]=new TourListVO();
				food[i].setTitle(title.get(i).text());
				food[i].setScore(Double.parseDouble(score.get(i).text())); 
				//문자열을 더블형으로 변환 => Double.parseDouble()
				//문자열을 정수형으로 변환 => Integer.parseInt()
				//문자열을 논리형으로 변환 => Boolean.parseBoolean()    => Wrapper Class
				/*
				 *  <p>aaaaa</p>    => text()
				 *  <p>data="aaaaa"</p>    => data-original
				 */
				food[i].setAddress(address.get(i).text());
				food[i].setPoster(poster.get(i).attr("data-original"));
				food[i].setReview(review.get(i).text());
			}
		}catch(Exception ex)
		{
			ex.printStackTrace(); //에러위치 확인
		}
		return food;
	}
	public static CategoryVO[] categoryListData()
	{
		CategoryVO[] cate=new CategoryVO[10];
		try
		{
			Document doc=Jsoup.connect("https://www.hanatour.com/com/its/CHPC0ITS0002M200?keyword=%EB%B0%A9%EC%BD%95&forceSearch=N&keywordCateg=DS").get();
			//System.out.println(doc);
			Elements title=doc.select("div.info_inner_wrap span.title");
			Elements subject=doc.select("div.info_inner_wrap p.desc");
			Elements poster=doc.select("ul.list-toplist-slider img.center-croping");
			
			
			for(int i=0;i<10;i++)
			{
				System.out.println("===============================================");
				System.out.println(title.get(i).text());
				System.out.println(subject.get(i).text());
				System.out.println(poster.get(i).attr("data-lazy"));
				cate[i]=new CategoryVO();
				cate[i].setCno(i+1);
				cate[i].setTitle(title.get(i).text());
				cate[i].setSubject(subject.get(i).text());
				cate[i].setPoster(poster.get(i).attr("data-lazy"));
				
			}
		}catch(Exception ex)
		{
			ex.printStackTrace(); //오류인 부분 확인
		}
		return cate;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		categoryFoodData();
		
	}

}
