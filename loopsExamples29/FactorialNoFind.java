package loopsExamples29;

import java.util.Scanner;

public class FactorialNoFind {

	public static void main(String[] args) {

		//Print factorial of any number using do-while loop.
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter The Number: ");
		int num = scan.nextInt();
		
		int count = 0;
		
		if(num == 0)
		{
			count = 1;
		}
		else
		{ 
			while(num != 0)
			{
				num = num/10;
				count++;
			}
		}
		System.out.println(count);
		
		
	}
}
