package models;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Class which represent an article
 * @author pierre
 *
 */
public class Article {
	
	@JsonProperty("name")
	private String name;
	@JsonProperty("quantity")
	private int quantity;
	
	public Article(String name, int quantity){
		this.name = name;
		this.quantity = quantity;
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}


	public int getQuantity() {
		return quantity;
	}


	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
}
