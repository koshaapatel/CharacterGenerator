package ca.concordia.soen6461.clothesdecorator.impl;

import ca.concordia.soen6461.clothesdecorator.IClothes;
import ca.concordia.soen6461.characterclasses.ICharacter;


public class Boots extends ClothesDecorator implements IClothes {
	
	public Boots(ICharacter character, String boots) {
		super(((ICharacter) character));
		System.out.println(boots+" are worn.");
	}

	@Override
	public int getStrength() {
		return super.getStrength()+3;
	}

	@Override
	public int getDexterity() {
		return super.getDexterity()+3;
	}

	@Override
	public int getConstitution() {
		return super.getConstitution()+3;
	}

	@Override
	public int getIntelligence() {
		return super.getIntelligence()+3;
	}

	@Override
	public int getWisdom() {
		return super.getWisdom()+3;
	}

	@Override
	public int getCharisma() {
		return super.getCharisma()+3;
	}
}
