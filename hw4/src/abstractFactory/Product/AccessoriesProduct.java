package abstractFactory.Product;

import abstractFactory.OSFactory.OSFactory;

public class AccessoriesProduct extends Product {
	OSFactory onlineStoreFactory;
	
	public AccessoriesProduct(OSFactory onlineStoreFactory) {
		this.onlineStoreFactory = onlineStoreFactory;
	}
	
	@Override
	void prepare() {
		// TODO Auto-generated method stub
		System.out.println("Preparing" + productType);
		tablet = onlineStoreFactory.orderTablet(productType);
	}

}
