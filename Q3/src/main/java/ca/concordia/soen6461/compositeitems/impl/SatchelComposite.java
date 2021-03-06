package ca.concordia.soen6461.compositeitems.impl;

import java.util.ArrayList;

import ca.concordia.soen6461.compositeitems.IBigItem;
import ca.concordia.soen6461.compositeitems.IItem;

public class SatchelComposite implements IBigItem {

	public String satchelname = null;
	public ArrayList<IItem> satchelitems;

	public SatchelComposite(String satchel) {
		this.satchelname = satchel;
		satchelitems = new ArrayList<>();
	}

	@Override
	public void showItems() {
		for(int i=0; i<satchelitems.size(); i++) {
			this.satchelitems.get(i).showItems();
		}
	}

	@Override
	public void addItem(IItem item) {
		if(item instanceof IBigItem) {
			this.satchelitems.add(((IBigItem) item));
			System.out.println(item.getTypeName() +" is added");
		}
		else {
			System.out.println("we cant add "+item.getTypeName());
		}
	}

	@Override
	public void removeItem(IItem item) {
		
	}

	@Override
	public String getTypeName() {
		return this.satchelname;
	}

}
