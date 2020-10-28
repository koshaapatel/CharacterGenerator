package ca.concordia.soen6461.compositeitems.impl;

import ca.concordia.soen6461.compositeitems.IItem;
import ca.concordia.soen6461.compositeitems.ISmallItem;

public class GoldRings implements ISmallItem {

	String ringname=null;
	public GoldRings(String ringname) {
		this.ringname=ringname;
	}
	
	@Override
	public void showItems() {
		System.out.println(this.ringname);
	}

	@Override
	public void addItem(IItem item) {
		throw new UnsupportedOperationException();
	}

	@Override
	public void removeItem(IItem item) {
		throw new UnsupportedOperationException();
		
	}

	@Override
	public String getTypeName() {
		return this.ringname;
	}

	@Override
	public int getStrength() {
		return 3;
	}

	@Override
	public int getDexterity() {
		return 3;
	}

	@Override
	public int getConstitution() {
		return 3;
	}

	@Override
	public int getIntelligence() {
		return 3;
	}

	@Override
	public int getWisdom() {
		return 3;
	}

	@Override
	public int getCharisma() {
		return 3;
	}



}
