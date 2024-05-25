package app.crafted_items;

import app.basic_items.Item;
import app.basic_items.MilitaryElectronics;
import app.basic_items.PowerCell;

public class KeypadHackerT2 extends Item {

	public KeypadHackerT2() {
		super("Keypad Hacker T2");
		
		// Remove the recipe for the first tier, as we always have one crafted before we can get teh second
		Item hackpad =	new KeypadHackerT1();
		hackpad.recipie.clear();
		
		recipie.put(hackpad, 1);
		recipie.put(new PowerCell(), 1);
		recipie.put(new ReinforcedHose(), 2);
		recipie.put(new MilitaryElectronics(), 4);
	}
}
