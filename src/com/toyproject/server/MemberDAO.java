package com.toyproject.server;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class MemberDAO {
	
	private static final String DRIVER_NAME = "oracle.jdbc.driver.OracleDriver";
	private static final String CONNECTION_URL = "jdbc:oracle:thin:@127.0.0.1:1521:XE";
	private static final String DB_USER_NAME = "kosmo";
	private static final String DB_PASSWORD = "kosmo";
	private static Connection connection = null;
	private static ResultSet resultSet = null;
	private static PreparedStatement preparedStatement = null;
	
	MemberDAO() {
		
	}
	
	public static Connection connection() {
		if(connection!=null) {
			return connection;
		}
		
		try {
			Class.forName(DRIVER_NAME);
			connection = DriverManager.getConnection(CONNECTION_URL,DB_USER_NAME,DB_PASSWORD);
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		}catch(SQLException e) {
			e.printStackTrace();
		}
		System.out.println("DBMS立加 己傍");
		return connection;
	}
	
	public static PreparedStatement prepareStatement(String query) {
		try {
			preparedStatement = connection.prepareStatement(query);
		} catch(SQLException e) {
			e.printStackTrace();
		}
		System.out.println("prepared 己傍");
		return preparedStatement;
		
	}
	
	public static ResultSet executeQuery() {
		try {
			resultSet = preparedStatement.executeQuery();
			resultSet.next();
		}catch(SQLException e) {
			e.printStackTrace();
		}
		System.out.println("resultSet己傍");
		return resultSet;
	}
	
	public static void destroy() {
		closeResultSet();
		closePreparedStatement();
	}
	
	public static void closeResultSet() {
		if(resultSet!=null) {
			try {
				resultSet.close();
			}catch(SQLException e) {
				e.printStackTrace();
			}
		}
	}
	
	public static void closePreparedStatement() {
		if(preparedStatement!=null) {
			try {
				preparedStatement.close();
			}catch(SQLException e) {
				e.printStackTrace();
			}
		}
	}
	
	public static void disConnection() {
		destroy();
		if(connection!=null) {
			try {
				connection.close();
			}catch(SQLException e) {
				e.printStackTrace();
			}
		}
	}
	
}
