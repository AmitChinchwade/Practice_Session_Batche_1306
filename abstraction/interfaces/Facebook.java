package abstraction.interfaces;

public class Facebook implements MetaApp{
	
	
	public void login(String username, String password) {
		
		if(username == "samarth@gmail.com" && password == "samarth@123") {
			
			System.out.println("Entered successfully in Facebook");
		}
		else {
			System.out.println("Invalid Credentials");
		}
		
		
	}
	
	public void logout() {
		System.out.println("Logout successfully done...! from Facebook");
		
	}

}