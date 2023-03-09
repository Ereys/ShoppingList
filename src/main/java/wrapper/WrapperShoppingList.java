package webservices;

import java.util.List;

import models.ShoppingList;
import models.User;
import webservices.BaseUrl;
import webservices.WebServiceManager;

/**
 * Class to convert json to Java object
 * @author pierre
 *
 */
public class WrapperShoppingList implements DaoInterface<ShoppingList>{
	
	

	@Override
	public List<ShoppingList> getAll() {
		WebServiceManager.getInstance().setUrl(BaseUrl.BASE_URL_SHOPPINGLIST + "shoppingLists/");
		String response = WebServiceManager.getInstance().get();
		return null;
	}

	@Override
	public ShoppingList get(long id) {
		WebServiceManager.getInstance().setUrl(BaseUrl.BASE_URL_USERS + "shoppingsLists/" + id);
		String response = WebServiceManager.getInstance().get();
		return null;
	}

	@Override
	public void update(long id, ShoppingList objectUpdated) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void create(ShoppingList newObject) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(long id) {
		// TODO Auto-generated method stub
		
	}
	
	
}
