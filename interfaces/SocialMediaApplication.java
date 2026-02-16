package com.interfaces;

public interface SocialMediaApplication {

	interface ReelsFeature {
	    void uploadReel();
	}

	interface ChatFeature {
	    void sendMessage();
	}

	class SocialApp implements ReelsFeature, ChatFeature {

		public void uploadReel() {
	        System.out.println("SocialApp: Uploading a reel...");
	    }

	    public void sendMessage() {
	        System.out.println("SocialApp: Sending a message...");
	    }
	}

	public class Main {
	    public static void main(String[] args) {
	        SocialApp app = new SocialApp();
	        app.uploadReel();
	        app.sendMessage();
	    }
	}

}
