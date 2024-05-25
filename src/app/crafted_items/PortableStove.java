package app.crafted_items;

import app.basic_items.Coil;
import app.basic_items.Item;
import app.basic_items.Keyboard;
import app.basic_items.MetalPipe;
import app.basic_items.PlasticScrap;

public class PortableStove extends Item {

	public PortableStove() {
		super("Portable Stove");
		recipie.put(new Coil(), 2);
		recipie.put(new MetalPipe(), 4);
		recipie.put(new Keyboard(), 1);
		recipie.put(new PlasticScrap(), 3);
	}
}
