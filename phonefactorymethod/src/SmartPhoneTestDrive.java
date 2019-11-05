
public class SmartPhoneTestDrive {

	public static void main(String[] args) {
		SmartPhoneStore appleSmartPhoneStore = new AppleSmartPhoneStore();
		SmartPhoneStore samsungSmartPhoneStore = new SamsungSmartPhoneStore();
		
		SmartPhone smartPhone = appleSmartPhoneStore.orderSmartPhone("Iphone7Plus", "123 Java Valley", "Visa");
		System.out.println("You ordered an " + smartPhone.getModel() + "\n");
		
		smartPhone = samsungSmartPhoneStore.orderSmartPhone("GalaxyNote7", "456 Java Valley", "Credit Card");
		System.out.println("You ordered a " + smartPhone.getModel() + "\n");

	}

}
