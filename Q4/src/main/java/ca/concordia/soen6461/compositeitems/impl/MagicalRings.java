package ca.concordia.soen6461.compositeitems.impl;

import ca.concordia.soen6461.compositeitems.IItem;
import ca.concordia.soen6461.compositeitems.ISmallItem;

public class MagicalRings implements ISmallItem{
	
	String magicringname=null;
	public MagicalRings(String magicringname) {
		this.magicringname=magicringname;
	}
	
	@Override
	public void showItems() {
		System.out.println(this.magicringname);
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
		return this.magicringname;
	}

	@Override
	public int getStrength() {
		return 5;
	}

	@Override
	public int getDexterity() {
		return 5;
	}

	@Override
	public int getConstitution() {
		return 5;
	}

	@Override
	public int getIntelligence() {
		return 5;
	}

	@Override
	public int getWisdom() {
		return 5;
	}

	@Override
	public int getCharisma() {
		return 5;
	}
	
}
