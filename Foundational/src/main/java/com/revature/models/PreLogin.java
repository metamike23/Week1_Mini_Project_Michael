package com.revature.models;

import java.util.Scanner;

import com.revature.dao.DAO;

public class PreLogin {
	
	public String preLoginFirstName;
	public String preLoginLastLast;
	public String preLoginUsername;
	public String preLoginPassword;
	public String preLoginEmail;
	public String userRoleCheck;
	public boolean userGreetingResponseBoolean;
	public String userGreetingResponseString;
	public boolean userLoginBoolean;
	public String userRole;
	
	
	
	
	
	
	
	
	public void doesUserAccountExist() {
		// Ask the user to type YES if they already have an account and to type NO if they do not already have an account
		// The code asking for the user input is inserted inside a do while loop 
		// I am using a do while loop because I want the block of code which asks for a user input to be repeated until I get a specific response from the user
		// The do while loop will run at least once and continue to loop until the user types in YES or NO
		// I convert the string from the user input to lower-case before I apply logic to it, meaning the user input for YES and NO is not case sensitive
		
		do { 
			
			System.out.println("----Type YES if you have an account\n----Type NO if you dont have an account\n ");
			Scanner scanner = new Scanner(System.in);
			String userInput = scanner.nextLine();
			
			if (userInput.toLowerCase().equals("yes") || userInput.toLowerCase().equals("no")) {
				//System.out.println("Break!");
				this.userGreetingResponseBoolean = true;
				this.userGreetingResponseString = userInput;
				break;
			}
				
			else  {
				System.out.println("----" + userInput + " is invalid. Try again");
				this.userGreetingResponseBoolean = false;
			}
			} while (1 != 0);
	}
	
	
	public void userLogin() {
		// The userLogin() method will ask the User to type in their accounts username and password
		//
		
		
		for(int i = 3; userLoginBoolean == true || i > 0; i--) {
		System.out.println("You have " + i + " log in attempts remaining\nUsername: ");
		Scanner scannerTwo = new Scanner(System.in);
		this.preLoginUsername = scannerTwo.nextLine();
		
		if(this.preLoginUsername.length() > 0) {
			System.out.println("Password: ");
			this.preLoginPassword = scannerTwo.nextLine();
		}	
		
		if(this.preLoginPassword.length() > 0) {
			DAO daoImp1 = new DAO();
			if(daoImp1.validateLogin(this.preLoginUsername, this.preLoginPassword)) {
				//System.out.println("Login Successful!!!");
				userLoginBoolean = true;
				break;
				
			}
			
			else {
				userLoginBoolean = false;
				
			}
		} 
		}
		
	  
	}
	
	/*
	 * public PreLogin() {
		
		do {
			
			DAO crud = new DAO();
			
			
			doesUserAccountExist();
			
			
				if(this.userGreetingResponseString.toLowerCase().equals("yes")) {
					//System.out.print("Time to login");
					PreLoginUser user1 = new PreLoginUser();
					user1.userLogin();
					
					if(user1.userLoginBoolean) {
						this.loginComplete = true;
						userRoleCheck = user1.getPreLoginUsername();
						
					}
					
					else {
						this.loginComplete = false;
					}
				}
				
				else if(this.userGreetingResponseString.toLowerCase().equals("no")) {
					//System.out.println("Need to sign up");
					PreLoginNonUser nonUser1 = new PreLoginNonUser();
					nonUser1.registerNewUser();
					this.loginComplete = false;
					
					if(nonUser1.readyToEnterDB) {
						crud.createDAOMember(nonUser1);
						
					}
					
					}
			} while(this.loginComplete != true);
		System.out.println(userRoleCheck);
		
	}
	
	 * 
	 */
	
	
	
	
	
	
	
	
	
	
	
	


	public String getPreLoginFirstName() {
		return preLoginFirstName;
	}


	public String getPreLoginLastLast() {
		return preLoginLastLast;
	}


	public String getPreLoginUsername() {
		return preLoginUsername;
	}


	public String getPreLoginPassword() {
		return preLoginPassword;
	}


	public String getPreLoginEmail() {
		return preLoginEmail;
	}


	public String getUserRole() {
		return userRole;
	}	
	
	
	
	
	
	
	
	
	
	
	

}
