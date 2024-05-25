package app.crafted_items;

import app.basic_items.Item;
import app.basic_items.PaperScrap;

public class ScrapshotAmmo extends Item {

	public ScrapshotAmmo() {
		super("Battery");
		recipie.put(new Screws(), 1);
		recipie.put(new PaperScrap(), 20);
	}
}
