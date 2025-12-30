package practiceSession29;

import java.util.Scanner;

public class SalaryTaxProject {

	public static void main(String[] args) {

		//Accept a person's salary and apply tax:
		//Salary < 50,000 â†’ No Tax
		//50,000 to 1,00,000 â†’ 10% Tax
		//Above 1,00,000 â†’ 20% Tax
	
		double tax = 0;
		Scanner scan = new Scanner(System.in);
		
			System.out.println("Please Enter your Salary: ");
			double salary = scan.nextDouble();
			
			if(salary < 50000 )
			{
				System.out.println(salary+" On This Ammount No Tax...");
			}
			else if( salary > 50001 && salary < 99999)
			{
				
				System.out.println(tax = (salary*0.10));
				System.out.println(salary+" On This Ammount Applyed 10% Tax"+ "&"+" Tax Ammount: "+tax);
			}
			else if(salary > 100000)
			{
				System.out.println(tax = (salary*0.20));
				System.out.println(salary+" On This Ammount Applyed 20% Tax"+ "&"+" Tax Ammount: "+tax);
			}
			
			scan.close();
		
	}

}
