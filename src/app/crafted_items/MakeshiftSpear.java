package app.crafted_items;

import app.basic_items.DeskPhone;
import app.basic_items.DuctTape;
import app.basic_items.Item;
import app.basic_items.Knife;
import app.basic_items.StandingLamp;

public class MakeshiftSpear extends Item {

	public MakeshiftSpear() {
		super("Makeshift Spear");
		recipie.put(new StandingLamp(), 1);
		recipie.put(new DeskPhone(), 1);
		recipie.put(new Knife(), 1);
		recipie.put(new DuctTape(), 3);
	}
}
