package ca.concordia.soen6461.compositeitems.impl;

import ca.concordia.soen6461.compositeitems.IPower;

public class Spells implements IPower{

	String spellname=null;
	public Spells(String spellname) {
		this.spellname=spellname;
	}
	@Override
	public void showAllPowers() {
		System.out.println(this.spellname);
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
		return this.spellname;
	}
	@Override
	public int getStrength() {
		return 10;
	}
	@Override
	public int getDexterity() {
		return 10;
	}
	@Override
	public int getConstitution() {
		return 10;
	}
	@Override
	public int getIntelligence() {
		return 10;
	}
	@Override
	public int getWisdom() {
		return 10;
	}
	@Override
	public int getCharisma() {
		return 10;
	}

}
