package wrapper;

import java.util.List;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import models.User;
import webservices.BaseUrl;
import webservices.RequestHandler;
import webservices.WebServiceManager;

public class WrapperUser implements IWrapperUser{
	
	private ObjectMapper objMapper;
	private RequestHandler rqst;
	
	public WrapperUser() {
		this.objMapper = new ObjectMapper();
		this.rqst = new RequestHandler();
	}
	
	
	@Override
	public List<User> getAll() {
		try {
		String response = rqst.get(BaseUrl.BASE_URL_USERS);
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
	public User get(Long id) {
		try {
			String response = rqst.get(BaseUrl.BASE_URL_USERS + Long.toString(id));
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
	public User logInIfPasswordAndUsernameCorrect(String username, String pwd) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public User update(Long id, User objectUpdated) {
		return null;
		
	}

	@Override
	public User create(User newObject) {
		try {			
			String response = rqst.post(BaseUrl.BASE_URL_USERS, objMapper.writeValueAsString(newObject));
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
	public void delete(Long id) {
		// TODO Auto-generated method stub
		
	}
}
