package array;

public class vowels {
	
	
	    public static void main(String[] args) {
	        String name = "AmitChinchwade";  
	        char[] chars = name.toCharArray();
	        
	        int vowels = 0, consonants = 0;
	        char[] vowelsArray = {'a','e','i','o','u','A','E','I','O','U'};
	        
	        for(char c : chars) {
	            boolean isVowel = false;
	            for(char v : vowelsArray) {
	                if(c == v) {
	                    isVowel = true;
	                    break;
	                }
	            }
	            if(isVowel) {
	                vowels++;
	            } else if((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z')) {
	                consonants++;
	            }
	        }
	        
	        System.out.println("Name: " + name);
	        System.out.println("Vowels: " + vowels);     
	        System.out.println("Consonants: " + consonants); 
	    }
	}

