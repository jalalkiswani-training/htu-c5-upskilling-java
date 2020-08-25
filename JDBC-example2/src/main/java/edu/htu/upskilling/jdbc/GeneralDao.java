package edu.htu.upskilling.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class GeneralDao {
	private static final String DB_URL = "jdbc:mysql://localhost:3306/upskilling_java";
	private static final String DB_PASSWORD = "123456";
	private static final String DB_USERNAME = "root";
	
	/////////////////////////////////////////////////////////
	protected Connection getConnection() throws SQLException {
		return DriverManager.getConnection(DB_URL, DB_USERNAME, DB_PASSWORD);
	}
}
