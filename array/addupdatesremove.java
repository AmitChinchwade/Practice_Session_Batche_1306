package coma.array;

import java.util.ArrayList;

public class addupdatesremove {

		    public static void main(String[] args) {
	        ArrayList<String> list = new ArrayList<String>();
	        list.add("A");  
	        list.set(0, "Apple");  
	        list.add(1, "Banana");
	        list.add(2, "Apple");
	        list.remove(0);  
	        System.out.println(list);
	    }
	}

