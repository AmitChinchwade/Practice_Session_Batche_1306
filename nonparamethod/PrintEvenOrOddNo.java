package nonparamethod;

import java.util.Scanner;

public class PrintEvenOrOddNo {

	Scanner scan = new Scanner(System.in);

	public void printEvenOdd() {
		while (true) {
			System.out.println("Ehter The Number: ");
			int num = scan.nextInt();
			if (num % 2 == 0) {
				System.out.println(num + ": is a Even Number.");
			} else {
				System.out.println(num + ": is a Odd Number.");
			}
		}
	}
}
