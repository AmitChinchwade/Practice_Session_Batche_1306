package coma.array;
import java.util.ArrayList;
public class IteratewithForEach {
	
	    public static void main(String[] args) {
	        ArrayList<String> list = new ArrayList<>();
	        list.add("Red"); list.add("Green"); list.add("Blue");
	        for (String color : list) {
	            System.out.print(color + " ");
	        }
	    }
	}

