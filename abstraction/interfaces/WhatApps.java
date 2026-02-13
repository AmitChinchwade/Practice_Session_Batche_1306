package abstraction.interfaces;

public class WhatApps  implements MetaApp{
	
	public void login(String username, String password) {
		
		if(username == "samerr@gmail.com" && password == "samerr#123") {
			
			System.out.println("Entered successfully in whatApps");
		}
		else {
			System.out.println("Invalid Credentials for whattsup login");
		}
		
		
	}
	
	public void logout() {
		System.out.println("Logout successfully done from Whattsup...!");
		
	}
	

}