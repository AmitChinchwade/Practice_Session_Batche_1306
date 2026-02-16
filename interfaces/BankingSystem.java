package com.interfaces;

public interface BankingSystem {

	interface LoanService {
	    void applyLoan();
	}

	interface InsuranceService {
	    void applyInsurance();
	}

	class BankService implements LoanService, InsuranceService {
	  
		public void applyLoan() {
	        System.out.println("BankService: Applying for a loan...");
	    }

	    public void applyInsurance() {
	        System.out.println("BankService: Applying for insurance...");
	    }
	}

	public class Main {
	    public static void main(String[] args) {
	        BankService service = new BankService();
	        service.applyLoan();
	        service.applyInsurance();
	    }
	}
	
}
