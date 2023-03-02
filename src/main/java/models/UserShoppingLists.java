 package models;

import java.util.ArrayList;


/**
 * This class represent all of the shoppings lists of an user
 * @author pierre
 *
 */


public class UserShoppingLists {
	
	private ArrayList<ShoppingList> shoppingList;
	
	public UserShoppingLists() {
		this.shoppingList = new ArrayList<ShoppingList>();
	}
	
	/**
	 * Get all the shopping list of an user
	 * @return all the shopping list of an user
	 */
	public ArrayList<ShoppingList> getShoppingLists() {
		return this.shoppingList;
	}
	
	/**
	 * Create a shopping list for the user
	 * @param name of the new shopping list
	 */
	public void addShoppingList(String name) {
		this.shoppingList.add(new ShoppingList(name));
	}
	
	/**
	 * Get the shopping list by a name
	 * @param name of the target shopping list
	 * @return the shopping list or an IllegalArgumentException if not found
	 */
	
	public ShoppingList getShoppingListByName(String name) {
		for(ShoppingList item: this.shoppingList) {
			if(item.getName().equals(name)) return item;
		}
		throw new IllegalArgumentException("ShoppingList not found");
	}
	
	/**
	 * Delete shopping list of a user
	 * @param name of the target shopping list to delete
	 */
	
	public void deleteShoppingList(String name) {
		this.shoppingList.remove( this.shoppingList.indexOf(this.getShoppingListByName(name)));
	}
}
