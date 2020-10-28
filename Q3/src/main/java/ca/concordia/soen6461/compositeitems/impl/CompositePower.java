package ca.concordia.soen6461.compositeitems.impl;

import java.util.ArrayList;

import ca.concordia.soen6461.compositeitems.IPower;

public class CompositePower implements IPower {

	public String powername = null;
	public ArrayList<IPower> powers;

	public CompositePower(String powername) {
		this.powername = powername;
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
			this.powers.add((IPower) power);
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
}
