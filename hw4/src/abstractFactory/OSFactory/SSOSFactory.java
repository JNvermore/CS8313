package abstractFactory.OSFactory;

import abstractFactory.Accessories.*;
import abstractFactory.Computer.*;
import abstractFactory.Tablet.*;
import abstractFactory.Watch.*;

public class SSOSFactory implements OSFactory {

	@Override
	public Tablet orderTablet(String tabletModel) {
		// TODO Auto-generated method stub
		if(tabletModel.equals("GalaxyTabS")) {
			return new GalaxyTabS();
		}
		else if(tabletModel.equals("GalaxyBook")) {
			return new GalaxyBook();
		}
		else {
			return null;
		}
	}

	@Override
	public Watch orderWatch(String watchModel) {
		// TODO Auto-generated method stub
		if(watchModel.equals("GalaxyWatchActive2")){
			return new GalaxyWatchActive2();
		}
		else if(watchModel.equals("GalaxyFit")) {
			return new GalaxyFit();
		}
		return null;
	}

	@Override
	public Computer orderComputer(String computerModel) {
		// TODO Auto-generated method stub
		if(computerModel.equals("NoteBook")) {
			return new NoteBook();
		}
		else {
			return null;
		}
	}

	@Override
	public Accessories orderAccessories(String accessoriesModel) {
		// TODO Auto-generated method stub
		if(accessoriesModel.equals("KeyboardCover")) {
			return new KeyboardCover();
		}
		else if(accessoriesModel.equals("WirelessCharger")) {
			return new WirelessCharger();
		}
		else {
			return null;
		}
	}

}
