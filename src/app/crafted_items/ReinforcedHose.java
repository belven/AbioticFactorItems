package app.crafted_items;

import app.basic_items.Hose;
import app.basic_items.Item;
import app.basic_items.SteelCable;

public class ReinforcedHose extends Item {

	public ReinforcedHose() {
		super("Reinforced Hose");
		recipie.put(new Screws(), 1);
		recipie.put(new Hose(), 1);
		recipie.put(new SteelCable(), 1);
	}
}
