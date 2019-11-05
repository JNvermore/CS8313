package abstractFactory.OSFactory;

import abstractFactory.Accessories.Accessories;
import abstractFactory.Computer.Computer;
import abstractFactory.Tablet.Tablet;
import abstractFactory.Watch.Watch;

public interface OSFactory {
	public Tablet orderTablet(String tabletModel);
	public Watch orderWatch(String watchModel);
	public Computer orderComputer(String computerModel);
	public Accessories orderAccessories(String accessoriesModel);
}
