package ca.concordia.soen6461.characterclasses.impl;

import ca.concordia.soen6461.abilityclasses.ICharisma;
import ca.concordia.soen6461.abilityclasses.IConstitution;
import ca.concordia.soen6461.abilityclasses.IDexterity;
import ca.concordia.soen6461.abilityclasses.IIntelligence;
import ca.concordia.soen6461.abilityclasses.IStrength;
import ca.concordia.soen6461.abilityclasses.IWisdom;
import ca.concordia.soen6461.characterclasses.IBarbarian;

public class Barbarian extends Character implements IBarbarian {
	
	public Barbarian(IStrength strength, IDexterity dexterity, IConstitution constitution, IIntelligence intelligence,
			IWisdom wisdom, ICharisma charisma) {
		this.charactername="Barbarian";
		this.strength = strength;
		this.dexterity = dexterity;
		this.constitution = constitution;
		this.intelligence = intelligence;
		this.wisdom = wisdom;
		this.charisma = charisma;
		System.out.println("*****************Player:"+ charactername+"*****************");
		System.out.println("All abilities are set");
	}

}
