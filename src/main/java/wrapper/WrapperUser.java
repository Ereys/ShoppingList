package wrapper;

import java.util.List;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import models.User;
import webservices.BaseUrl;
import webservices.RequestHandler;
import webservices.WebServiceManager;

public class WrapperUser implements DaoInterface<User> {
	
	private ObjectMapper objMapper;
	private User user;
	private RequestHandler rqst;
	
	public WrapperUser() {
		this.objMapper = new ObjectMapper();
		this.rqst = new RequestHandler();
	}
	
	
	@Override
	public List<User> getAll() {
		try {
		String response = rqst.get(BaseUrl.BASE_URL_USERS + "users/");
		System.out.println("response : " + response);
		if(response == null) {
			throw new IllegalArgumentException();
		}
		List<User> userList = objMapper.readValue(response, new TypeReference<List<User>>() {});
		return userList;
		}catch(Exception e) {
			System.err.println(e);
			return null;
		}
	}

	@Override
	public User get(long id) {
		try {
			String response = rqst.get(BaseUrl.BASE_URL_USERS + "users/" + Long.toString(id));
			if(response == null) {
				throw new IllegalArgumentException();
			}
			return objMapper.readValue(response, User.class);
		}catch(Exception e) {
				System.err.println(e);
				return null;
			}
	}

	@Override
	public void update(long id, User objectUpdated) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void create(User newObject) {
		try {			
			String response = rqst.post(BaseUrl.BASE_URL_USERS + "users/", objMapper.writeValueAsString(newObject));
			if(response == null) {
				throw new IllegalArgumentException();
			}
			System.out.println(response);
		}catch(Exception e) {
				System.err.println(e);
		}
	}

	@Override
	public void delete(long id) {
		// TODO Auto-generated method stub
		
	}
}
