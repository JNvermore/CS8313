
public class AccessoryProduct extends Product {
	OnlineStoreFactory onlineStoreFactory;
	

	public AccessoryProduct(OnlineStoreFactory onlineStoreFactory) {
		this.onlineStoreFactory = onlineStoreFactory;
	}


	@Override
	void prepare() {
		System.out.println("Prepareing " + productType);
		accessory = onlineStoreFactory.orderAccessory(productType);
	}
	
	

}

