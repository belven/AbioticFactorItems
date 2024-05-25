package app.crafted_items;

import app.basic_items.HighvisVest;
import app.basic_items.Item;
import app.basic_items.Rebar;
import app.basic_items.SteelCable;

public class ForgeChestplate extends Item {

	public ForgeChestplate() {
		super("Forge Chestplate");
		recipie.put(new HighvisVest(), 1);
		recipie.put(new SteelCable(), 2);
		recipie.put(new Rebar(), 2);
	}
}
