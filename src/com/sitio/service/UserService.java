package com.sitio.service;

import com.sitio.entity.User;


public interface UserService {
	
	public User findUser(String username);
	public User loginUser(String username, String password);
}
