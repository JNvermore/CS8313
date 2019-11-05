
public class WatchProduct extends Product {

	OnlineStoreFactory onlineStoreFactory;

	public WatchProduct(OnlineStoreFactory onlineStoreFactory) {
		this.onlineStoreFactory = onlineStoreFactory;
	}



	@Override
	void prepare() {
		System.out.println("Prepareing " + productType);
		watch = onlineStoreFactory.orderWatch(productType);
	}

}
