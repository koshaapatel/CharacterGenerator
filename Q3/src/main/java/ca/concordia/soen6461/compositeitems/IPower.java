package ca.concordia.soen6461.compositeitems;

public interface IPower extends IMiscellaneous{
	
	public void showAllPowers();
	public void addPower(IPower power);
	public void removePower(IPower item);
	public String getTypeName();

}
