package practiceSession29;

import java.util.Scanner;

public class PerfectSquareEx {

    public static void main(String[] args) {

        int num;
        Scanner scan = new Scanner(System.in);
        boolean isPerfectSquare = false;

        System.out.println("Enter The Number: ");
        num = scan.nextInt();

        for (int i = 0; i * i <= num; i++) {
            if (i * i == num) {
                isPerfectSquare = true;
                break;
            }
        }

        if (isPerfectSquare) {
            System.out.println(num + " : is a perfect Square");
        } else {
            System.out.println(num + " : is Not a perfect Square");
        }
    }
}
