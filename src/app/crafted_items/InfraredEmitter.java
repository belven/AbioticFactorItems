package app.crafted_items;

import app.basic_items.CircuitBoard;
import app.basic_items.GlassScrap;
import app.basic_items.Item;

public class InfraredEmitter extends Item {

	public InfraredEmitter() {
		super("Infrared Emitter");
		recipie.put(new ComputationBrick(), 1);
		recipie.put(new CircuitBoard(), 1);
		recipie.put(new GlassScrap(), 2);
	}
}
