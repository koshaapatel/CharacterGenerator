package ca.concordia.soen6461.compositeitems.impl;

import java.util.ArrayList;

import ca.concordia.soen6461.compositeitems.IItem;
import ca.concordia.soen6461.compositeitems.ISmallItem;

public class CompositeBox implements ISmallItem {

	public String boxname = null;
	public ArrayList<IItem> boxitems;

	public CompositeBox(String boxname) {
		this.boxname = boxname;
		boxitems=new ArrayList<>();
	}

	@Override
	public void showItems() {
		for(int i=0; i<boxitems.size(); i++) {
			this.boxitems.get(i).showItems();
		}
	}

	@Override
	public void addItem(IItem item) {
		if(item instanceof ISmallItem) {
			this.boxitems.add(((ISmallItem) item));
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

	@Override
	public int getStrength() {
		int temp=0;
		for(int i=0; i<this.boxitems.size(); i++) {
			temp+=this.boxitems.get(i).getStrength();
		}
		return temp;
	}

	@Override
	public int getDexterity() {
		int temp=0;
		for(int i=0; i<this.boxitems.size(); i++) {
			temp+=this.boxitems.get(i).getDexterity();
		}
		return temp;
	}

	@Override
	public int getConstitution() {
		int temp=0;
		for(int i=0; i<this.boxitems.size(); i++) {
			temp+=this.boxitems.get(i).getConstitution();
		}
		return temp;
	}

	@Override
	public int getIntelligence() {
		int temp=0;
		for(int i=0; i<this.boxitems.size(); i++) {
			temp+=this.boxitems.get(i).getIntelligence();
		}
		return temp;
	}

	@Override
	public int getWisdom() {
		int temp=0;
		for(int i=0; i<this.boxitems.size(); i++) {
			temp+=this.boxitems.get(i).getWisdom();
		}
		return temp;
	}

	@Override
	public int getCharisma() {
		int temp=0;
		for(int i=0; i<boxitems.size(); i++) {
			temp+=this.boxitems.get(i).getCharisma();
		}
		return temp;
	}

}
