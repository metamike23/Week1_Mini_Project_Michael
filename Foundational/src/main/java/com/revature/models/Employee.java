package com.revature.models;

import java.util.Scanner;

public class Employee {
	
	
	public String menuTwoDecision;

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
		while(1 != 0) {
			menuTwo();
			if(menuTwoDecision.equals("1")) {
			 makeNewClaim();
			}
			
			else if(menuTwoDecision.equals("2")) {
				viewExistingClaims();
			}
			
			else if(menuTwoDecision.equals("3")) {
				System.out.println("End");
				break;
			}
			
		}
		}
	
	private String menuTwo() {
		
		do {
			System.out.println("----Options:\n----Type 1 To Make A New Claim\n----Type 2 To View Existing Claims\n----Type 3 To End Program");
			Scanner scanner = new Scanner(System.in);
			menuTwoDecision = scanner.nextLine();
			
			if(menuTwoDecision.equals("1") || menuTwoDecision.equals("2") || menuTwoDecision.equals("3")) {
				break;
			}
	} while(1 != 0);
		return menuTwoDecision;
		
	}
	
	private void viewExistingClaims() {
		System.out.print("Existing Claims");
		
	}
	
	private void makeNewClaim() {
		System.out.println("Make New Claim");
	}
	
	

}
