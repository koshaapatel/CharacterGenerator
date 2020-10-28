package ca.concordia.soen6461.compositeitems.impl;

import ca.concordia.soen6461.compositeitems.IItem;
import ca.concordia.soen6461.compositeitems.IPower;

public class Factory {

	private static class FactoryUniqueInstanceHolder {
		private static Factory THE_UNIQUE_FACTORY = new Factory();
	}

	public static Factory getInstance() {
		return FactoryUniqueInstanceHolder.THE_UNIQUE_FACTORY;
	}

	public static IItem getItemHolder(String itemholder) {
		IItem item = null;
		switch (itemholder) {
		case "satchel":
			item = new SatchelComposite(itemholder);
			break;
		case "box":
			item = new BoxComposite(itemholder);
			break;
		default:
			break;
		}
		return item;
	}
	
	public static IItem getItem(String itemm) {
		IItem item = null;
		switch (itemm) {
		case "food":
			item = new Food(itemm);
			break;
		case "book":
			item = new Book(itemm);
			break;
		case "magical ring":
			item = new MagicalRings(itemm);
			break;
		case "gold ring":
			item = new GoldRings(itemm);
			break;
		default:
			break;
		}
		return item;
	}
	
	public static IPower getPowerHolder(String powerr) {
		IPower power = null;
		switch (powerr) {
		case "power":
			power = new CompositePower(powerr);
			break;
		default:
			break;
		}
		return power;
	}
	
	public static IPower getPower(String powerr) {
		IPower power = null;
		switch (powerr) {
		case "spell":
			power = new Spells(powerr);
			break;
		case "summon":
			power = new Summons(powerr);
			break;
		case "infravision":
			power = new Infravision(powerr);
			break;
		default:
			break;
		}
		return power;
	}

}
