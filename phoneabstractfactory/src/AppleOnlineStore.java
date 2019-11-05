
public class AppleOnlineStore extends OnlineStore {

	@Override
	protected Product createOrder(String productType) {
		Product product = null;
		OnlineStoreFactory onlineStoreFactory = new AppleOnlineStoreFactory();
		
		if (productType.equals("tablet")) {
			product = new TabletProduct(onlineStoreFactory);
			product.setProductType("Tablet from Apple Online Store");
		} else if (productType.equals("watch")) {
			product = new WatchProduct(onlineStoreFactory);
			product.setProductType("Watch from Apple Online Store");
		} else if (productType.equals("computer")) {
			product = new ComputerProduct(onlineStoreFactory);
			product.setProductType("Computer from Apple Online Store");
		} else if (productType.equals("accessory")) {
			product = new AccessoryProduct(onlineStoreFactory);
			product.setProductType("Accessory from Apple Online Store");
		}  
		return product;
	}

	
}
