package array;

public class Checkwhether {

	    public static void main(String[] args) {
	        String str = "racecar";
	        char[] chars = str.toCharArray();
	        
	        boolean isPalindrome = true;
	        for(int i = 0; i < chars.length/2; i++) {
	            if(chars[i] != chars[chars.length-1-i]) {
	                isPalindrome = false;
	                break;
	            }
	        }
	        
	        System.out.println("String: " + str);
	        System.out.println("Is Palindrome: " + isPalindrome);  
	    }
	}
	
