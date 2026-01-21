package nonparamethod;

import java.util.Scanner;

public class PersonalDetails {

	String myName;
	String myAge;
	String myCity;

	public void myDetails() {
		System.out.println("Please Enter Your Personal Information: ");
		{
			Scanner scan = new Scanner(System.in);
			System.out.println("Enter your Name: Amit ");
			myName = scan.nextLine();

			System.out.println("Enter your Age: 23 ");
			myAge = scan.nextLine();

			System.out.println("Enter your City: Chinchwad ");
			myCity = scan.nextLine();
			scan.close();
		}
		System.out.println("This is My Personal Information...");
		System.out.println("Name: " + myName);
		System.out.println("Age: " + myAge);
		System.out.println("City: " + myCity);

	}

}