package com.sitio.dao;

import com.sitio.entity.User;

public interface UserDAO {
	
	public User findUser(String username);
	
	public User loginUser(String username, String password);
}
