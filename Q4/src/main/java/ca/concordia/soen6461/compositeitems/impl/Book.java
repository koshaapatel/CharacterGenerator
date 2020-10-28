package ca.concordia.soen6461.compositeitems.impl;

import ca.concordia.soen6461.compositeitems.IBigItem;
import ca.concordia.soen6461.compositeitems.IItem;

public class Book implements IBigItem{

	String bookname=null;
	public Book(String bookname) {
		this.bookname=bookname;
	}
	
	@Override
	public void showItems() {
		System.out.println(this.bookname);
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
		return this.bookname;
	}

	@Override
	public int getStrength() {
		return 2;
	}

	@Override
	public int getDexterity() {
		return 2;
	}

	@Override
	public int getConstitution() {
		return 2;
	}

	@Override
	public int getIntelligence() {
		return 2;
	}

	@Override
	public int getWisdom() {
		return 2;
	}

	@Override
	public int getCharisma() {
		return 2;
	}

}
