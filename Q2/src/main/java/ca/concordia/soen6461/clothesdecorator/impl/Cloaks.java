package ca.concordia.soen6461.clothesdecorator.impl;

import ca.concordia.soen6461.characterclasses.ICharacter;
import ca.concordia.soen6461.clothesdecorator.IClothes;

public class Cloaks extends ClothesDecorator implements IClothes{

	public Cloaks(ICharacter character, String cloaks) {
		super(((ICharacter) character));
		System.out.println(cloaks+" is worn.");
	}

	@Override
	public int getStrength() {
		return super.getStrength()+4;
	}

	@Override
	public int getDexterity() {
		return super.getDexterity()+4;
	}

	@Override
	public int getConstitution() {
		return super.getConstitution()+4;
	}

	@Override
	public int getIntelligence() {
		return super.getIntelligence()+4;
	}

	@Override
	public int getWisdom() {
		return super.getWisdom()+4;
	}

	@Override
	public int getCharisma() {
		return super.getCharisma()+4;
	}
}
