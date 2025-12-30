package practiceSession29;

import java.util.Scanner;

public class TrangleExampleNo3 {

	public static void main(String[] args) {

		//Accept three sides of a triangle and check whether it is valid or not (sum of any two sides > third side). 
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter The Length of 1 Side of Thangle: ");
		int side1 = scan.nextInt();
	
		System.out.println("Enter The Length of 2 Side of Thangle: ");
		int side2 = scan.nextInt();
		
		System.out.println("Enter The Length of 3 Side of Thangle: ");
		int side3 = scan.nextInt();
		
		if(side1 + side2 > side3)
		{
			System.out.println("This Trangle is Valid...");
		}
		else
		{
			System.out.println("This Trangle is Not Valid...");
		}
		scan.close();
	}

}
