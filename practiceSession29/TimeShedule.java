package practiceSession29;

import java.util.Scanner;

public class TimeShedule {

	public static void main(String[] args) {

		    //Accept time in 24-hour format and print:
			//0â€“11 â†’ Good Morning
			//12â€“16 â†’ Good Afternoon
			//17â€“20 â†’ Good Evening
			//21â€“23 â†’ Good Night 
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter The Time: ");
		float time = scan.nextFloat();
		
		if(time > 0 && time <= 11)
		{
			System.out.println("Good Morning");
		}
		else if(time >= 11 && time <= 16)
		{
			System.out.println("Good Afternoon");
		}
		else if(time >= 17 && time <= 20)
		{
			System.out.println("Good Evening");
		}	
		else if(time >= 21 && time <= 23)
		{
			System.out.println("Good Night");
		}
		else
		{
			System.out.println("Please Enter Valid Input...");
		}
		scan.close();
	}
}
