package app.crafted_items;

import app.basic_items.DeskPhone;
import app.basic_items.Item;
import app.basic_items.Keyboard;

public class Controller extends Item {

	public Controller() {
		super("Controller");
		recipie.put(new ComputationBrick(), 1);
		recipie.put(new Keyboard(), 2);
		recipie.put(new DeskPhone(), 2);
		recipie.put(new Screws(), 1);
	}
}
