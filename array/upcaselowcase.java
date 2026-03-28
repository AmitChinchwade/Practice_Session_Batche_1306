package array;

public class upcaselowcase {

	
	    public static void main(String[] args) {
	        String str = "hey amit chinchwade";
	        char[] chars = str.toCharArray();
	        
	        
	        for(int i = 0; i < chars.length; i++) {
	            if(chars[i] >= 'a' && chars[i] <= 'z') {
	                chars[i] = (char)(chars[i] - 32);
	            }
	        }
	        
	        System.out.println("Original: " + str);
	        System.out.println("Uppercase: " + new String(chars));
	    }
	}
