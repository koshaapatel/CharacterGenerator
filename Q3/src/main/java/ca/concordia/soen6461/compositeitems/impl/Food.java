package ca.concordia.soen6461.compositeitems.impl;

import ca.concordia.soen6461.compositeitems.IBigItem;
import ca.concordia.soen6461.compositeitems.IItem;

public class Food implements IBigItem{

	String foodname=null;
	public Food(String foodname) {
		this.foodname=foodname;
	}
	
	@Override
	public void showItems() {
		System.out.println(this.foodname);
		
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
		return this.foodname;
	}

}
