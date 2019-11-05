
public class TabletProduct extends Product {

	OnlineStoreFactory onlineStoreFactory;

	public TabletProduct(OnlineStoreFactory onlineStoreFactory) {
		this.onlineStoreFactory = onlineStoreFactory;
	}



	@Override
	void prepare() {
		System.out.println("Prepareing " + productType);
		tablet = onlineStoreFactory.orderTablet(productType);
	}

}
