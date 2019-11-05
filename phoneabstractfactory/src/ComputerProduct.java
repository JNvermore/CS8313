
public class ComputerProduct extends Product {
	OnlineStoreFactory onlineStoreFactory;

	public ComputerProduct(OnlineStoreFactory onlineStoreFactory) {
		this.onlineStoreFactory = onlineStoreFactory;
	}



	@Override
	void prepare() {
		System.out.println("Prepareing " + productType);
		computer = onlineStoreFactory.orderComputer(productType);
	}
}
