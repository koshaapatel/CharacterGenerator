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



}
