package app.crafted_items;

import app.basic_items.Item;
import app.basic_items.MilitaryElectronics;

public class TramStationKey extends Item {

	public TramStationKey() {
		super("Tram Station Key");
		recipie.put(new Controller(), 1);
		recipie.put(new MilitaryElectronics(), 4);
	}
}
