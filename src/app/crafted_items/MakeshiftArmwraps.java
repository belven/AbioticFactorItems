package app.crafted_items;

import app.basic_items.Books;
import app.basic_items.DuctTape;
import app.basic_items.Item;
import app.basic_items.Magazines;

public class MakeshiftArmwraps extends Item {

	public MakeshiftArmwraps() {
		super("Makeshift Armwraps");
		recipie.put(new DuctTape(), 6);
		recipie.put(new Magazines(), 6);
		recipie.put(new Books(), 2);
	}
}
