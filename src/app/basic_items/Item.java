package app.basic_items;

import java.util.HashMap;

public abstract class Item {
	public String name;
	public HashMap<Item, Integer> recipie = new HashMap<>();

	public Item(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return name;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Item) {
			return name == ((Item) obj).name;
		}

		return super.equals(obj);
	}

	@Override
	public int hashCode() {
		int hash = this.name.hashCode();
		return hash;
	}

}
