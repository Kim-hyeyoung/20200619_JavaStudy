package com.sist.db;
import java.sql.*;
import java.util.*;
public class EmpMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			//오라클 연결 드라이버 설치
			Class.forName("oracle.jdbc.driver.OracleDriver");
			//오라클 연결
			//오라클 주소
			String url="jdbc:oracle:thin:@localhost:1521:XE"; //외부주소 접근시 localhost부분에 ip주소 입력하고 1521에 포트번호 적으면 됨
			Connection conn=DriverManager.getConnection(url,"hr","happy");
			//오라클에 명령문 전송
			String sql="SELECT empno,ename,job,sal FROM emp WHERE empno=7788"; //공백 주의!!!
			PreparedStatement ps=conn.prepareStatement(sql);//오라클에 명령 전송 완료
			//실행된 데이터 읽어오기
			ResultSet rs=ps.executeQuery();
			//출력
			while(rs.next())
			{
				System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getInt(4));
			}
		}catch(Exception ex) 
		{
			System.out.println(ex.getMessage());
		}

	}

}
