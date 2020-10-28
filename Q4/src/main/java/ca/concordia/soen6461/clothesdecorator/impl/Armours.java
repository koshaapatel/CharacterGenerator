package ca.concordia.soen6461.clothesdecorator.impl;

import ca.concordia.soen6461.characterclasses.ICharacter;
import ca.concordia.soen6461.clothesdecorator.IClothes;

public class Armours extends ClothesDecorator implements IClothes {

	public Armours(ICharacter character, String armours) {
		super(((ICharacter) character));
		System.out.println(armours+" is worn.");
	}

	@Override
	public int getStrength() {
		return super.getStrength()+15;
	}

	@Override
	public int getDexterity() {
		return super.getDexterity()+15;
	}

	@Override
	public int getConstitution() {
		return super.getConstitution()+15;
	}

	@Override
	public int getIntelligence() {
		return super.getIntelligence()+15;
	}

	@Override
	public int getWisdom() {
		return super.getWisdom()+15;
	}

	@Override
	public int getCharisma() {
		return super.getCharisma()+15;
	}

}
