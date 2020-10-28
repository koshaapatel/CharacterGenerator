package ca.concordia.soen6461.question2.client;

import ca.concordia.soen6461.abilityclasses.ICharisma;
import ca.concordia.soen6461.abilityclasses.IConstitution;
import ca.concordia.soen6461.abilityclasses.IDexterity;
import ca.concordia.soen6461.abilityclasses.IIntelligence;
import ca.concordia.soen6461.abilityclasses.IStrength;
import ca.concordia.soen6461.abilityclasses.IWisdom;
import ca.concordia.soen6461.characterclasses.ICharacter;
import ca.concordia.soen6461.characterclasses.impl.Character;
import ca.concordia.soen6461.characterclasses.impl.Factory;

public class Q2Client {
	
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
		
		System.out.println("\nQUESTION 2");
		System.out.println("Let's put some clothes on:");

		ranger = ranger.setClothes(ranger);
		System.out.println("Wearing follwed items will increase character's abilitiy score by:");
		System.out.println("Boots: 3");
		System.out.println("Hat: 2");
		System.out.println("Cloak: 4");
		System.out.println("Helmet: 10");
		System.out.println("Armour: 15");
		
		//decorated object's strength
		System.out.println("Updated strength of character by wearing clothes:" + ((ICharacter) ranger).getStrength());

	}
}
