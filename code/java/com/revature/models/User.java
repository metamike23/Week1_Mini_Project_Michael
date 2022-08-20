package com.revature.models;

import java.util.Scanner;

public class User {
	
	private String username;
	private String password;
	private String firstName;
	private String lastName;
	private String email;
	private boolean userGreetingResponseBoolean;
	private String  userGreetingResponseString;
	
	
	public User() {
		
		// The first thing we do is send the user a welcome message
		System.out.println("WELCOME TO THE BLOCKCHAIN BULLS ASSET LOUNGE\n  ");
		
		
		// Next we will ask the User if they already have an account registered
		// The user input for for the doesUserAccountExist() method is stored in the String variable userGreetingResponseString
		// When the user inputs either yes or no, the boolean variable userGreetingResponseBoolean is set to true
		doesUserAccountExist();	
		
		
		// Remember once the doesUserAccountExist() method is complete it sets the value of userGreetingResponseBoolean from undeclared to true
		// Once userGreetingResponseBoolean is true, this if statement will be executed
		if(userGreetingResponseBoolean) {
			
			// This is the nested else if statement that will execute once userGreetingResponseBoolean is true
			// This else if statements states that if the String value of userGreetingResponseString is yes, the userLogin() method will execute
			// If the value of userGreetingResponseString is not yes (the only other value it could have is no), the registerNewUser() method will execute
			
			if(userGreetingResponseString.toLowerCase().equals("yes")) {
				//System.out.print("Time to login");
				userLogin();
			}
			
			else {
				//System.out.println("Need to sign up");
				registerNewUser();
				
			}
		}
		
			
	}
	
	
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
			} while (userGreetingResponseBoolean != true);
	}
	
	
	
	public void userLogin() {
		// The userLogin() method will ask the User to type in their accounts username and password
		
		System.out.println("Username: ");
		System.out.println("Password: ");
		Scanner scannerTwo = new Scanner(System.in);
		
		String usernameBeforeDBCheck = scannerTwo.nextLine();
		
		String passwordBeforeDBCheck = scannerTwo.nextLine();
		
		System.out.println("username is: " + usernameBeforeDBCheck + "\npassword is: " + passwordBeforeDBCheck);
		
		// When I incorporate the database I will search through the ERS_USER table and see if the usernameBeforeDBCheck exists and if it does,
		// then I will check to see if the user provided password matches with the username
		
	}
	
	public void registerNewUser() {
		// The registerNewUser() method will ask the user to provide a first name, last name, username, password, and an email
		// REQUIREMENTS:
		// Must ensure the username is not already registered
		// default employee code
		
		Scanner scannerThree = new Scanner(System.in);
		System.out.println("First name: ");
		this.firstName = scannerThree.nextLine();
		
		if(this.firstName.length() > 0) {
			System.out.println("Last name: ");
			this.lastName = scannerThree.nextLine();
		}
		
		if(this.lastName.length() > 0) {
			System.out.println("Username: ");
			this.username = scannerThree.nextLine();
		}
		
		if(this.username.length() > 0) {
			System.out.println("Password: ");
			this.password = scannerThree.nextLine();
		}
		
		if(this.password.length() > 0) {
			System.out.println("Email: ");
			this.email = scannerThree.nextLine();
		}
		
		System.out.println("First Name: " + firstName
							+ "\nLast Name: " + lastName
							+ "\nUsername: " + username
							+ "\nPassword: " + password
							+ "\nEmail: " + email);	
	}
	
}
	

	
	

