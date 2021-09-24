package com.kh.test.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class TestDao {
	public List<TEST> selectList(){
		List<TEST> list = new ArrayList<>();
		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@192.168.10.3:1521:xe";
		String userid = "kh";
		String passwd = "kh";
		
		Connection con = null; 
		Statement stmt = null; 
		ResultSet rs = null;

		try {
			Class.forName(driver);
			con = DriverManager.getConnection(url, userid, passwd);
			String sql = "SELECT * FROM TEST"; 
			stmt = con.createStatement(); 
			rs = stmt.executeQuery(sql);

			while (rs.next()) 
			{ 
				TEST t = new TEST();
				
				t.setSEQ(rs.getInt("SEQ"));
				t.setWRITER(rs.getString("WRITER"));
				t.setTITLE(rs.getString("TITLE"));
				t.setCONTENT(rs.getString("CONTENT"));
				t.setREGDATE(rs.getDate("REGDATE"));
				list.add(t);
			}
			

		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			
				try {
					if(rs !=null)
						rs.close();
					if(stmt !=null)
						stmt.close();
					if(con !=null)
						con.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		}
		return list;
		
	}

}
