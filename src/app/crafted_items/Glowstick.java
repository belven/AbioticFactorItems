package app.crafted_items;

import app.basic_items.BioScrap;
import app.basic_items.Item;

public class Glowstick extends Item {
	public Glowstick() {
		super("Glowstick");
		recipie.put(new TestTube(), 1);
		recipie.put(new BioScrap(), 1);
	}
}