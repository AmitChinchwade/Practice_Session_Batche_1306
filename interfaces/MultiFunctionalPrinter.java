package com.interfaces;

public interface MultiFunctionalPrinter {

	interface Printer {
	    void print();
	}

	interface Scanner {
	    void scan();
	}

	class AllInOnePrinter implements Printer, Scanner {
	
		public void print() {
	        System.out.println("AllInOnePrinter: Printing document...");
	    }

	    public void scan() {
	        System.out.println("AllInOnePrinter: Scanning document...");
	    }
	}

	public class Main {
	    public static void main(String[] args) {
	        AllInOnePrinter printer = new AllInOnePrinter();
	        printer.print();
	        printer.scan();
	    }
	}

	
}
