
public abstract class SmartPhoneStore {
	
	public SmartPhone orderSmartPhone(String model, String address, String payment) {
		SmartPhone smartPhone;
		smartPhone = createOrder(model);
		smartPhone.welcome();
		smartPhone.process();
		smartPhone.setAddress(address);
		smartPhone.setPayment(payment);
		smartPhone.finish();
		return smartPhone;
	}
	
	abstract SmartPhone createOrder(String type);
}
