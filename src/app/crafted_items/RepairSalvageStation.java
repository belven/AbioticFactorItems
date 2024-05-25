package app.crafted_items;

import app.basic_items.Anvil;
import app.basic_items.Coil;
import app.basic_items.DuctTape;
import app.basic_items.Item;
import app.basic_items.MetalPipe;

public class RepairSalvageStation extends Item {
	public RepairSalvageStation() {
		super("Repair and Salvage Station");
		recipie.put(new DuctTape(), 6);
		recipie.put(new Coil(), 2);
		recipie.put(new Anvil(), 1);
		recipie.put(new MetalPipe(), 2);
	}
}