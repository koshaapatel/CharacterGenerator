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

}
