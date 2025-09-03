package Service;

import Dao.UserDao;
import Model.User;
import Dao.UserDaoImpl;

public class UserServiceImpl implements UserService{
	UserDao userDao = new UserDaoImpl();
	
	@Override
	public User login(String username, String password) {
		User user = this.findByUserName(username);
		 if (user != null && password.equals(user.getPassWord())) {
			 return user;
		 }
		 return null;
	}

	@Override
	public User findByUserName(String username) {
		return userDao.findByUserName(username);
	}
	
}
