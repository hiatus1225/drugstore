package com.toyproject.server;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class TestNotice {

	public static void main(String[] args) {
		
		Connection con;
		PreparedStatement prepar;
		ResultSet re;
		
		MemberDAO dao = new MemberDAO();
		try {
			con = dao.connection();
			prepar = dao.prepareStatement("select * from member");
			re = dao.executeQuery();
			System.out.println(re);
				while(re.next()) {
						System.out.println("ID:"+re.getString("id")+"  pass:" + re.getString("pass"));
				}
			} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		dao.disConnection();
		
		
	}
}
