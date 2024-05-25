package app.crafted_items;

import app.basic_items.Item;

public class KeypadHackerT1 extends Item {

	public KeypadHackerT1() {
		super("Keypad Hacker T1");
		recipie.put(new Controller(), 1);
		recipie.put(new LCDScreen(), 1);
		recipie.put(new InfraredEmitter(), 1);
	}
}
