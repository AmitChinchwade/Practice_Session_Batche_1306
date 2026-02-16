package com.interfaces;

public interface EducationalPlatform {

	
	interface VideoCourse {
	    void watchVideo();
	}

	interface TestSeries {
	    void attemptTest();
	}

	class LearningApp implements VideoCourse, TestSeries {

		public void watchVideo() {
	        System.out.println("LearningApp: Watching a video lecture...");
	    }

	    public void attemptTest() {
	        System.out.println("LearningApp: Attempting a test...");
	    }
	}

	public class Main {
	    public static void main(String[] args) {
	        LearningApp app = new LearningApp();
	        app.watchVideo();
	        app.attemptTest();
	    }
	}

}
