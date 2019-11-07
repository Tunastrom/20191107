/**
 * 
 */
package co.Mingwang.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * @author Yoo Cheolwon
 * write date: 2019-11-07
 * 상위 Dao 객체 
 */
public class DAO {
	Connection conn;
	PreparedStatement psmt;
	ResultSet rs;
	
	private String driver="oracle.jdbc.driver.OracleDriver";
	private String url="jdbc:oracle:thin:@localhost:1521:xe";
	private String user="Mingwang";
	private String password="1234";
	
	public DAO(){
		try {
			Class.forName(driver);
			conn = DriverManager.getConnection(url, user, password);
		}catch(ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void close() {
		try {
			if(rs != null) rs.close();
			if(psmt != null) psmt.close();
			if(conn != null) conn.close();
		}catch(SQLException e) {
			
		}
	}
}
