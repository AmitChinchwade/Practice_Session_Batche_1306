package loopsExamples29;

import java.util.Scanner;

public class PrintTableUseWhile {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Please Enter The Number: ");
		int num = scan.nextInt();
		int i =1;
		
		while(i <= 10)
		{
			System.out.println(num+" X "+ i +" = "+i*num);
			i++;
		}
		scan.close();
	}

}
