package abstractFactory.OSFactory;

import abstractFactory.Accessories.*;
import abstractFactory.Computer.*;
import abstractFactory.Tablet.*;
import abstractFactory.Watch.*;

public class AppleOSFactory implements OSFactory {
	@Override
	public Tablet orderTablet(String tabletModel) {
		// TODO Auto-generated method stub
		if(tabletModel.equals("IPadPro")) {
			return new IPadPro();
		}
		else if(tabletModel.equals("IPadAir")) {
			return new IPadAir();
		}
		else if(tabletModel.equals("IPadMini")) {
			return new IPadMini();
		}
		else {
			return null;
		}
	}

	@Override
	public Watch orderWatch(String watchModel) {
		// TODO Auto-generated method stub
		if(watchModel.equals("AppleWatch5")) {
			return new AppleWatch5();
		}
 	 	else if(watchModel.equals("AppleWatchHermes")) {
 	 		return new AppleWatchHermes();
 	 	}
 	 	else {
 	 		return null;
 	 	}
	}

	@Override
	public Computer orderComputer(String computerModel) {
		// TODO Auto-generated method stub
		if(computerModel.equals("MacBook")) {
			return new MacBook();
		}
		else {
			return null;
		}
	}

	@Override
	public Accessories orderAccessories(String accessoriesModel) {
		// TODO Auto-generated method stub
		if(accessoriesModel.equals("AirPods")) {
			return new AirPods();
		}
		else if(accessoriesModel.equals("ApplePencil")) {
			return new ApplePencil();
		}
		else {
			return null;
		}
	}
}
