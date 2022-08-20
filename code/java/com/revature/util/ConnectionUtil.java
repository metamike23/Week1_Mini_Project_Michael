package com.revature.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionUtil {
	
	final String db_url = System.getenv("db_url") + "assetLounge/"; 
	final String db_username = System.getenv("db_username"); 
	final String db_password = System.getenv("db_password"); 
	
	

	// Connect to PostgraSQL database
	// @return a Connection object
		public Connection getConnection() {
			Connection conn = null;
			
			try {
				conn = DriverManager.getConnection(db_url, db_username, db_password);
				System.out.println("Connection Successful");
			}
			
			catch(SQLException e) {
				System.out.println(e.getMessage());
			}
			
			return conn;
			
		}
	
	
	
	

}
