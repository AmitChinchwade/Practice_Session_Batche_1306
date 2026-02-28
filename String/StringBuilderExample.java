package com.String;

public class StringBuilderExample {
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder("Hello");
		sb.append(" World");
		
		System.out.println(sb.reverse());
		
		StringBuilder sc = new StringBuilder(sb);
		
		System.out.println(sc.reverse());

		
		
	}
}
