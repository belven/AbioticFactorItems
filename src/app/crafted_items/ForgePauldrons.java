package app.crafted_items;

import app.basic_items.BlacksmithingGloves;
import app.basic_items.Item;
import app.basic_items.Rebar;

public class ForgePauldrons extends Item {

	public ForgePauldrons() {
		super("Forge Pauldrons");
		recipie.put(new BlacksmithingGloves(), 1);
		recipie.put(new Screws(), 4);
		recipie.put(new Rebar(), 2);
	}
}
