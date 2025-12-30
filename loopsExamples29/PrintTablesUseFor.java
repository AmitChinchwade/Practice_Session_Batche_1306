package loopsExamples29;

import java.util.Scanner;

public class PrintTablesUseFor {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter The Number: ");
		int num = scan.nextInt();
		
		for(int i=1;i<=10;i++)
		{
			System.out.println(num+" X "+ i +" = "+i*num);
		}
		scan.close();
	}

}
