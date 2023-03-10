package models;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;


/**
 * Class which represent an shopping list
 * @author pierre julien
 *
 */
public class ShoppingList {
	
	private List<Article> list;
	private String name;
	private Long idAuthor;
	
	public ShoppingList(String _name) {
		this.name = _name;
		this.list = new ArrayList<Article>();
	}

	public List<Article> getListArticle() {
		return list;
	}
	
	
}
