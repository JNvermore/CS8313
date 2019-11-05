package abstractFactory.Product;

import abstractFactory.OSFactory.OSFactory;

public class WatchProduct extends Product {
	OSFactory onlineStoreFactory;
	
	public WatchProduct(OSFactory onlineStoreFactory) {
		this.onlineStoreFactory = onlineStoreFactory;
	}

	@Override
	void prepare() {
		// TODO Auto-generated method stub
		System.out.println("Preparing" + productType);
		watch = onlineStoreFactory.orderWatch(productType);
	}

}
