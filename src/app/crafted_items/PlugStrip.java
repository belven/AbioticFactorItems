package app.crafted_items;

import app.basic_items.Coil;
import app.basic_items.Item;
import app.basic_items.Metal;
import app.basic_items.PowerSupplyUnit;

public class PlugStrip extends Item {

	public PlugStrip() {
		super("Plug Strip");
		recipie.put(new Coil(), 1);
		recipie.put(new PowerSupplyUnit(), 1);
		recipie.put(new Metal(), 2);
	}
}
