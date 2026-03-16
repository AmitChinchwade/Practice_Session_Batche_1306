package coma.array;

import java.util.ArrayList;

public class SizeFirstLastElement {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		list.add(10);
		list.add(20);
		list.add(30);
		System.out.println("Size: " + list.size());
		System.out.println("First: " + list.get(0) + ", Last: " + list.get(list.size() - 1));

	}
}
