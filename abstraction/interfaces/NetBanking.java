package abstraction.interfaces;

public class NetBanking implements PaymentApp{
	
	
	public void pay() {
		System.out.println("Payment is done through NetBanking");
		
	}
	
	public void checkBalance() {
		System.out.println("Remaning balance in NetBanking is 600");
	}

}