
public class SamsungOnlineStore extends OnlineStore{

	@Override
	protected Product createOrder(String productType) {
		Product product = null;
		OnlineStoreFactory onlineStoreFactory = new SamsungOnlineStoreFactory();
		if (productType.equals("tablet")) {
			product = new TabletProduct(onlineStoreFactory);
			product.setProductType("Tablet from Samsung Online Store");
		} else if (productType.equals("watch")) {
			product = new WatchProduct(onlineStoreFactory);
			product.setProductType("Watch from Samsung Online Store");
		} else if (productType.equals("computer")) {
			product = new ComputerProduct(onlineStoreFactory);
			product.setProductType("Computer from Samsung Online Store");
		} else if (productType.equals("accessory")) {
			product = new AccessoryProduct(onlineStoreFactory);
			product.setProductType("Accessory from Samsung Online Store");
		}  
		return product;
	}

}
