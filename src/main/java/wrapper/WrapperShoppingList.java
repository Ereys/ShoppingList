package wrapper;

import java.util.List;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import models.ShoppingList;
import models.User;
import webservices.BaseUrl;
import webservices.RequestHandler;
import webservices.WebServiceManager;

/**
 * Class to convert json to Java object
 * @author pierre
 *
 */
public class WrapperShoppingList implements IWrapperShoppingList{
	
	private ObjectMapper objMapper;
	private RequestHandler rqst;
	
	public WrapperShoppingList() {
		this.objMapper = new ObjectMapper();
		this.rqst = new RequestHandler();
	}
	
	@Override
	public List<ShoppingList> getAll() {
		return null;
	}
	

	@Override
	public List<ShoppingList> findShoppingListsByUsername(String id) {
		try {
		String response = rqst.get(BaseUrl.BASE_URL_SHOPPINGLIST + "shoppingLists/");
		System.out.println("response : " + response);
		if(response == null) {
			throw new IllegalArgumentException();
		}
		List<ShoppingList> allShoppingList = objMapper.readValue(response, new TypeReference<List<ShoppingList>>() {});
		return allShoppingList;
		}catch(Exception e) {
			System.err.println(e);
			return null;
		}
	}

	@Override
	public ShoppingList get(Long id) {
		WebServiceManager.getInstance().setUrl(BaseUrl.BASE_URL_USERS + "shoppingsLists/" + id);
		String response = WebServiceManager.getInstance().get();
		return null;
	}

	@Override
	public void update(Long id, ShoppingList objectUpdated) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void create(ShoppingList newObject) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		
	}
	
	
}
