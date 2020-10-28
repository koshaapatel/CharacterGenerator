package ca.concordia.soen6461.compositeitems;

import ca.concordia.soen6461.characterclasses.ICharacter;

public interface IPower extends IMiscellaneous, ICharacter{
	
	public void showAllPowers();
	public void addPower(IPower power);
	public void removePower(IPower item);
	public String getTypeName();

}
