
public class SamsungOnlineStoreFactory implements OnlineStoreFactory {

	@Override
	public Tablet orderTablet(String tabletModel) {
		if (tabletModel.equals("GalaxyTabProS")) {
			return new GalaxyTabProS();
		} else if (tabletModel.equals("GalaxyTabS2")) {
			return new GalaxyTabS2();
		} else {
			return null;
		}
	}

	@Override
	public Watch orderWatch(String watchModel) {
		if (watchModel.equals("GearS3")) {
			return new GearS3();
		} else if (watchModel.equals("GearS2")) {
			return new GearS2();
		} else {
			return null;
		}
	}

	@Override
	public Computer orderComputer(String computerModel) {
		if (computerModel.equals("Notebook")) {
			return new Notebook();
		} else {
			return null;
		}
	}

	@Override
	public Accessory orderAccessory(String accessoryModel) {
		if (accessoryModel.equals("KeyboardCover")) {
			return new KeyboardCover();
		} else if (accessoryModel.equals("Adapter")) {
			return new Adapter();
		} else {
			return null; 
		}
	}
	
}
