package app.crafted_items;

import app.basic_items.GlassScrap;
import app.basic_items.Item;
import app.basic_items.Metal;
import app.basic_items.Stapler;

public class SoupBowl extends Item {
	public SoupBowl() {
		super("Soup Bowl");
		recipie.put(new TestTube(), 1);
		recipie.put(new GlassScrap(), 1);
		recipie.put(new Stapler(), 1);
		recipie.put(new Metal(), 1);
	}
}