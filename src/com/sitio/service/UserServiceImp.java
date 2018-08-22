package com.sitio.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sitio.dao.UserDAO;
import com.sitio.entity.User;

@Service
public class UserServiceImp implements UserService {

	@Autowired
	private UserDAO userDao;

	@Override @Transactional
	public User findUser(String username) {
		// TODO Auto-generated method stub
		return userDao.findUser(username);
	}

	@Override @Transactional
	public User loginUser(String username, String password) {
		// TODO Auto-generated method stub
		return userDao.loginUser(username, password);
	}
	
}
