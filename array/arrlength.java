package array;

public class arrlength {

	
	    public static void main(String[] args) {
	        String str = "YoAmit";
	        char[] chars = str.toCharArray();
	        
	        int length = 0;
	        for(char c : chars) {
	            length++;
	        }
	        
	        System.out.println("Length: " + length);  
	    }
	}
	
