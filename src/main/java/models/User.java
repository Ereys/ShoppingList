package models;

import java.util.ArrayList;



/**
 * This class represent the user of the application
 * @author Awat
 *
 */
public class User {

	private String username;
	private String password;
	private UserShoppingLists listManager;


	private boolean active;

	public User(String username, String password) {
		this.username = username;
		this.password = password;
		this.listManager = new UserShoppingLists();
	}

	String getUsername() {
		return username;
	}

	String getPassword() {
		return password;
	}

	/**
	 * CHeck if the password of the user is right
	 * @param passwordToTest
	 * @return true or false
	 */
	public boolean checkPassword(String passwordToTest) {
		return this.password.equals(passwordToTest);
	}

	public void desactivateAccount() {
		this.active = false;
	}

	public UserShoppingLists getListManager() {
		return listManager;
	}
}
