package com.revature.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.revature.models.PreLogin;

public class DAO {
	
	private String db_url = System.getenv("db_url") + "assetLounge"; 
	private String db_username = System.getenv("db_username"); 
	private String db_password = System.getenv("db_password");
	private boolean logCheck;
	private String getEmailFromDB;
	private String getUsernameFromDB;
	private String getUserRoleFromDB;
	private String getFirstNameFromDB;
	private String getLastNameFromDB;
	private String getPasswordFromDB;
	
	
	
	// Connect to PostgraSQL database
	// @return a Connection object
	public Connection connect() {
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
	
	// Validate User Login
	// Returns true if the username and password are a match
	public boolean validateLogin(String u, String p) {
		String SQL = "SELECT username, password FROM cabinet WHERE username = ?";
		
		try(Connection conn = connect();
				PreparedStatement pstmt = conn.prepareStatement(SQL)) {
			pstmt.setString(1, u);
			
			ResultSet rs = pstmt.executeQuery();
			
			if(rs.next()) {
				String us = rs.getString("username");
				String pw = rs.getString("password");
				
				if(us.equals(u) && pw.equals(p)) {
					this.logCheck = true;
				}
				
				else {
					this.logCheck = false;
				}
			}
		}
		
		catch(SQLException ex) {
			System.out.println(ex.getMessage());
		}
		
		return logCheck;
	}
	
	
	// Read method to check if email exist in cabinet table
	// Takes a String parameter and returns a String value
	public String getEmailCabinet(String em) {
		
		
		String SQL = "SELECT email FROM cabinet WHERE email=?";
				
				try(Connection conn = connect();
						PreparedStatement pstmt = conn.prepareStatement(SQL)) {
					pstmt.setString(1, em);
					ResultSet rs = pstmt.executeQuery();
					
					if(rs.next()) {
						this.getEmailFromDB = rs.getString("email");
					}
					
				}
				catch(SQLException ex) {
					System.out.println(ex.getMessage());
					
				}
				return this.getEmailFromDB;
				
			}
	
	
public String getUsernameCabinet(String s) {
		
		String SQL = "SELECT username FROM cabinet WHERE username=?";
		
		try(Connection conn = connect();
				PreparedStatement pstmt = conn.prepareStatement(SQL)) {
			pstmt.setString(1, s);
			ResultSet rs = pstmt.executeQuery();
			
			if(rs.next()) {
				this.getUsernameFromDB = rs.getString("username");
				
				
			}
			
		}
		catch(SQLException ex) {
			System.out.println(ex.getMessage());
			
		}
		return getUsernameFromDB;
		
	}

// Code to get String Value of user_role from 1 specific row
public String getUserRoleCabinet(String s) {
	
	String SQL = "SELECT user_role FROM cabinet WHERE username=?";
	
	try(Connection conn = connect();
			PreparedStatement pstmt = conn.prepareStatement(SQL)) {
		pstmt.setString(1, s);
		ResultSet rs = pstmt.executeQuery();
		
		if(rs.next()) {
			this.getUserRoleFromDB = rs.getString("user_role");
			
			
		}
		
	}
	catch(SQLException ex) {
		System.out.println(ex.getMessage());
		
	}
	return getUserRoleFromDB;
	
}

//Code to get String Value of first_name from 1 specific row
public String getFirstNameCabinet(String s) {
	
	String SQL = "SELECT first_name FROM cabinet WHERE username=?";
	
	try(Connection conn = connect();
			PreparedStatement pstmt = conn.prepareStatement(SQL)) {
		pstmt.setString(1, s);
		ResultSet rs = pstmt.executeQuery();
		
		if(rs.next()) {
			this.getFirstNameFromDB = rs.getString("first_name");
			
			
		}
		
	}
	catch(SQLException ex) {
		System.out.println(ex.getMessage());
		
	}
	return getFirstNameFromDB;
	
}


//Code to get String Value of first_name from 1 specific row
public String getLastNameCabinet(String s) {
	
	String SQL = "SELECT last_name FROM cabinet WHERE username=?";
	
	try(Connection conn = connect();
			PreparedStatement pstmt = conn.prepareStatement(SQL)) {
		pstmt.setString(1, s);
		ResultSet rs = pstmt.executeQuery();
		
		if(rs.next()) {
			this.getLastNameFromDB = rs.getString("last_name");
			
			
		}
		
	}
	catch(SQLException ex) {
		System.out.println(ex.getMessage());
		
	}
	return getLastNameFromDB;
	
}

//Code to get String Value of password from 1 specific row
public String getPasswordCabinet(String s) {
	
	String SQL = "SELECT password FROM cabinet WHERE username=?";
	
	try(Connection conn = connect();
			PreparedStatement pstmt = conn.prepareStatement(SQL)) {
		pstmt.setString(1, s);
		ResultSet rs = pstmt.executeQuery();
		
		if(rs.next()) {
			this.getPasswordFromDB = rs.getString("password");
			
			
		}
		
	}
	catch(SQLException ex) {
		System.out.println(ex.getMessage());
		
	}
	return getPasswordFromDB;
	
}




















// Enter a new user into the cabinet table
public long createDAOMember(PreLogin ob) {
	String SQL = "INSERT INTO cabinet(user_id, first_name, last_name, username, password, email, user_role) VALUES(default, ?, ?, ?, ?, ?, ?)";
	
	long id = 0;
	
	try(Connection conn = connect();
			PreparedStatement pstmt = conn.prepareStatement(SQL, Statement.RETURN_GENERATED_KEYS)) {
		
		pstmt.setString(1, ob.getPreLoginFirstName());
		pstmt.setString(2, ob.getPreLoginLastLast());
		pstmt.setString(3, ob.getPreLoginUsername());
		pstmt.setString(4, ob.getPreLoginPassword());
		pstmt.setString(5, ob.getPreLoginEmail());
		pstmt.setString(6, ob.getUserRole());
		
		int affectedrows = pstmt.executeUpdate();
		
		if(affectedrows > 0) {
			try(ResultSet rs = pstmt.getGeneratedKeys()) {
				if(rs.next()) {
					id = rs.getLong(1);
				}
			} catch(SQLException ex) {
				System.out.println(ex.getMessage());
			}
		}
		
	} catch(SQLException ex) {
		System.out.println(ex.getMessage());
	}
	return id;
}
	
	
	
	
	
	
	
	
	
	

}
