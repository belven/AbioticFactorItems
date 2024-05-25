package app.crafted_items;

import app.basic_items.CaseFan;
import app.basic_items.CircuitBoard;
import app.basic_items.Item;
import app.basic_items.PowerSupplyUnit;
import app.basic_items.TechScrap;

public class EnergyBrick extends Item {
	public EnergyBrick() {
		super("Energy Brick");
		recipie.put(new CircuitBoard(), 1);
		recipie.put(new PowerSupplyUnit(), 1);
		recipie.put(new TechScrap(), 1);
		recipie.put(new CaseFan(), 1);
	}
}