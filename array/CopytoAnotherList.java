package coma.array;

import java.util.ArrayList;

public class CopytoAnotherList {

	    public static void main(String[] args) {
	        ArrayList<String> list1 = new ArrayList<>();
	        list1.add("A"); list1.add("B");
	        ArrayList<String> list2 = new ArrayList<>(list1);  
	        System.out.println("Copy: " + list2);
	    }
	}


