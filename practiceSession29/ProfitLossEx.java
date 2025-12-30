package practiceSession29;

import java.util.Scanner;

public class ProfitLossEx {

	public static void main(String[] args) {

		// Accept the cost price and selling price; print Profit, Loss, or No Profit No Loss.
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Please Enter Your Ammount: ");
		double cost = scan.nextDouble();
		
		System.out.println("Please Enter The Selling Ammount: ");
		double sellAmmount = scan.nextDouble();
		
		double profit = sellAmmount - cost;
		double loss = sellAmmount - cost;
		
		if(cost < sellAmmount)
		{
			System.out.println("You Are Profitable With: "+profit+" Rs" );
		}
		else
		{
			System.out.println("Your Loss With: "+loss+" Rs" );
		}
		scan.close();
	}
}
