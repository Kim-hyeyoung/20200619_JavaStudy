package com.sist.db;
import java.sql.*;
import java.util.*;
public class DataBaseMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");//드라이버 설치(클래스로 제작되어 있음)
			String url="jdbc:oracle:thin:@localhost:1521:XE"; //오라클 주소 접근 / XE: 데이터 저장장소(자동생성)
			//연결
			Connection conn=DriverManager.getConnection(url,"hr","happy");//conn hr/happy (sql plus)
			//SQL 문장 실행
			Scanner scan=new Scanner(System.in);
			System.out.println("검색어 입력:");
			String data=scan.next();
			String sql="SELECT ename FROM emp WHERE ename LIKE '%'||?||'%'";
			// || : 문자열 결합, 논리연산자 (조건 OR 조건) && : 사용자입력값 => AND
			PreparedStatement ps=conn.prepareStatement(sql);
			ps.setString(1, data);
			//데이터 읽기
			ResultSet rs=ps.executeQuery();//ENTER 입력
			while(rs.next())//커서를 데이터의 첫번째 위치로 옮긴다=>데이터 가져오기 위함
			{
				System.out.println(rs.getString(1));
			}
		}catch(Exception ex) 
		{
			System.out.println(ex.getMessage());
		}

	}

}
