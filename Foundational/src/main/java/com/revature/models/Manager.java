package com.revature.models;

import java.util.Scanner;

public class Manager {
	
	public String menuOneDecision;
	public String menuTwoDecision;
	public int i;
	public boolean flow1;
	public boolean flow2;

	public Manager() {
		super();
		
		
	while(1 != 0) {
		menuTwo();
		if(menuTwoDecision.equals("1")) {
			viewPendingClaims();
		}
		
		else if(menuTwoDecision.equals("2")) {
			viewResolvedClaims();
		}
		
		else if(menuTwoDecision.equals("3")) {
			System.out.println("End");
			break;
		}
		
	}
		
		}
		
	private void viewPendingClaims() {
		System.out.println("Pending claims");
		makeClaimDecision();
	}
	
	private void makeClaimDecision() {
		System.out.println("Deny or Approve claims");
	}
	
	private void viewResolvedClaims() {
		System.out.println("Resolved Claims");
	}
	
			
			
		
	
		
	
	
		private String menuTwo() {
		
			do {
				System.out.println("----Options:\n----Type 1 To View Pending Claims\n----Type 2 To View Resolved Claims\n----Type 3 To End Program");
				Scanner scanner = new Scanner(System.in);
				menuTwoDecision = scanner.nextLine();
				
				if(menuTwoDecision.equals("1") || menuTwoDecision.equals("2") || menuTwoDecision.equals("3")) {
					break;
				}
		} while(1 != 0);
			return menuTwoDecision;
			
		}
		
	}
	
	
	
	


