
public abstract class Product {
	String productType;
	Tablet tablet;
	Watch watch;
	Computer computer;
	Accessory accessory;
	
	abstract void prepare();
	
	void setProductType(String productType) {
		this.productType = productType;
	}
	
	void process() {
		System.out.println("We are processing your order...");
	}
	
	String getProductType() {
		return productType;
	}
	
	void finish() {
		System.out.println("Thank you for your visit!");
	}
	
	
}
