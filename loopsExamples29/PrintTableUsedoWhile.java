package loopsExamples29;

import java.util.Scanner;

public class PrintTableUsedoWhile {

	public static void main(String[] args) {

		int i = 1;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter The Number: ");
		int num = scan.nextInt();

		do {
			System.out.println(num + " X " + i + " = " + i * num);
			i++;
		} while (i <= 10);
		scan.close();
	}

}
