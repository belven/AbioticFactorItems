package app.crafted_items;

import app.basic_items.CaseFan;
import app.basic_items.Coil;
import app.basic_items.Item;
import app.basic_items.Oil;
import app.basic_items.PressureGauge;

public class Heater extends Item {

	public Heater() {
		super("Heater");
		recipie.put(new Coil(), 3);
		recipie.put(new CaseFan(), 4);
		recipie.put(new PressureGauge(), 1);
		recipie.put(new Oil(), 1);
	}
}
