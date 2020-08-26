package com.yedam.board;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.yedam.database.Employee;

public class DBlogin {

	public static boolean login(String id, String pwd) {
		Connection conn = DBConnection.getConnection();
		ResultSet rs = null;
		boolean result = false;
		String sql = "select * "+"\n"
				+"from login_user" 
				+" where userid =\'" + id +"\'"
				+" and pwd =\'" + pwd + "\'";
		
		try {
			PreparedStatement pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			result = rs.next();			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}//end try
			
		return result;
		
	}
	
}
