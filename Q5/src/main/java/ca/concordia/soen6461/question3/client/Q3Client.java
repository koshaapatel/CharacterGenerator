package ca.concordia.soen6461.question3.client;

import ca.concordia.soen6461.compositeitems.IItem;
import ca.concordia.soen6461.compositeitems.IPower;
import ca.concordia.soen6461.compositeitems.impl.Factory;

public class Q3Client {

	public static void main(String[] args) {

		IItem satchel = Factory.getItemHolder("satchel");
		IItem food = Factory.getItem("food");
		IItem book = Factory.getItem("book");
		IItem goldring = Factory.getItem("gold ring");
		IItem magicalring = Factory.getItem("magical ring");

		//these two items won't be added to satchels
		System.out.println("Adding items into satchel composite");
		satchel.addItem(goldring);
		satchel.addItem(magicalring);

		//these two items will be added to satchels
		satchel.addItem(food);
		satchel.addItem(book);
		
		//individual object showing its content
		System.out.println("\nIndividual object showing its content");
		food.showItems();
		book.showItems();

		
		//composite object showing its content
		System.out.println("\nComposite object showing its content");
		satchel.showItems();
		
		//food class is leaf node, hence we cant additems for it
		try {
			food.addItem(book);
		}
		catch(Exception e) {
			System.out.println(e);
		}
		
		IPower power=Factory.getPowerHolder("power");
		IPower spell=Factory.getPower("spell");
		IPower infravision=Factory.getPower("infravision");
		power.addPower(spell);
		power.addPower(infravision);
		
		power.showAllPowers();
	
	}
}