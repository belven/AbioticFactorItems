package app.crafted_items;

import app.basic_items.Item;
import app.basic_items.Metal;

public class Screws extends Item {
	public Screws() {
		super("Screws");
		recipie.put(new Metal(), 2);
	}
}