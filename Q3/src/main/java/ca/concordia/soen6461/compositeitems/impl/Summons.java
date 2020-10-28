package ca.concordia.soen6461.compositeitems.impl;

import ca.concordia.soen6461.compositeitems.IPower;

public class Summons implements IPower {

	String summonname=null;
	public Summons(String summonname) {
		this.summonname=summonname;
	}
	@Override
	public void showAllPowers() {
		System.out.println(this.summonname);
	}

	@Override
	public void addPower(IPower power) {
		throw new UnsupportedOperationException();
		
	}

	@Override
	public void removePower(IPower power) {
		throw new UnsupportedOperationException();
	}

	@Override
	public String getTypeName() {
		// TODO Auto-generated method stub
		return this.summonname;
	}

}
