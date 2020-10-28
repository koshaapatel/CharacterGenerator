package ca.concordia.soen6461.compositeitems.impl;

import java.util.ArrayList;

import ca.concordia.soen6461.compositeitems.IBigItem;
import ca.concordia.soen6461.compositeitems.IItem;

public class BoxComposite implements IBigItem {

	public String boxname = null;
	public ArrayList<IItem> boxitems;

	public BoxComposite(String boxname) {
		this.boxname = boxname;
		boxitems = new ArrayList<>();
	}

	@Override
	public void showItems() {
		for(int i=0; i<boxitems.size(); i++) {
			this.boxitems.get(i).showItems();
		}
	}

	@Override
	public void addItem(IItem item) {
		if(item instanceof IBigItem) {
			this.boxitems.add(((IBigItem) item));
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
		return this.boxname;
	}

}
