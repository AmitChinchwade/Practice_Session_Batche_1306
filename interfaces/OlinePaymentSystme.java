package com.interfaces;

public interface OlinePaymentSystme {

	interface UPIPayment {
	    void payUsingUPI();
	}

	interface CardPayment {
	    void payUsingCard();
	}

	class PaymentGateway implements UPIPayment, CardPayment {

		public void payUsingUPI() {
	        System.out.println("PaymentGateway: Paying via UPI...");
	    }

	    public void payUsingCard() {
	        System.out.println("PaymentGateway: Paying via Card...");
	    }
	}

	public class Main {
	    public static void main(String[] args) {
	        PaymentGateway gateway = new PaymentGateway();
	        gateway.payUsingUPI();
	        gateway.payUsingCard();
	    }
	}

}
