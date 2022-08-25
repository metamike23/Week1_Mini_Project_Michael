package com.revature.models;

public class PreLoginUser extends PreLogin {
	
	
	public boolean needToRegister;
	
	
	public void userLogin() {
		super.userLogin();
		
		if(super.userLoginBoolean) {
			this.needToRegister = false;
			//System.out.println(super.preLoginUsername);
		}
		
		else if(super.userLoginBoolean == false) {
			this.needToRegister = true;
			System.out.println("Need to register account");
			
		}
	}

	
	
	

	public boolean preLoginUserpath() {
		
		if(this.needToRegister) {
			// If the user fails on all three attempts to sign at the log in screen
			// They either forgot their username/password or need to register an account
			// Inside the login() method, the needToRegister boolean will be set to false if it fails
			System.out.println("Username and password are incorrect or you haven't registered yet");
		}
		
		else if(this.needToRegister == false) {
			// If the user Successfully logs in that means they do not need to register an account
			// After a successful login the User will continue in the program
			System.out.println("Login successful");
			
		}
		return needToRegister;
	}
	

}
