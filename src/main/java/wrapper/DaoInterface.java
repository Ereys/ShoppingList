package wrapper;

import java.util.List;

import models.ShoppingList;

/**
 * CRUD method
 * @author pierre
 *
 * @param <T>
 */

public interface DaoInterface<T, ID> {

	
	/**
	 * Read 
	 * @param id TODO
	 */
	
	List<T> findAllById(ID id);
	T find(ID id);
	
	/**
	 * Update
	 */
	
	T update(ID id, T objectUpdated);
	
	/**
	 * Create
	 */
	
	T create(T newObject);
	
	/**
	 * Delete
	 */

	void delete(ID id);
	
}
