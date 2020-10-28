package ca.concordia.soen6461.compositeitems.impl;

import java.util.ArrayList;

import ca.concordia.soen6461.compositeitems.IPower;

public class CompositePower implements IPower {
	
	public String powername = null;
	public ArrayList<IPower> powers;

	public CompositePower(String power) {
		this.powername = power;
		powers = new ArrayList<>();
	}

	@Override
	public void showAllPowers() {
		for(int i=0; i<powers.size(); i++) {
			this.powers.get(i).showAllPowers();
		}
	}

	@Override
	public void addPower(IPower power) {
		if(power instanceof IPower) {
			this.powers.add(power);
			System.out.println(power.getTypeName() +" is added");
		}
		else {
			System.out.println("we cant add "+power.getTypeName());
		}
	}

	@Override
	public void removePower(IPower item) {

	}

	@Override
	public String getTypeName() {
		return this.powername;
	}

	@Override
	public int getStrength() {
		int temp=0;
		for(int i=0; i<this.powers.size(); i++) {
			temp+=this.powers.get(i).getStrength();
		}
		return temp;
	}

	@Override
	public int getDexterity() {
		int temp=0;
		for(int i=0; i<this.powers.size(); i++) {
			temp+=this.powers.get(i).getDexterity();
		}
		return temp;
	}

	@Override
	public int getConstitution() {
		int temp=0;
		for(int i=0; i<this.powers.size(); i++) {
			temp+=this.powers.get(i).getConstitution();
		}
		return temp;
	}

	@Override
	public int getIntelligence() {
		int temp=0;
		for(int i=0; i<this.powers.size(); i++) {
			temp+=this.powers.get(i).getIntelligence();
		}
		return temp;
	}

	@Override
	public int getWisdom() {
		int temp=0;
		for(int i=0; i<this.powers.size(); i++) {
			temp+=this.powers.get(i).getWisdom();
		}
		return temp;
	}

	@Override
	public int getCharisma() {
		int temp=0;
		for(int i=0; i<this.powers.size(); i++) {
			temp+=this.powers.get(i).getCharisma();
		}
		return temp;
	}

}
