
public abstract class OnlineStore {
	
	public Product orderProduct(String productType) {
		Product product;
		product = createOrder(productType);
		return product;
	}
	abstract Product createOrder(String productType);
	
	
}
