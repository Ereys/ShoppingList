package wrapper;

import java.util.List;

import models.ShoppingList;
import models.User;

public interface IWrapperShoppingList extends DaoInterface<ShoppingList, Long>{	
	
	public List<ShoppingList> findShoppingListsByUsername(String id);
	
}
