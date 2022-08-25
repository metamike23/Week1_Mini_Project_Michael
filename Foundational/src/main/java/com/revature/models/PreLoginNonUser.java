package com.revature.models;

import java.util.Scanner;

import com.revature.dao.DAO;

public class PreLoginNonUser extends PreLogin {
	
	
	public boolean readyToEnterDB;
	public String role;
	public boolean privilege;
	
	
	
	// The registerNewUser() method will ask the user to provide a first name, last name, username, password, and an email
	// REQUIREMENTS:
	// Must ensure the username is not already registered
	// default employee code
	public void registerNewUser() {
		do {
		
		Scanner scannerThree = new Scanner(System.in);
		System.out.println("Registration page\nFirst name: ");
		 super.preLoginFirstName= scannerThree.nextLine();
		
		if(super.preLoginFirstName.length() > 0) {
			System.out.println("Last name: ");
			super.preLoginLastLast = scannerThree.nextLine();
		}
		
		
		
		if(super.preLoginLastLast.length() > 0) {
			System.out.println("Username: ");
			super.preLoginUsername = scannerThree.nextLine();
		}
		
		
		
		if(super.preLoginUsername.length() > 0) {
			System.out.println("Password: ");
			super.preLoginPassword = scannerThree.nextLine();
		}
		
		
		
		if(super.preLoginPassword.length() > 0) {
			System.out.println("Email: ");
			super.preLoginEmail = scannerThree.nextLine();
		}
		
		
		if(super.preLoginEmail.length() > 0) {
			
			DAO crud = new DAO();
			
			if(super.preLoginUsername.equals(crud.getUsernameCabinet(super.preLoginUsername)) || super.preLoginEmail.equals(crud.getEmailCabinet(super.preLoginEmail))) {
				readyToEnterDB = false;
				System.out.println("Try again: Username or email is already taken");
				
			} 
			
			else {
				readyToEnterDB = true;
			}
			
		}
		
		} while(readyToEnterDB != true);
		
		if(readyToEnterDB) {
			generateUserRole(super.preLoginUsername);
		}	
		}
	
	
	// This method generates a role for the user once they are successfully registered
	// This method 
	
public boolean generateUserRole(String str) {
		
	
	
		
		if(str.startsWith("admin.") || str.endsWith(".admin")) {
			userRole = "Manager";
			this.privilege = true;
		
		}
		
		else {
			userRole = "Employee";
			this.privilege = false;
		
		}
		return this.privilege;
	}
	
	
		
		
		
		
		
		
		
	}
		
		
		
		
		
		
		
		
		
		

	
	
	

