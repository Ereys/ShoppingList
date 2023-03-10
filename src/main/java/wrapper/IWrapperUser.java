package wrapper;

import java.util.List;

import models.User;

public interface IWrapperUser extends DaoInterface<User, String>{
	
	public User logInIfPasswordAndUsernameCorrect(String username, String pwd);

	@Override
	default List<User> findAllById(String id) {return null;}
	@Override
	default void delete(String id) {}
}
