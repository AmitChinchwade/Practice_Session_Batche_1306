package com.interfaces;

public interface ECommercePlatform {

	interface Seller {
	    void sellProduct();
	}

	interface Buyer {
	    void buyProduct();
	}

	class MarketplaceUser implements Seller, Buyer {

		public void sellProduct() {
	        System.out.println("MarketplaceUser: Selling a product...");
	    }

	    public void buyProduct() {
	        System.out.println("MarketplaceUser: Buying a product...");
	    }
	}

	public class Main {
	    public static void main(String[] args) {
	        MarketplaceUser user = new MarketplaceUser();
	        user.sellProduct();
	        user.buyProduct();
	    }
	}

	
}
