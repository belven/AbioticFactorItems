package app.crafted_items;

import app.basic_items.Coil;
import app.basic_items.Item;
import app.basic_items.PowerCell;
import app.basic_items.Rebar;

public class Scrapshot extends Item {

	public Scrapshot() {
		super("Scrapshot");
		recipie.put(new Coil(), 2);
		recipie.put(new PowerCell(), 1);
		recipie.put(new Rebar(), 2);
	}
}
