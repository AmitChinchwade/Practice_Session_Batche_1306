package abstraction.interfaces;


public class GoogleAutthentication implements Autthentication {
	
	
	public void login() {
		System.out.println("Logni successfull in Google");
	}
	
	public void logout() {
		System.out.println("Logout successfully");
	}

}