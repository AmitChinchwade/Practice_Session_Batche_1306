package loopsExamples29;

import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter The First Number: ");
		int num1 = scan.nextInt();
		
		System.out.println("Enter The Second Number: ");
		int num2 = scan.nextInt();
		
		for(int i=0;i<=10;i++)
		{
			int temp = num1 + num2;
			num1 = num2;
			num2 = temp;
			System.out.println(temp);
		}	
		scan.close();
	}
}
