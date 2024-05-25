package app.crafted_items;

import app.basic_items.CaseFan;
import app.basic_items.CircuitBoard;
import app.basic_items.Item;
import app.basic_items.TechScrap;

public class ComputationBrick extends Item {

	public ComputationBrick() {
		super("Computation Brick");
		recipie.put(new SecurityBotCPU(), 1);
		recipie.put(new TechScrap(), 1);
		recipie.put(new CaseFan(), 1);
		recipie.put(new CircuitBoard(), 3);
	}
}
