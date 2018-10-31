package com.dn.ex08.service;

import com.dn.ex08.dao.UserDao;
import com.dn.ex08.domain.User;

public class UserService {
	private UserDao userDao = new UserDao();
	
	public void add(User user) {
		userDao.add(user);
	}
}
