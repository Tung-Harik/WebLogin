package Project.Service;

import Project.User.User;

public interface UserService {
	
	User login(String username, String password);
	User get (String username);
}
