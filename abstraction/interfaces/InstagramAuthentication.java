package abstraction.interfaces;

public class InstagramAuthentication  implements Authentication{
	
	public void login() {
		System.out.println("Login successfull in Instagram");
	}
	
	public void logout() {
		System.out.println("Logout successfully from Instagram");
	}

}