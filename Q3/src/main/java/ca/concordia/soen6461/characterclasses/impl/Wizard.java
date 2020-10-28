package ca.concordia.soen6461.characterclasses.impl;

import ca.concordia.soen6461.abilityclasses.ICharisma;
import ca.concordia.soen6461.abilityclasses.IConstitution;
import ca.concordia.soen6461.abilityclasses.IDexterity;
import ca.concordia.soen6461.abilityclasses.IIntelligence;
import ca.concordia.soen6461.abilityclasses.IStrength;
import ca.concordia.soen6461.abilityclasses.IWisdom;
import ca.concordia.soen6461.characterclasses.IWizard;

public class Wizard extends Character implements IWizard {
	
	public Wizard(IStrength strength, IDexterity dexterity, IConstitution constitution, IIntelligence intelligence,
			IWisdom wisdom, ICharisma charisma) {
		this.charactername="Wizard";
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
