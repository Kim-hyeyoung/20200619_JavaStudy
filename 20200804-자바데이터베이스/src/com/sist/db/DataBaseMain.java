package com.sist.db;
import java.sql.*;
import java.util.*;
public class DataBaseMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");//����̹� ��ġ(Ŭ������ ���۵Ǿ� ����)
			String url="jdbc:oracle:thin:@localhost:1521:XE"; //����Ŭ �ּ� ���� / XE: ������ �������(�ڵ�����)
			//����
			Connection conn=DriverManager.getConnection(url,"hr","happy");//conn hr/happy (sql plus)
			//SQL ���� ����
			Scanner scan=new Scanner(System.in);
			System.out.println("�˻��� �Է�:");
			String data=scan.next();
			String sql="SELECT ename FROM emp WHERE ename LIKE '%'||?||'%'";
			// || : ���ڿ� ����, �������� (���� OR ����) && : ������Է°� => AND
			PreparedStatement ps=conn.prepareStatement(sql);
			ps.setString(1, data);
			//������ �б�
			ResultSet rs=ps.executeQuery();//ENTER �Է�
			while(rs.next())//Ŀ���� �������� ù��° ��ġ�� �ű��=>������ �������� ����
			{
				System.out.println(rs.getString(1));
			}
		}catch(Exception ex) 
		{
			System.out.println(ex.getMessage());
		}

	}

}
