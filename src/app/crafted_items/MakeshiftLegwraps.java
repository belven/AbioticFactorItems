package app.crafted_items;

import app.basic_items.DuctTape;
import app.basic_items.Item;
import app.basic_items.Magazines;

public class MakeshiftLegwraps extends Item {

	public MakeshiftLegwraps() {
		super("Makeshift Legwraps");
		recipie.put(new DuctTape(), 6);
		recipie.put(new Magazines(), 6);
	}
}
