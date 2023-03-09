package wrapper;

import models.User;

public interface IWrapperUser extends DaoInterface<User, Long>{
	
	public User logInIfPasswordAndUsernameCorrect(String username, String pwd);

}
