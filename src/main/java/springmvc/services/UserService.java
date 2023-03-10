package springmvc.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import springmvc.dao.UserDao;
import springmvc.models.User;

@Service
public class UserService {

	@Autowired
	private UserDao userDao;

	public void createUser(User user) {
		this.userDao.insert(user);
	}

}
