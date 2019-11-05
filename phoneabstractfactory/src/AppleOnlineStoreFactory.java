
public class AppleOnlineStoreFactory implements OnlineStoreFactory{
	public Tablet orderTablet(String tabletModel) {
		if (tabletModel.equals("IPadPro")) {
			return new IPadPro();
		} else if (tabletModel.equals("IPadAir2")) {
			return new IPadAir2();
		} else if (tabletModel.equals("IPadMini4")) {
			return new IPadMini4();
		} else {
			return null;
		}
	}
	
	public Watch orderWatch(String watchModel) {
		if (watchModel.equals("AppleWatchSeries2")) {
			return new AppleWatchSeries2();
		} else if (watchModel.equals("AppleWatchNikePlus")) {
			return new AppleWatchNikePlus();
		} else {
			return null;
		}
	}
	
	public Computer orderComputer(String computerModel) {
		if (computerModel.equals("MacBook")) {
			return new MacBook();
		} else {
			return null;
		}
	}
	
	public Accessory orderAccessory(String accessoryModel) {
		if (accessoryModel.equals("AirPod")) {
			return new AirPod();
		} else if (accessoryModel.equals("BeatsHeadphone")) {
			return new BeatsHeadphone();
		} else {
			return null;
		}
	}
}
