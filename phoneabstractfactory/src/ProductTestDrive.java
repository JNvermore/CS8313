
public class ProductTestDrive {

	public static void main(String[] args) {
		
		OnlineStore appleOnlineStore = new AppleOnlineStore();
		OnlineStoreFactory appleOnlineStoreFactory = new AppleOnlineStoreFactory();
		
		Product product = appleOnlineStore.createOrder("tablet");
		System.out.println("You ordered a " + product.getProductType());
		Tablet tablet = appleOnlineStoreFactory.orderTablet("IPadPro");
		System.out.println("The specific tablet you ordered is: " + tablet.tabletItem());
		
		product = appleOnlineStore.createOrder("accessory");
		System.out.println("You ordered a " + product.getProductType());
		Accessory accessory = appleOnlineStoreFactory.orderAccessory("BeatsHeadphone");
		System.out.println("The specific tablet you ordered is: " 
		+ accessory.accessoryItem());
		
		System.out.println();
		
		OnlineStore samsungOnlineStore = new SamsungOnlineStore();
		OnlineStoreFactory samsungOnlineStoreFactory = new SamsungOnlineStoreFactory();
		
		 product = samsungOnlineStore.createOrder("tablet");
		System.out.println("You ordered a " + product.getProductType());
		tablet = samsungOnlineStoreFactory.orderTablet("GalaxyTabS2");
		System.out.println("The specific tablet you ordered is: " + tablet.tabletItem());
		
		product = samsungOnlineStore.createOrder("accessory");
		System.out.println("You ordered a " + product.getProductType());
		accessory = samsungOnlineStoreFactory.orderAccessory("KeyboardCover");
		System.out.println("The specific tablet you ordered is: " 
		+ accessory.accessoryItem());
		
		System.out.println();
		
		
	

	}

}
