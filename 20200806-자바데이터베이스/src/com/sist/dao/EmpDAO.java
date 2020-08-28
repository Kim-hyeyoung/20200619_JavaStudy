package com.sist.dao;
//�����ͺ��̽� ����
import java.util.*;
import java.sql.*;
public class EmpDAO {
	//����Ŭ ���� => socket
	private Connection conn;
	//�۽�,����
	private PreparedStatement ps; //BufferedReader,OutputStream
	private final String URL="jdbc:oracle:thin:@localhost:1521:XE"; //localhost=127.0.0
	//����̹� ���(�ѹ��� ����)=>������
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
	//�̱��� ����=>�޸� ������ �ϳ��� ���=>����
	public static EmpDAO newInstance()
	{
		if(dao==null)
			dao=new EmpDAO();
		
		return dao;
	}
	//����
	public void getConnection()
	{
		try 
		{
			Connection conn=DriverManager.getConnection(URL,"hr","happy");
		}catch(Exception ex) {}
		
	}
	//����
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
	//=====================================��� �����ͺ��̽� ���� ����
		//���

}
