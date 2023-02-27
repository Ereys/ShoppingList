package models;

import java.util.HashMap;


/**
 * Class which represent an shopping list
 * @author pierre julien
 *
 */
public class ShoppingList {
	
	private HashMap<Article, Integer> list;
	private String name;
	
	public ShoppingList(String _name) {
		this.name = _name;
		this.list = new <Article, Integer>HashMap();
	}
	
	/**
	 * Add article to the list
	 * @param name of the article
	 * @param quantity of the article
	 */
	
	public void addArticle(String name, int quantity) {
		this.list.put(new Article(name), quantity);
	}
	
	/**
	 * Delete article from the list
	 * @param articleName to delete
	 */
	
	public void delArticle(String articleName) {
		this.list.remove(this.getArticleByName(articleName));
	}
	
	/**
	 * Update article from the list 
	 * @param name of the article to update
	 * @param articleUpdated new article
	 */
	public void updArticl(String name, Article articleUpdated) {
		this.list.put(articleUpdated, this.list.remove(this.getArticleByName(name)));
	}
	
	/**
	 * Update the quantity of an article from the list
	 * @param name of the article
	 * @param qtt new quantity of the article
	 */
	public void updArticleQtt(String name, int qtt) {
		this.list.put(this.getArticleByName(name), qtt);
	}
	
	/**
	 * Get an article from the list by his name
	 * @param name of the article
	 * @return article
	 */
	
	public Article getArticleByName(String name) {
		for(HashMap.Entry<Article, Integer> m : this.list.entrySet()) {
			if(m.getKey().getName().equals(name)) return m.getKey();
		}
		throw new IllegalArgumentException("Article not found");
	}

	/**
	 * Get the name of the shopping list
	 * @return name of the shopping list
	 */
	public String getName() {
		return name;
	}

	/**
	 * Get the shopping list
	 * @return the shopping list
	 */
	public HashMap<Article, Integer> getList() {
		return list;
	}
}
