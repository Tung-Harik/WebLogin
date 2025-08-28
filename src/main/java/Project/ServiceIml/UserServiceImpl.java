package Project.ServiceIml;

import Project.Dao.UserDao;
import Project.DaoImpl.UserDaoImpl;
import Project.Service.UserService;
import Project.User.User;

public class UserServiceImpl implements UserService{

	UserDao userDao = new UserDaoImpl();
	@Override
	public User login(String username, String password) {
		User user = this.get(username);
		if (user != null && password.equals(user.getPassWord())) {
		return user;
		}
		return null;

	}

	@Override
	public User get(String username) {
		return userDao.get(username);
	}
	
	
}
