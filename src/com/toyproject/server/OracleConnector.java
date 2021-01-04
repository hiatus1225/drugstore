package com.toyproject.server;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * 
 * @author kosmo02
 *
 */
public class OracleConnector {
	private static final String DRIVER_NAME = "oracle.jdbc.driver.OracleDriver";
	private static final String CONNECTION_URL = "jdbc:oracle:thin:@127.0.0.1:1521:XE";
	private static final String DB_USER_NAME = "kosmo";
	private static final String DB_PASSWORD = "kosmo";
	private static Connection connection = null;
	private static ResultSet resultSet = null;
	private static PreparedStatement preparedStatement = null;
	
	private OracleConnector() {
		
	}
	/**
	 * DB�뿰寃�
	 * @return
	 */
	public static Connection connection() {
		if(connection!=null) {
			return connection;
		}
		
		try {
			Class.forName(DRIVER_NAME);
			connection = DriverManager.getConnection(CONNECTION_URL, DB_USER_NAME, DB_PASSWORD);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return connection;
	}
	
	/**
	 * 
	 * @param query
	 * @return
	 */
	public static PreparedStatement prepareStatement(String query) {
		try {
			preparedStatement = connection.prepareStatement(query);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return preparedStatement;
	}
	
	/**
	 * 
	 * @param preparedStatement
	 * @return
	 */
	public static ResultSet executeQuery() {
		try {
			resultSet = preparedStatement.executeQuery();
			resultSet.next();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return resultSet;
	}
	
	/**
	 * 
	 */
	public static void destroy() {
		closeResultSet();
		closePreparedStatement();
	}
	
	/**
	 * 
	 */
	public static void closeResultSet() {
		if (resultSet!=null) {
			try {
				resultSet.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
	
	public static void closePreparedStatement() {
		if (preparedStatement!=null) {
			try {
				preparedStatement.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

	
	public static void disconnection() {
		closeResultSet();
		closePreparedStatement();
		if (connection!=null) {
			try {
				connection.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
	
}
