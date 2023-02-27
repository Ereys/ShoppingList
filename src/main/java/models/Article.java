package models;

/**
 * Class which represent an article
 * @author pierre
 *
 */
public class Article {
	
	private String name;
	
	public Article(String name) {
		this.name = name;
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
