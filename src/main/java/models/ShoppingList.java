package models;

import java.util.HashMap;

public class ShoppingList {
	
	private HashMap<Article, Integer> list;
	private String name;
	
	public ShoppingList(String _name) {
		this.name = _name;
		this.list = new <Article, Integer>HashMap();
	}
	
	public void addArticle(Article newArticle, int quantity) {
		this.list.put(newArticle, quantity);
	}
	
	public void delArticle(String articleName) {
		this.list.remove(this.getArticleByName(articleName));
	}
	
	public void updArticl(String name, Article articleUpdated) {
		this.list.put(articleUpdated, this.list.remove(this.getArticleByName(name)));
	}
	
	public void updArticleQtt(String name, int qtt) {
		this.list.put(this.getArticleByName(name), qtt);
	}
	
	public Article getArticleByName(String name) {
		for(HashMap.Entry<Article, Integer> m : this.list.entrySet()) {
			if(m.getKey().getName().equals(name)) return m.getKey();
		}
		throw new IllegalArgumentException("Article not found");
	}

	public String getName() {
		return name;
	}	
	
}
