package models;

import java.util.ArrayList;

public class UserList {
	
	private static UserList instanceUserList = null;
	
	private ArrayList<User> listOfUsers = new ArrayList<>();
	
	private UserList() {
		this.listOfUsers.add(new User("admin", "admin"));
	};
	
	public static UserList getInstanceUserList() {
		if(instanceUserList == null) instanceUserList = new UserList();
		return instanceUserList;
	}
	
	public User getUserByName(String name) {
		for(User user: this.listOfUsers) {
			if(user.getUsername().equals(name)) return user;
		}
		throw new IllegalArgumentException("User not found");
	}
	
	public void addUser(User newUser) {
		this.listOfUsers.add(newUser);
	}
	
	public User authentification(String username, String password) {
		if(this.getUserByName(username).checkPassword(password)) {
			return this.getUserByName(username);
		}
		throw new IllegalArgumentException("Authentifcation not correct");
	}
	
}
