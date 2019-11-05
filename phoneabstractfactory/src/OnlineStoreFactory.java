
public interface OnlineStoreFactory {
	public Tablet orderTablet(String tabletModel);
	public Watch orderWatch(String watchModel);
	public Computer orderComputer(String computerModel);
	public Accessory orderAccessory(String accessoryModel);
	
}
