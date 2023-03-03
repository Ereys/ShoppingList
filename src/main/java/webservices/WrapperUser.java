package webservices;

import java.util.List;

import models.User;

public class WrapperUser implements DaoInterface<User> {

	@Override
	public List<User> getAll() {
		WebServiceManager.getInstance().setUrl(BaseUrl.BASE_URL_USERS + "users/");
		String response = WebServiceManager.getInstance().get();
		return null;
	}

	@Override
	public User get(long id) {
		WebServiceManager.getInstance().setUrl(BaseUrl.BASE_URL_USERS + "users/" + id);
		String response = WebServiceManager.getInstance().get();
		return null;
	}

	@Override
	public void update(long id, User objectUpdated) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void create(User newObject) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(long id) {
		// TODO Auto-generated method stub
		
	}

	
	
}
