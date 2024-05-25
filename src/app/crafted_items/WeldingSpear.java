package app.crafted_items;

import app.basic_items.Coil;
import app.basic_items.Item;
import app.basic_items.Rebar;

public class WeldingSpear extends Item {

	public WeldingSpear() {
		super("Welding Spear");
		recipie.put(new Coil(), 2);
		recipie.put(new EnergyBrick(), 1);
		recipie.put(new Rebar(), 2);
		recipie.put(new ReinforcedHose(), 2);
	}
}
