package app.crafted_items;

import app.basic_items.FryingPan;
import app.basic_items.Item;
import app.basic_items.Magazines;

public class MakeshiftHelmet extends Item {

	public MakeshiftHelmet() {
		super("Makeshift Helmet");
		recipie.put(new Screws(), 3);
		recipie.put(new Magazines(), 3);
		recipie.put(new FryingPan(), 1);
	}
}
