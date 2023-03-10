package models;

import java.util.ArrayList;


/**
 * Class represent a local storage of user 
 * @author Awat
 *
 */
public class UserList {
	
	private static UserList instanceUserList = null;
	
	private ArrayList<User> listOfUsers = new ArrayList<>();
	
	private UserList() {
		this.listOfUsers.add(new User("admin", "admin"));
	};
	
	/**
	 * Get instance of the userlist, singleton
	 * @return instance of UserList
	 */
	
	public static UserList getInstanceUserList() {
		if(instanceUserList == null) instanceUserList = new UserList();
		return instanceUserList;
	}
	
	/**
	 * Get a user by his name
	 */
	
	public User getUserByName(String name) {
		for(User user: this.listOfUsers) {
			if(user.getUsername().equals(name)) return user;
		}
		throw new IllegalArgumentException("User not found");
	}
	
	
	/**
	 * Add a user in the userList
	 * @param newUser to add
	 */
	public void addUser(User newUser) {
		this.listOfUsers.add(newUser);
	}
	
	/**
	 * Check if the username and password are related to something in the userList, if true, return the user connected
	 * @param username
	 * @param password
	 * @return the user connected
	 */
	
	public User authentification(String username, String password) {
		if(this.getUserByName(username).checkPassword(password)) {
			return this.getUserByName(username);
		}
		throw new IllegalArgumentException("Authentifcation not correct");
	}
	
}
