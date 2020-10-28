package ca.concordia.soen6461.compositeitems.impl;

import java.util.ArrayList;

import ca.concordia.soen6461.compositeitems.IBigItem;
import ca.concordia.soen6461.compositeitems.IItem;

public class CompositeSatchel implements IBigItem {

	public String satchelname = null;
	public ArrayList<IItem> satchelitems;

	public CompositeSatchel(String satchel) {
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

	@Override
	public int getStrength() {
		int temp=0;
		for(int i=0; i<this.satchelitems.size(); i++) {
			temp+=this.satchelitems.get(i).getStrength();
		}
		return temp;
	}

	@Override
	public int getDexterity() {
		int temp=0;
		for(int i=0; i<this.satchelitems.size(); i++) {
			temp+=this.satchelitems.get(i).getDexterity();
		}
		return temp;
	}

	@Override
	public int getConstitution() {
		int temp=0;
		for(int i=0; i<this.satchelitems.size(); i++) {
			temp+=this.satchelitems.get(i).getConstitution();
		}
		return temp;
	}

	@Override
	public int getIntelligence() {
		int temp=0;
		for(int i=0; i<this.satchelitems.size(); i++) {
			temp+=this.satchelitems.get(i).getIntelligence();
		}
		return temp;
	}

	@Override
	public int getWisdom() {
		int temp=0;
		for(int i=0; i<this.satchelitems.size(); i++) {
			temp+=this.satchelitems.get(i).getWisdom();
		}
		return temp;
	}

	@Override
	public int getCharisma() {
		int temp=0;
		for(int i=0; i<this.satchelitems.size(); i++) {
			temp+=this.satchelitems.get(i).getCharisma();
		}
		return temp;
	}

}
