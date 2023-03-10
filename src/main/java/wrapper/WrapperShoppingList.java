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
	

	public List<ShoppingList> findAllByUsername(String id) {
		try {
			String response = rqst.get(BaseUrl.BASE_URL_SHOPPINGLIST + "/search/byUsername?name=" + id);
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
	public ShoppingList find(Long id) {
		try {
			String response = rqst.get(BaseUrl.BASE_URL_SHOPPINGLIST + Long.toString(id));
			if(response == null) {
				throw new IllegalArgumentException();
			}
			return objMapper.readValue(response, ShoppingList.class);
		}catch(Exception e) {
				System.err.println(e);
				return null;
			}
	}

	@Override
	public ShoppingList update(Long id, ShoppingList objectUpdated) {
		return objectUpdated;
		// TODO Auto-generated method stub
		
	}

	@Override
	public ShoppingList create(ShoppingList newObject) {
		try {			
			String response = rqst.post(BaseUrl.BASE_URL_SHOPPINGLIST, objMapper.writeValueAsString(newObject));
			if(response == null) {
				throw new IllegalArgumentException();
			}
			return objMapper.readValue(response, ShoppingList.class);
		}catch(Exception e) {
				System.err.println(e);
				return null;
		}
		
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		
	}
}
