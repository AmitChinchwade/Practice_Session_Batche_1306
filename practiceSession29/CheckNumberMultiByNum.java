package practiceSession29;

import java.util.Scanner;

public class CheckNumberMultiByNum {

	public static void main(String[] args) {

		// Accept a number and check whether it is a multiple of 5 and 11 or not. 
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter The Number: ");
		int num = scan.nextInt();
		
		if(num % 5 == 0)
		{
			System.out.println(num+": Number is Multiple of 5");
		}
		else if(num % 11 == 0)
		{
			System.out.println(num+": Number is Multiple of 11");
		}
		else
		{
			System.out.println(num+": Number is Do Not Multiple Of 5 & 11");
		}
		
		scan.close();
	}

}
