package com.sist.dao;
//데이터베이스 연결
import java.util.*;
import java.sql.*;
public class EmpDAO {
	//오라클 연결 => socket
	private Connection conn;
	//송신,수신
	private PreparedStatement ps; //BufferedReader,OutputStream
	private final String URL="jdbc:oracle:thin:@localhost:1521:XE"; //localhost=127.0.0
	//드라이버 등록(한번만 실행)=>생성자
	private static EmpDAO dao;
	public EmpDAO()
	{
		try
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
		}catch(Exception ex) 
		{
			System.out.println(ex.getMessage());
		}
	}
	//싱글턴 패턴=>메모리 공간을 하나만 사용=>재사용
	public static EmpDAO newInstance()
	{
		if(dao==null)
			dao=new EmpDAO();
		
		return dao;
	}
	//연결
	public void getConnection()
	{
		try 
		{
			Connection conn=DriverManager.getConnection(URL,"hr","happy");
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
	public Connection getConn() {
		return conn;
	}
	public PreparedStatement getPs() {
		return ps;
	}
	//=====================================모든 데이터베이스 공통 사항
		//기능

}
