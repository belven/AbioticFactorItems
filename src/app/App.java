package app;

import java.util.HashMap;

import app.basic_items.Hammer;
import app.basic_items.Item;
import app.basic_items.LeadChestplate;
import app.basic_items.Pot;
import app.basic_items.PowerCell;
import app.basic_items.SecurityBackpack;
import app.basic_items.TechScrap;
import app.crafted_items.Battery;
import app.crafted_items.Chopinator;
import app.crafted_items.CraftingBench;
import app.crafted_items.EnergyBrick;
import app.crafted_items.ForgeChestplate;
import app.crafted_items.ForgeGreaves;
import app.crafted_items.ForgeHelmet;
import app.crafted_items.ForgePauldrons;
import app.crafted_items.HeaterShield;
import app.crafted_items.KeypadHackerT1;
import app.crafted_items.KeypadHackerT2;
import app.crafted_items.MakeshiftSpear;
import app.crafted_items.PlasticShield;
import app.crafted_items.PlugStrip;
import app.crafted_items.PortableStove;
import app.crafted_items.RepairSalvageStation;
import app.crafted_items.Scrapshot;
import app.crafted_items.ScrapshotAmmo;
import app.crafted_items.SoupBowl;
import app.crafted_items.TestTube;
import app.crafted_items.TramStationKey;
import app.crafted_items.Vacuum;
import app.crafted_items.WeldingSpear;

public class App {

	public static HashMap<Item, Integer> full_items_list = new HashMap<>();
	public static Integer fontsize = 15;
	public static String html = "<html><p style=\"font-size: " + fontsize + ";font-family:calibri;>\"";

	static {
		HashMap<Item, Integer> map = new HashMap<>();
		AddToMap(map, new CraftingBench());
		AddToMap(map, new EnergyBrick());
		AddToMap(map, new PlasticShield());
		AddItems("Starting Items", map);
	}

	static {
		HashMap<Item, Integer> map = new HashMap<>();
		AddToMap(map, new MakeshiftSpear());
		AddToMap(map, new Vacuum());
		AddToMap(map, new LeadChestplate());
		AddToMap(map, new TestTube());
		AddItems("Weapons", map);
	}

	static {
		HashMap<Item, Integer> map = new HashMap<>();
		AddToMap(map, new SecurityBackpack());
		AddToMap(map, new Hammer());
		AddToMap(map, new Battery());
		AddToMap(map, new PlugStrip());
		AddItems("Base", map);
	}

	static {
		HashMap<Item, Integer> map = new HashMap<>();
		AddToMap(map, new Chopinator());
		AddToMap(map, new EnergyBrick());
		AddToMap(map, new Pot());
		AddToMap(map, new TechScrap(), 10);
		AddItems("Security Bots + Food", map);
	}

	static {
		HashMap<Item, Integer> map = new HashMap<>();
		AddToMap(map, new RepairSalvageStation());
		AddToMap(map, new SoupBowl());
		AddItems("Post Security Bots", map);
	}

	static {
		HashMap<Item, Integer> map = new HashMap<>();
		AddToMap(map, new KeypadHackerT1());
		AddItems("Hacking Items", map);
	}

	static {
		HashMap<Item, Integer> map = new HashMap<>();
		AddToMap(map, new KeypadHackerT2());
		AddToMap(map, new TramStationKey());
		AddToMap(map, new PowerCell()); // There's some already there
		AddToMap(map, new PortableStove());
		AddItems("Manurfacturing Items", map);
	}

	static {
		HashMap<Item, Integer> map = new HashMap<>();
		AddToMap(map, new WeldingSpear());
		AddToMap(map, new ForgeChestplate());
		AddToMap(map, new ForgeHelmet());
		AddToMap(map, new ForgePauldrons());
		AddToMap(map, new ForgeGreaves());
		AddToMap(map, new Scrapshot());
		AddToMap(map, new ScrapshotAmmo(), 3); // 4x each
		AddToMap(map, new HeaterShield()); // 4x each
		
		
		AddItems("T2 Weapons and Armour", map);
	}

	public static void AddToMap(HashMap<Item, Integer> map, Item item) {
		AddToMap(map, item, 1);
	}

	public static void AddToMap(HashMap<Item, Integer> map, Item item, Integer amount) {
		map.put(item, amount);
	}

	public static void main(String[] args) {
		// OutputList("All Items (Only Basic Items)", new HashMap<Item, Integer>(),
		// full_items_list, true);

		html += "</p></html>";

		MainFrame frame = new MainFrame(html);
		frame.setVisible(true);
	}

	public static void OutputList(String title, HashMap<Item, Integer> items, HashMap<Item, Integer> section_items_list, boolean only_basic) {
		// System.out.println(title);
		// System.out.println();

		String items_string = items.keySet().toString().replace("[", "").replace("]", "");

		html += "<b>" + title + "</b><br>" + items_string + "<br><br>";

		// int column = 0;

		for (Item item : section_items_list.keySet()) {
			boolean is_basic = item.recipie.isEmpty();
			String basic_text = !only_basic && is_basic ? " - Basic" : "";

			if (!only_basic || is_basic) {
				String amount_text = "";
				int amount = section_items_list.get(item);

				// if (amount > 1) {
				amount_text = "<b>" + amount + "</b> - ";
				// }

				String full_text = amount_text + item + basic_text;
				// System.out.println(full_text);
				// String line_break = column % 2 == 0 ? "<br>" : ", ";
				html += full_text + "<br>";
			}

			// column++;
		}

		html += "<br>";
		// System.out.println();
	}

	public static void AddItems(String title, HashMap<Item, Integer> items) {
		HashMap<Item, Integer> complete_items_list = new HashMap<>();
		for (Item item : items.keySet()) {
			for (int i = 0; i < items.get(item); i++) {
				AddItems(item, complete_items_list);
			}
		}

		OutputList(title, items, complete_items_list, true);
	}

	public static void AddItems(Item item, HashMap<Item, Integer> complete_items_list) {
		int current_amount = 0;

		if (!item.recipie.isEmpty()) {
			for (Item item_component : item.recipie.keySet()) {
				for (int i = 0; i < item.recipie.get(item_component); i++) {
					AddItems(item_component, complete_items_list);
				}
			}
		}

		if (complete_items_list.containsKey(item)) {
			current_amount = complete_items_list.get(item);
		}

		complete_items_list.put(item, current_amount + 1);
		current_amount = 0;

		if (full_items_list.containsKey(item)) {
			current_amount = full_items_list.get(item);
		}

		full_items_list.put(item, current_amount + 1);
	}

}
