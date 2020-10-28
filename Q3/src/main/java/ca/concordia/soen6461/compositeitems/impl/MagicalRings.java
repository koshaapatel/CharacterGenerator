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
	
}
