package abstractFactory.Product;

import abstractFactory.Accessories.Accessories;
import abstractFactory.Computer.Computer;
import abstractFactory.Tablet.Tablet;
import abstractFactory.Watch.Watch;

public abstract class Product {
	
	String productType;
	Tablet tablet;
	Watch watch;
	Computer computer;
	Accessories accessories;
	
	abstract void prepare();
	
	void setProductType(String productType) {
		this.productType = productType;
	}
	
	String getProductType() {
		return productType;
	}
	
	void process() {
		System.out.println("Processing order.....");
	}
	
	void finish() {
		System.out.println("Your order has been placed.");
	}
}
