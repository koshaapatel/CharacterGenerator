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
package ca.concordia.soen6461.characterclasses.impl;

import java.util.ArrayList;
import java.util.Scanner;

import ca.concordia.soen6461.abilityclasses.ICharisma;
import ca.concordia.soen6461.abilityclasses.IConstitution;
import ca.concordia.soen6461.abilityclasses.IDexterity;
import ca.concordia.soen6461.abilityclasses.IIntelligence;
import ca.concordia.soen6461.abilityclasses.IStrength;
import ca.concordia.soen6461.abilityclasses.IWisdom;
import ca.concordia.soen6461.characterclasses.ICharacter;

public class Character implements ICharacter{
	Scanner scanner = new Scanner(System.in);
	String charactername;
	IStrength strength;
	IDexterity dexterity;
	IConstitution constitution;
	IIntelligence intelligence;
	IWisdom wisdom;
	ICharisma charisma;

	int strengthScore;
	int dexterityScore;
	int constitutionScore;
	int intelligenceScore;
	int wisdomScore;
	int charismaScore;

	@Override
	public int getStrength() {
		return this.strengthScore;
	}

	@Override
	public int getDexterity() {
		return this.dexterityScore;
	}

	@Override
	public int getConstitution() {
		return this.constitutionScore;
	}

	@Override
	public int getIntelligence() {
		return this.intelligenceScore;
	}

	@Override
	public int getWisdom() {
		return this.wisdomScore;
	}

	@Override
	public int getCharisma() {
		return this.charismaScore;
	}

	public void setScore() {
		this.strengthScore = (int) (Math.random() * 18 + 3);
		this.dexterityScore = (int) (Math.random() * 18 + 3);
		this.constitutionScore = (int) (Math.random() * 18 + 3);
		this.intelligenceScore = (int) (Math.random() * 18 + 3);
		this.wisdomScore = (int) (Math.random() * 18 + 3);
		this.charismaScore = (int) (Math.random() * 18 + 3);
	}

	public void getScore() {
		System.out.println("******************Ability Scores******************");
		System.out.println("Strength score:" + this.strengthScore);
		System.out.println("Dexterity score:" + this.dexterityScore);
		System.out.println("Constitution score:" + this.constitutionScore);
		System.out.println("Intelligence score:" + this.intelligenceScore);
		System.out.println("Wisdom score:" + this.wisdomScore);
		System.out.println("Charisma score:" + this.charismaScore);
	}

	public void setStrength(IStrength strength, String strengthString) {
		this.strength = strength;
		System.out.println("******************Ability is changed******************");
		System.out.println(strengthString + " as strength is set");
	}

	public void setDexterity(IDexterity dexterity, String dexterityString) {
		this.dexterity = dexterity;
		System.out.println("******************Ability is changed******************");
		System.out.println(dexterityString + " as dexterity is set");
	}

	public void setConstitution(IConstitution constitution, String constitutionString) {
		this.constitution = constitution;
		System.out.println("******************Ability is changed******************");
		System.out.println(constitutionString + " as constitution is set");
	}

	public void setIntelligence(IIntelligence intelligence, String intelligenceString) {
		this.intelligence = intelligence;
		System.out.println("******************Ability is changed******************");
		System.out.println(intelligenceString + " as intelligence is set");
	}

	public void setWisdom(IWisdom wisdom, String wisdomString) {
		this.wisdom = wisdom;
		System.out.println("******************Ability is changed******************");
		System.out.println(wisdomString + " as wisdom is set");
	}

	public void setCharisma(ICharisma charisma, String charismaString) {
		this.charisma = charisma;
		System.out.println("******************Ability is changed******************");
		System.out.println(charismaString + " as strength is set");
	}

}