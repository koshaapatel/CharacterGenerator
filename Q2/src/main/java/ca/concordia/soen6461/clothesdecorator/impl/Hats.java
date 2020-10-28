package ca.concordia.soen6461.clothesdecorator.impl;

import ca.concordia.soen6461.characterclasses.ICharacter;
import ca.concordia.soen6461.clothesdecorator.IClothes;

public class Hats extends ClothesDecorator implements IClothes {

	public Hats(ICharacter character, String hats) {
		super(((ICharacter) character));
		System.out.println(hats+" is worn.");
	}

	@Override
	public int getStrength() {
		return super.getStrength()+2;
	}

	@Override
	public int getDexterity() {
		return super.getDexterity()+2;
	}

	@Override
	public int getConstitution() {
		return super.getConstitution()+2;
	}

	@Override
	public int getIntelligence() {
		return super.getIntelligence()+2;
	}

	@Override
	public int getWisdom() {
		return super.getWisdom()+2;
	}

	@Override
	public int getCharisma() {
		return super.getCharisma()+2;
	}

}
