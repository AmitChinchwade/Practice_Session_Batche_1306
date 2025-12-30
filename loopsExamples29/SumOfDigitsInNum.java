package loopsExamples29;

import java.util.Scanner;

public class SumOfDigitsInNum {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter The Number: ");
		int num = scan.nextInt();
		
		int sum = 0;
		
		while(num > 0)
		{
			int rem = num % 10;
			sum += rem;
			num /=10;
		}
		System.out.println("Sum Of Number: "+sum);
		scan.close();
	}
}
