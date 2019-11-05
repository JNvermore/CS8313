
public class AppleSmartPhoneStore extends SmartPhoneStore{
	
	SmartPhone createOrder(String model) {
		if (model.equals("Iphone8")) {
			return new Iphone8();
		} else if (model.equals("Iphone7Plus")) {
			return new Iphone7Plus();
		} else if (model.equals("IphoneX")) {
			return new IphoneX();
		} else {
			return null;
		}
	}
}
