package com.sist.io;
import java.io.*;
import java.util.*; //arraylist 사용하기 위함
class Movie implements Serializable //객체 통째로 저장
{
	private int mno;
	private String title;
	private String actor;
	public int getMno() {
		return mno;
	}
	public void setMno(int mno) {
		this.mno = mno;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getActor() {
		return actor;
	}
	public void setActor(String actor) {
		this.actor = actor;
	}
	
}
public class MainClass3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			ArrayList<Movie> list=new ArrayList<Movie>();
			Movie m=new Movie();
			m.setMno(1);
			m.setTitle("홍길동전");
			m.setActor("홍길동");
			
			list.add(m);
			
			m=new Movie(); //new 해야 새로운 공간에 저장 => 그렇지 않으면 같은 주소에 저장됨
			m.setMno(2);
			m.setTitle("심청전");
			m.setActor("심청");
			
			list.add(m);
			
			m=new Movie(); //new 해야 새로운 공간에 저장 => 그렇지 않으면 같은 주소에 저장됨
			m.setMno(3);
			m.setTitle("춘향전");
			m.setActor("춘향");
			
			list.add(m);
			
			ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream("c:\\javaDev\\movie_test.txt"));
			oos.writeObject(list);
			System.out.println("저장완료");
			
			/*
			 * for(int i=0;i<list.size();i++) { Movie mm=list.get(i);
			 * System.out.println(mm.getActor()); }
			 */
			
		}catch(Exception ex)
		{
			System.out.println(ex.getMessage());
		}finally
		{
			
		}
		
		
		
	}

}
