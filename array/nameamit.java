package array;

public class nameamit {

	    public static void main(String[] args) {
	        String name = "AmitChinchwade";  
	        char[] chars = name.toCharArray();
	        
	        
	        for(int i = 0; i < chars.length / 2; i++) {
	            char temp = chars[i];
	            chars[i] = chars[chars.length - 1 - i];
	            chars[chars.length - 1 - i] = temp;
	        }
	        
	        System.out.println("Original: " + name);
	        System.out.println("Reversed: " + new String(chars));
	    }
	}
