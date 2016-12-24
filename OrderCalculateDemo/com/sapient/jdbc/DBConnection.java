package com.sapient.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {

	private static DBConnection dbConnection;

	private DBConnection() {

	}

	public DBConnection getInstance() {

		if (dbConnection == null) {

			dbConnection = new DBConnection();
		}

		return dbConnection;
	}
	
	
	private static Connection getConnection() throws SQLException, ClassNotFoundException{
		
		Connection connection = null;
		
		Class.forName("com.mysql.jdbc.Driver");
		
		connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/ecomm", "root", "admin123");
		
		return connection;
	}
	
	
	
	

}
