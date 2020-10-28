package ca.concordia.soen6461.compositeitems;

import ca.concordia.soen6461.characterclasses.ICharacter;

public interface IItem extends IMiscellaneous, ICharacter {
	
	public void showItems();
	public void addItem(IItem item);
	public void removeItem(IItem item);
	public String getTypeName();
 
}
