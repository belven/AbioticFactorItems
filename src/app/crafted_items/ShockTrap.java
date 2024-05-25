package app.crafted_items;

import app.basic_items.Coil;
import app.basic_items.Item;
import app.basic_items.Stapler;

public class ShockTrap extends Item {

	public ShockTrap() {
		super("Shock Trap");
		recipie.put(new Coil(), 1);
		recipie.put(new EnergyBrick(), 1);
		recipie.put(new Stapler(), 1);
	}
}
