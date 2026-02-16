package com.interfaces;

public interface SmartWatch {

	
	interface HeartRateMonitor {
	    void measureHeartRate();
	}

	interface StepCounter {
	    void countSteps();
	}

	class SmartWatch implements HeartRateMonitor, StepCounter {

		public void measureHeartRate() {
	        System.out.println("SmartWatch: Measuring heart rate...");
	    }

	    public void countSteps() {
	        System.out.println("SmartWatch: Counting steps...");
	    }
	}

	public class Main {
	    public static void main(String[] args) {
	     SmartWatch watch = new SmartWatch();
	        watch.measureHeartRate();
	        watch.countSteps();
	    }
	}

}
