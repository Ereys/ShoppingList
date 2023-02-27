package models;

import java.util.ArrayList;

public class ShoppingListManager {
	
	private ArrayList<ShoppingList> shoppingList;
	
	public ShoppingListManager() {
		this.shoppingList = new ArrayList<ShoppingList>();
	}
	
	public ArrayList<ShoppingList> getShoppingLists() {
		return this.shoppingList;
	}
	
	public void addShoppingList(String name) {
		this.shoppingList.add(new ShoppingList(name));
	}
	
	public ShoppingList getShoppingListByName(String name) {
		for(ShoppingList item: this.shoppingList) {
			if(item.getName().equals(name)) return item;
		}
		throw new IllegalArgumentException("ShoppingList not found");
	}
	
	public void deleteShoppingList(String name) {
		this.shoppingList.remove( this.shoppingList.indexOf(this.getShoppingListByName(name)));
	}
}
