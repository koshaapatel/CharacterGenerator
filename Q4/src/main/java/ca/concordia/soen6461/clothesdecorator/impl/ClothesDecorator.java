package ca.concordia.soen6461.clothesdecorator.impl;

import ca.concordia.soen6461.characterclasses.ICharacter;
import ca.concordia.soen6461.characterclasses.impl.Character;

public abstract class ClothesDecorator extends Character{

	public ICharacter decoratedCharacter;

	public ClothesDecorator(ICharacter character) {
		this.decoratedCharacter=character;
	}

	public int getStrength() {
		return this.decoratedCharacter.getStrength();
	}

	public int getDexterity() {
		return this.decoratedCharacter.getDexterity();
	}

	public int getConstitution() {
		return this.decoratedCharacter.getConstitution();
	}

	public int getIntelligence() {
		return this.decoratedCharacter.getIntelligence();
	}

	public int getWisdom() {
		return this.decoratedCharacter.getWisdom();
	}

	public int getCharisma() {
		return this.decoratedCharacter.getCharisma();
	}

}
