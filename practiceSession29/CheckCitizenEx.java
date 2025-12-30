package practiceSession29;

import java.util.Scanner;

public class CheckCitizenEx {

	public static void main(String[] args) {
		
		//Accept age and gender:
			//If age > 60 and gender = 'F' â†’ â€œSenior Woman Citizenâ€
			//If age > 60 and gender = 'M' â†’ â€œSenior Man Citizenâ€
			//Else â†’ â€œNot a Senior Citizenâ€

		Scanner scan = new Scanner(System.in);
		
		String femaleC = "Female";
		String femaleL = "female";
		
		String maleC = "Male";
		String maleL = "male";
		
		System.out.println("Please Enter Your Age: ");
		int age = scan.nextInt();
		
		System.out.println("Please Enter Your Gender: ");
		String gender = scan.next();
		
		if(age > 60 && (gender.equals(femaleC) || gender.equals(femaleL)))
		{
			System.out.println("She is a Seniour Women  Citizen...");
		}
		else if(age > 60 && (gender.equals(maleC) || gender.equals(maleL)))
		{
			System.out.println("He is a Seniour Men  Citizen...");
		}
		else
		{
			System.out.println("You are not Seniour Citizen...");
		}
		scan.close();
	}

}
