package loopsExamples29;

public class PalendromeCheck {

	public static void main(String[] args) {

		// Accept a number and print whether it is a palindrome or not using while loop
		
		int num = 153;
		int temp = num;
		int pal = 0;
		
		while(num > 0)
		{
			int rem = num % 10;
			pal = (rem * rem * rem ) + pal;
			num /= 10;
		}
		if(temp == pal)
		{
			System.out.println(pal+": is a Palindrome Number");
		}
		else
		{
			System.out.println(pal+": is Not a Palindrome Number");
		}
	}

}
