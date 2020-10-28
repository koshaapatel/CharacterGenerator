package ca.concordia.soen6461.compositeitems;

public interface IItem extends IMiscellaneous {
	
	public void showItems();
	public void addItem(IItem item);
	public void removeItem(IItem item);
	public String getTypeName();
 
}
