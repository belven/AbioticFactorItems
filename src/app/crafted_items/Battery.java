package app.crafted_items;

import app.basic_items.Coil;
import app.basic_items.Item;
import app.basic_items.Metal;

public class Battery extends Item {

	public Battery() {
		super("Battery");
		recipie.put(new Coil(), 1);
		recipie.put(new EnergyBrick(), 1);
		recipie.put(new Metal(), 2);
	}
}
