package ca.concordia.soen6461.client;

import ca.concordia.soen6461.abilityclasses.ICharisma;
import ca.concordia.soen6461.abilityclasses.IConstitution;
import ca.concordia.soen6461.abilityclasses.IDexterity;
import ca.concordia.soen6461.abilityclasses.IIntelligence;
import ca.concordia.soen6461.abilityclasses.IStrength;
import ca.concordia.soen6461.abilityclasses.IWisdom;
import ca.concordia.soen6461.characterclasses.impl.Character;
import ca.concordia.soen6461.characterclasses.impl.Factory;

public class Q1Client {
	public static void main(String args[]) {
		
		Factory.getInstance();
		IStrength strength = null;
		IDexterity dexterity = null;
		IConstitution constitution = null;
		IIntelligence intelligence = null;
		IWisdom wisdom = null;
		ICharisma charisma = null;
		Character ranger = null;

		strength = Factory.getStrength("burly");
		dexterity = Factory.getDexterity("slim");
		constitution = Factory.getConstitution("strong");
		intelligence = Factory.getIntelligence("inquisitive");
		wisdom = Factory.getWisdom("good judgement");
		charisma = Factory.getCharisma("confidence");

		System.out.println("QUESTION 1\n");
		ranger = Factory.getCharacter("ranger", strength, dexterity, constitution, intelligence, wisdom, charisma);

		ranger.setScore();
		ranger.getScore();
		strength = Factory.getStrength("fit");
		ranger.setStrength(strength, "fit");
		constitution = Factory.getConstitution("invincible");
		ranger.setConstitution(constitution, "invincible");

	}
}
