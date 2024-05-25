package app.crafted_items;

import app.basic_items.Item;
import app.basic_items.Metal;
import app.basic_items.MetalPipe;
import app.basic_items.Oil;

public class Chopinator extends Item {

	public Chopinator() {
		super("Chopinator");
		recipie.put(new MetalPipe(), 1);
		recipie.put(new Metal(), 4);
		recipie.put(new EnergyBrick(), 1);
		recipie.put(new Oil(), 1);
	}
}
