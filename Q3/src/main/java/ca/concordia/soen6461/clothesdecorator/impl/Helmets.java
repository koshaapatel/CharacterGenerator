package ca.concordia.soen6461.clothesdecorator.impl;

import ca.concordia.soen6461.characterclasses.ICharacter;
import ca.concordia.soen6461.clothesdecorator.IClothes;

public class Helmets extends ClothesDecorator implements IClothes{

	public Helmets(ICharacter character, String helmets) {
		super(((ICharacter) character));
		System.out.println(helmets+" is worn.");
	}

	@Override
	public int getStrength() {
		return super.getStrength()+10;
	}

	@Override
	public int getDexterity() {
		return super.getDexterity()+10;
	}

	@Override
	public int getConstitution() {
		return super.getConstitution()+10;
	}

	@Override
	public int getIntelligence() {
		return super.getIntelligence()+10;
	}

	@Override
	public int getWisdom() {
		return super.getWisdom()+10;
	}

	@Override
	public int getCharisma() {
		return super.getCharisma()+10;
	}
}
