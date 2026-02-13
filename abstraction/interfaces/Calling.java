package abstraction.interfaces;

public class Calling {
	
	public static void main(String[] args) {
		
		
		Authentication auth;
		auth = new GoogleAutthentication();
		auth.login();
		auth.logout();
		
		
		System.out.println();
		Authentication insta;
		insta = new InstagramAuthentication();
		insta.login();
		insta.logout();
		

		System.out.println();
		GoogleApp ga;
		ga = new Gmail();
		ga.openApp();

		Gmail g = new Gmail();
		g.sendMail();

		System.out.println();
		GoogleApp gg;
		gg = new Youtube();
		gg.openApp();
		
		Youtube y = new Youtube();
		y.playVideo();

		System.out.println();
		GoogleApp ap;
		ap = new GoogleMaps();
		ap.openApp();
		GoogleMaps s = new GoogleMaps();
		s.navigate();
		
		
		System.out.println();
		MetaApp m;
		m = new Facebook();
		m.login("samarth@gmail.com", "samarth@123");
		m.logout();
		System.out.println();
		
		m = new WhatApps();
		m.login("samerr@gmail.com", "samerr@123");
		
		System.out.println();
		PaymentApp py;
		py = new GooglePay();
		py.pay();
		GooglePay gp = new GooglePay();
		gp.checkBalance();
		
		System.out.println();
		py = new PhonePe();
		py.pay();
		PhonePe pp = new PhonePe();
		pp.checkBalance();
		
		System.out.println();
		py = new NetBanking();
		py.pay();
		NetBanking pt = new NetBanking();
		pt.checkBalance();
		
		System.out.println();
		StreamingApps st;
		st = new Netflix();
		st.playContent();
		st = new AmazonPrime();
		st.playContent();
		st = new JioHotstar();
		st.playContent();
		
	}

}
