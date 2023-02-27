package models;

import java.util.ArrayList;

public class User {

	private String username;
	private String password;
	private ShoppingListManager listManager;


	private boolean active;

	public User(String username, String password) {
		this.username = username;
		this.password = password;
		this.listManager = new ShoppingListManager();
	}

	String getUsername() {
		return username;
	}

	String getPassword() {
		return password;
	}

	public boolean checkPassword(String passwordToTest) {
		return this.password.equals(passwordToTest);
	}

	public void desactivateAccount() {
		this.active = false;
	}

	public ShoppingListManager getListManager() {
		return listManager;
	}
}
