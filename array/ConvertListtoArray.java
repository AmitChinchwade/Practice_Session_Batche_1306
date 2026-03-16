package coma.array;

import java.util.ArrayList;

public class ConvertListtoArray {

	
	    public static void main(String[] args) {
	        ArrayList<Integer> list = new ArrayList<>();
	        list.add(10); 
	        list.add(20); 
	        list.add(30);
	        Integer[] array = list.toArray(new Integer[0]);
	        for (int num : array) {
	            System.out.print(num + " "); 
	        }
	    }
	}
