package com.sist.dao;
import java.sql.*;
import java.util.*;
public class ZipcodeDAO {
	//����
	private Connection conn;
	//���� ����
	private PreparedStatement ps;
	//����Ŭ �ּ� ����
	private final String url="jdbc:oracle:thin:@localhost:1521:XE";
	
	//����̹� ���
	public ZipcodeDAO()
	{
		try
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
		}catch(Exception ex)
		{
			System.out.println(ex.getMessage());
		}
	}
	//����
	public void getConnection()
	{
		try
		{
			conn=DriverManager.getConnection(url,"hr","happy");
		}catch(Exception ex) {}
	}
	//�ݱ�
	public void disConnection() 
	{
		try
		{
			if(ps!=null)
				ps.close();
			if(conn!=null)
				conn.close();
			//exit
		}catch(Exception ex) {}
	}
	//�����ȣ ã��
	public ArrayList<ZipcodeVO> postfind(String dong)
	{
		ArrayList<ZipcodeVO> list=new ArrayList<ZipcodeVO>();
		try
		{
			//����
			getConnection();
			//sql���� ����
			String sql="SELECT * FROM zipcode WHERE dong LIKE '%'||?||'%'";
			ps=conn.prepareStatement(sql);
			ps.setString(1, dong);
			ResultSet rs=ps.executeQuery();//����
			while(rs.next())
			{
				ZipcodeVO vo=new ZipcodeVO();
				vo.setZipcode(rs.getString(1));
				vo.setSido(rs.getString(2));
				vo.setGugun(rs.getString(3));
				vo.setDong(rs.getString(4));
				vo.setBunji(rs.getString(5));
				
				list.add(vo);
			}
		}catch(Exception ex) 
		{
			System.out.println(ex.getMessage());
		}
		finally
		{
			disConnection();
		}
		return list;
	}
	
	
	
	
	
	
	

}
