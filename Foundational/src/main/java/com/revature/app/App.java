package com.revature.app;

import com.revature.dao.DAO;
import com.revature.models.Employee;
import com.revature.models.Manager;
import com.revature.models.PreLogin;
import com.revature.models.PreLoginNonUser;
import com.revature.models.PreLoginUser;
import com.revature.models.User;

public class App extends User {
	
	PreLogin preLogin1 = new PreLogin();
	DAO crud = new DAO();
	User user = new User();
	public boolean loginComplete;
	public boolean userGreetingResponseBoolean;
	public String userGreetingResponseString;
	public boolean userLoginBoolean;
	public String userRole;
	public String manager = "Manager";
	
	
	public App() {
		
		passLoginStage();
		
		if(userPath(super.username).equals(manager)) {
			Manager mang1 = new Manager();
		}
		
		else {
			Employee emp1 = new Employee();
		}
		
		
		
		
		
		
		
	}
	
	
	void passLoginStage() {
	
	do {
		preLogin1.doesUserAccountExist();
		
		if(preLogin1.userGreetingResponseString.toLowerCase().equals("yes")) {
			//System.out.print("Time to login");
			PreLoginUser user1 = new PreLoginUser();
			user1.userLogin();
			if(user1.userLoginBoolean) {
				super.username = user1.getPreLoginUsername();
				break;
			}
		} 
		
		else {
		//System.out.println("Need to sign up");
		PreLoginNonUser nonUser1 = new PreLoginNonUser();
		nonUser1.registerNewUser();
			
		if(nonUser1.readyToEnterDB) {
				 crud.createDAOMember(nonUser1);
				 
			   }
			
			}
		
		} while(1!=0);
	//System.out.println(super.username);
	}
	
	public String userPath(String str) {
		
		if(this.manager.equals(crud.getUserRoleCabinet(str))) {
			System.out.println("Manager");
			userRole = manager;
		}
		
		else {
			System.out.println("Employee");
			userRole = "Employee";
		}
		return userRole;
		
	}
	
	
}
	





	








