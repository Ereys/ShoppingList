package wrapper;

import java.util.List;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import models.Article;
import models.ShoppingList;
import models.User;
import webservices.BaseUrl;
import webservices.RequestHandler;

public class WrapperArticle implements IWrapperArticle {
	
	private ObjectMapper objMapper;
	private User user;
	private RequestHandler rqst;
	
	public WrapperArticle() {
		this.objMapper = new ObjectMapper();
		this.rqst = new RequestHandler();
	}
	

	@Override
	public List<Article> findAllById(String id) {
		
		try {
		String response = rqst.get(BaseUrl.BASE_URL_SHOPPINGLIST + String.toString(id));
		System.out.println("response : " + response);
		if(response == null) {
			throw new IllegalArgumentException();
		}
		ShoppingList articleList = objMapper.readValue(response, ShoppingList.class);
		return articleList.getListArticle();
		}catch(Exception e) {
			System.err.println(e);
			return null;
		}
	}
	
	

	@Override
	public Article find(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Article update(String id, Article objectUpdated) {
		return objectUpdated;
		// TODO Auto-generated method stub
	}

	@Override
	public Article create(Article newObject) {
		return newObject;
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(String id) {
		// TODO Auto-generated method stub
		
	}
	
}
