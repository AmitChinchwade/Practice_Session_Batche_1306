package com.String;

public class Builder {

	public static void main(String[] args) {

		String str = "Hello Java";

		System.out.println("Original String: " + str);
		System.out.println("Length: " + str.length());
		System.out.println("Uppercase: " + str.toUpperCase());
		System.out.println("Lowercase: " + str.toLowerCase());
		System.out.println("Substring (0-5): " + str.substring(0, 5));
		System.out.println("Replace: " + str.replace("Java", "World"));
		System.out.println("Contains 'Java'? " + str.contains("Java"));

		Object obj = str;

		System.out.println("\nObject toString(): " + obj.toString());
		System.out.println("Object hashCode(): " + obj.hashCode());
		System.out.println("Object equals(): " + obj.equals(str));

		StringBuilder sb = new StringBuilder("Hello");

		sb.append(" World");
		sb.insert(5, " Java");
		sb.replace(0, 5, "Hi");
		sb.delete(2, 7);
		sb.reverse();

		System.out.println("\nStringBuilder Result: " + sb);
		System.out.println("Capacity: " + sb.capacity());

		StringBuffer sbf = new StringBuffer("Programming");

		sbf.append(" in Java");
		sbf.insert(0, "Learn ");
		sbf.delete(6, 12);
		sbf.reverse();

		System.out.println("\nStringBuffer Result: " + sbf);
		System.out.println("Length: " + sbf.length());
	}

}
