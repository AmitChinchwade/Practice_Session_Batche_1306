package practiceSession29;

import java.util.Scanner;

public class PrintNearestNoOf100 {

	public static void main(String[] args) {
		// Accept two numbers and print which number is nearest to 100.
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter The 1 Number: ");
		int num1 = scan.nextInt();
		
		System.out.println("Enter The 2 Number: ");
		int num2 = scan.nextInt();
		
		if(num1 > num2 && num1 <= 100)
		{
			System.out.println(num1+": is Nearest To 100");
		}
		else if(num2 > num1 && num2 <= 100)
		{
			System.out.println(num2+": is Nearest To 100");
		}
		else if(num1 < num2 && num1 >= 100)
		{
			System.out.println(num1+": is Nearest To 100");
		}
		else if(num2 > num1 && num2 >= 100)
		{
			System.out.println(num2+": is Nearest To 100");
		}
		else
		{
			System.out.println("Invalid Input Please Enter Valid Input...");
		}
		
		scan.close();
	}

}
