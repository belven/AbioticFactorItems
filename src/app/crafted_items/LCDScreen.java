package app.crafted_items;

import app.basic_items.Item;
import app.basic_items.TechScrap;

public class LCDScreen extends Item {
	public LCDScreen() {
		super("LCD Screen");
		recipie.put(new ComputationBrick(), 1);
		recipie.put(new Glowstick(), 1);
		recipie.put(new TechScrap(), 3);
		recipie.put(new Screws(), 1);
	}
}