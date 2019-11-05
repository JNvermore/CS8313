
public class SamsungSmartPhoneStore extends SmartPhoneStore{
	
	SmartPhone createOrder(String model) {
		if (model.equals("GalaxyNote7")) {
			return new GalaxyNote7();
		} else if (model.equals("GalaxyS7Edge")) {
			return new GalaxyS7Edge();
		} else {
			return null;
		}
	}
	
}
