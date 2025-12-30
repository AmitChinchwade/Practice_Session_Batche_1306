package practiceSession29;

import java.util.Scanner;

public class CheckCharactersExNo5 {

	public static void main(String[] args) {

		// Accept a character and check if it is uppercase, lowercase, digit, or special character.
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Please Enter The Character");
		while(true)
		{
			char myChar = scan.next().charAt(0);
		
			if(Character.isUpperCase(myChar))
			{
				System.out.println(myChar+": This Character is a Upper Case...");
			}
			else if(Character.isLowerCase(myChar))
			{
				System.out.println(myChar+": This Character is a Lower Case...");
			}
			else if(Character.isDigit(myChar))
			{
				System.out.println(myChar+": This is Number");
			}	
			else
			{
				System.out.println(myChar+": This is Special Character...");
			}
			
		}
	}
}