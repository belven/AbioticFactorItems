package app.crafted_items;

import app.basic_items.CafeteriaTray;
import app.basic_items.ClothScrap;
import app.basic_items.DuctTape;
import app.basic_items.Item;

public class PlasticShield extends Item {

	public PlasticShield() {
		super("Plastic Shield");
		recipie.put(new DuctTape(), 2);
		recipie.put(new CafeteriaTray(), 1);
		recipie.put(new ClothScrap(), 1);
	}
}
