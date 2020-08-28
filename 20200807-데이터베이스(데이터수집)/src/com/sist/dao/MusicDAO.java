package com.sist.dao;
import java.util.*;
import java.sql.*;
public class MusicDAO {
	//연결
	private Connection conn;
	//오라클 전송
	private PreparedStatement ps;
	private final String URL="jdbc:oracle:thin:@localhost:1521:XE";
	/*
		mno NUMBER(3), 
		title VARCHAR2(300), 
		singer VARCHAR2(100), 
		album VARCHAR2(200), 
		poster VARCHAR2(1000),
		state CHAR(6),
		idcrement NUMBER(3),
		key VARCHAR(50)
	 */
	//드라이버 등록(한번만 실행)=>생성자
	public MusicDAO()
	{
		try
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
		}catch(Exception ex) 
		{
			System.out.println(ex.getMessage());
		}
	}

	//연결
	public void getConnection()
	{
		try 
		{
			conn=DriverManager.getConnection(URL,"hr","happy");
		}catch(Exception ex) {}
		
	}
	//해제
	public void disConnection()
	{
		try
		{
			if(ps!=null) 
				ps.close();
			if(conn!=null)
				conn.close();
		}catch(Exception ex) {}
	}
	//데이터 추가(기능)
	public void musicInsert(MusicVO vo)
	{
		try 
		{
			getConnection();
			//statement
			/*String sql="INSERT INTO genie_music VALUES("+vo.getMno()+",'"+vo.getTitle()+"','"+vo.getSinger()+"','"+vo.getAlbum()
														+"','"+vo.getPoster()+"','"+vo.getState()+"',"+vo.getIdcrement()+",'"+vo.getKey()+"')";*/
			//preparedstatement => 이게 더 편하고 쉽다!!!
			String sql="INSERT INTO genie_music VALUES(?,?,?,?,?,?,?,?)";
			ps=conn.prepareStatement(sql);
			ps.setInt(1, vo.getMno());
			ps.setString(2, vo.getTitle());
			ps.setString(3, vo.getSinger());
			ps.setString(4, vo.getAlbum());
			ps.setString(5, vo.getPoster());
			ps.setString(6, vo.getState());
			ps.setInt(7, vo.getIdcrement());
			ps.setString(8, vo.getKey());
			
			//실행
			ps.executeUpdate();//데이터 첨부
		}catch(Exception ex) 
		{
			System.out.println(ex.getMessage());
		}
		finally
		{
			disConnection();
		}
		
	}
	

}



