package app.crafted_items;

import app.basic_items.Item;
import app.basic_items.LeatherScrap;
import app.basic_items.Rebar;
import app.basic_items.WeldingMask;

public class ForgeHelmet extends Item {

	public ForgeHelmet() {
		super("Forge Helmet");
		recipie.put(new WeldingMask(), 1);
		recipie.put(new LeatherScrap(), 4);
		recipie.put(new Rebar(), 2);
		recipie.put(new ReinforcedHose(), 2);
	}
}
