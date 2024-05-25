package app.crafted_items;

import app.basic_items.DuctTape;
import app.basic_items.Item;
import app.basic_items.MetalPipe;
import app.basic_items.PowerSupplyUnit;

public class CraftingBench extends Item {
	public CraftingBench() {
		super("Crafting Bench");
		recipie.put(new DuctTape(), 4);
		recipie.put(new PowerSupplyUnit(), 1);
		recipie.put(new MetalPipe(), 2);
	}
}