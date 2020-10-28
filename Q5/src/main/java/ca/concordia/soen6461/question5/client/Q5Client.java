/* (c) Copyright 2020 and following years, Yann-Gaël Guéhéneuc,
 * Concordia University.
 * 
 * Use and copying of this software and preparation of derivative works
 * based upon this software are permitted. Any copy of this software or
 * of any derivative work must include the above copyright notice of
 * the author, this paragraph and the one after it.
 * 
 * This software is made available AS IS, and THE AUTHOR DISCLAIMS
 * ALL WARRANTIES, EXPRESS OR IMPLIED, INCLUDING WITHOUT LIMITATION THE
 * IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR
 * PURPOSE, AND NOT WITHSTANDING ANY OTHER PROVISION CONTAINED HEREIN,
 * ANY LIABILITY FOR DAMAGES RESULTING FROM THE SOFTWARE OR ITS USE IS
 * EXPRESSLY DISCLAIMED, WHETHER ARISING IN CONTRACT, TORT (INCLUDING
 * NEGLIGENCE) OR STRICT LIABILITY, EVEN IF THE AUTHOR IS ADVISED OF THE
 * POSSIBILITY OF SUCH DAMAGES.
 * 
 * All Rights Reserved.
 */
package ca.concordia.soen6461.question5.client;

import java.util.Scanner;
import ca.concordia.soen6461.abilityclasses.ICharisma;
import ca.concordia.soen6461.abilityclasses.IConstitution;
import ca.concordia.soen6461.abilityclasses.IDexterity;
import ca.concordia.soen6461.abilityclasses.IIntelligence;
import ca.concordia.soen6461.abilityclasses.IStrength;
import ca.concordia.soen6461.abilityclasses.IWisdom;
import ca.concordia.soen6461.characterclasses.ICharacter;
import ca.concordia.soen6461.characterclasses.impl.Character;
import ca.concordia.soen6461.characterclasses.impl.Factory;
import ca.concordia.soen6461.clothesdecorator.impl.Armours;
import ca.concordia.soen6461.clothesdecorator.impl.Boots;
import ca.concordia.soen6461.clothesdecorator.impl.Cloaks;
import ca.concordia.soen6461.clothesdecorator.impl.Hats;
import ca.concordia.soen6461.clothesdecorator.impl.Helmets;
import ca.concordia.soen6461.compositeitems.IItem;
import ca.concordia.soen6461.compositeitems.IPower;

public class Q5Client {
	public static void main(final String[] args) {
		Scanner scanner = new Scanner(System.in);
		Factory.getInstance();

		String answer = new String();
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

		System.out.println("\nQUESTION 2");
		System.out.println("Let's put some clothes on:");

		ranger=ranger.setClothes(ranger);
		System.out.println("Boots: 3");
		System.out.println("Hat: 2");
		System.out.println("Cloak: 4");
		System.out.println("Helmet: 10");
		System.out.println("Armour: 15");
		System.out.println("Updated strength of character by wearing clothes:" + ((ICharacter) ranger).getStrength());
		
		System.out.println("\nQUESTION 3 & 4");
		IItem satchel = Factory.getItemHolder("satchel");
		IItem box = Factory.getItemHolder("box");
		IItem food = Factory.getItem("food");
		IItem book = Factory.getItem("book");
		IItem goldring = Factory.getItem("gold ring");
		IItem magicalring = Factory.getItem("magical ring");

		//these two items won't be added to satchels
		System.out.println("Adding items into satchel composite");
		satchel.addItem(goldring);
		satchel.addItem(magicalring);
		//these two items will be added to satchels
		satchel.addItem(food);
		satchel.addItem(book);
		
		System.out.println("\nAdding items into box composite");
		box.addItem(goldring);
		box.addItem(magicalring);
		
		//ranger is adding satchel and box of IItem
		ranger.addItem(satchel);
		ranger.addItem(box);
		
		System.out.println("\nCharacter showing possessed items:");
		ranger.showItems();
		
		
		System.out.println("\nPowers being added to power composite");
		IPower power=Factory.getPowerHolder("power");
		IPower spell=Factory.getPower("spell");
		IPower infravision=Factory.getPower("infravision");
		power.addPower(spell);
		power.addPower(infravision);
		
		ranger.addPower(power);
		System.out.println("\nCharacter showing powers possessed:");
		ranger.showAllPowers();
		
		System.out.println("\nQUESTION 5");
		// decorated objects' strength
		System.out.println("Updated strength of character by wearing clothes:" + ((ICharacter) ranger).getStrength());
		System.out.println("\nCarrying followed items will increase character's all the ability score by:");
		System.out.println("Book: 2");
		System.out.println("Food: 1");
		System.out.println("Gold ring: 3");
		System.out.println("Magical ring: 5");
		System.out.println("\nPowers will increase character's ability score by:");
		System.out.println("Spell: 10");
		System.out.println("Summon: 5");
		System.out.println("Infravision: 5");
		System.out.println("\nFinal strength of character by wearing clothes, possessing items and powers:");
		System.out.println(ranger.getIncreasedStrength()+((ICharacter) ranger).getStrength());
	
	}
}