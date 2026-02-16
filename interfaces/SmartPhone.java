package com.interfaces;

public interface SmartPhone {

	interface Camera {
	    void takePhoto();
	}

	interface MusicPlayer {
	    void playMusic();
	}

	class SmartPhone implements Camera, MusicPlayer {
	   
		public void takePhoto() {
	        System.out.println("SmartPhone: Capturing a high‑resolution photo...");
	    }

		public void playMusic() {
	        System.out.println("SmartPhone: Playing music...");
	    }
	}

	public class Main {
	    public static void main(String[] args) {
        	phone  new    SmartPhone phone = new SmartPhone();
	        phone.takePhoto();
	        phone.playMusic();
	    }
	}

}
