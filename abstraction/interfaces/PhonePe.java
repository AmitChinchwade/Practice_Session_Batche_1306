package abstraction.interfaces;

public class PhonePe implements PaymentApp{
	
	public void pay() {
	
		System.out.println("Payment is done through PhonePe");
		
	}
	
	public void checkBalance() {
		System.out.println("Remaning balance in PhonePe  is 800");
	}

}