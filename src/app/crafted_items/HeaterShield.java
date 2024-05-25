package app.crafted_items;

import app.basic_items.Item;

public class HeaterShield extends Item {

	public HeaterShield() {
		super("Heater Shield");
		recipie.put(new Heater(), 1);
		recipie.put(new EnergyBrick(), 1);
		recipie.put(new Screws(), 2);
		recipie.put(new ReinforcedHose(), 1);
	}
}
