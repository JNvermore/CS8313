
public abstract class SmartPhone {
	String name;
	String storeName;
	String address;
	String payment;
	
	void welcome() {
		System.out.println("Welcome to " + storeName);
	}
	
	void process() {
		System.out.println("We are processing your order of " + name);
	}
	
	void setAddress(String address) {
		this.address = address;
		System.out.println("Your input Address is: " + address);
	}
	
	void setPayment(String payment) {
		this.payment = payment;
		System.out.println("Your selected payment is: " + payment);
	}
	
	void finish() {
		System.out.println("Thank you for your order!");
	}
	
	public String getModel() {
		return name;
	}
}
