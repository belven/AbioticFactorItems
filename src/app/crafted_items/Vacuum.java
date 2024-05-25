package app.crafted_items;

import app.basic_items.Item;
import app.basic_items.MetalPipe;
import app.basic_items.PressureGauge;
import app.basic_items.RawCarbuncle;

public class Vacuum extends Item {

	public Vacuum() {
		super("Vacuum");
		recipie.put(new EnergyBrick(), 1);
		recipie.put(new PressureGauge(), 1);
		recipie.put(new RawCarbuncle(), 1);
		recipie.put(new MetalPipe(), 2);
	}
}
