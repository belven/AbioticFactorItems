package app.crafted_items;

import app.basic_items.Chain;
import app.basic_items.Item;
import app.basic_items.Rebar;

public class ForgeGreaves extends Item {

	public ForgeGreaves() {
		super("Forge Greaves");
		recipie.put(new Chain(), 4);
		recipie.put(new Rebar(), 2);
		recipie.put(new ReinforcedHose(), 2);
	}
}
