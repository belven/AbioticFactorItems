package app.crafted_items;

import app.basic_items.GlassScrap;
import app.basic_items.Item;
import app.basic_items.Wood;

public class TestTube extends Item {
	public TestTube() {
		super("Test Tube");
		recipie.put(new Wood(), 1);
		recipie.put(new GlassScrap(), 1);
	}
}