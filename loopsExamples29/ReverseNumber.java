package loopsExamples29;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter The Number: ");
		int num = scan.nextInt();
		int rev = 0;
		
		while(num > 0)
		{
			int rem = num % 10;
			rev = rev * 10 + rem;
			num /= 10;
		}
		System.out.println("Reversed Form :"+rev);
		scan.close();
	}

}
