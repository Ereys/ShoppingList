package models;
import java.time.*;

import com.fasterxml.jackson.annotation.JsonProperty;


public class User {
	
	@JsonProperty("id")
	private long idClient;
	@JsonProperty("username")
	private String username;
	@JsonProperty("email")
	private String email;
	@JsonProperty("password")
	private String password;
	@JsonProperty("registerDate")
	private String registerDate;
	
	
	public User() {
		super();
	};
	
	
	public User(String username, String email, String password) {
		super();
		this.username = username;
		this.email = email;
		this.password = password;
	}

	public User(String username, String email, String password, String registerDate) {
		super();
		this.username = username;
		this.email = email;
		this.password = password;
		this.registerDate = registerDate;
	}

	public User(long idClient, String username, String email, String password, String registerDate) {
		super();
		this.idClient = idClient;
		this.username = username;
		this.email = email;
		this.password = password;
		this.registerDate = registerDate;
	}
	
	public long getIdClient() {
		return idClient;
	}
	public void setIdClient(long idClient) {
		this.idClient = idClient;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getRegisterDate() {
		return registerDate;
	}
	public void setRegisterDate(String registerDate) {
		this.registerDate = registerDate;
	}

	@Override
	public String toString() {
		return "User [idClient=" + idClient + ", username=" + username + ", email=" + email + ", password=" + password
				+ ", registerDate=" + registerDate + "]";
	}
}

