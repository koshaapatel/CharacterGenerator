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
	
	@Override
	public int getStrength() {
		return 1;
	}

	@Override
	public int getDexterity() {
		return 1;
	}

	@Override
	public int getConstitution() {
		return 1;
	}

	@Override
	public int getIntelligence() {
		return 1;
	}

	@Override
	public int getWisdom() {
		return 1;
	}

	@Override
	public int getCharisma() {
		return 1;
	}

}
