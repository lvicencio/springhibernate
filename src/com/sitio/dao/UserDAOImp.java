package com.sitio.dao;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.sitio.entity.User;

@Repository
public class UserDAOImp implements UserDAO{

	@Autowired
	private SessionFactory sessionFactory;
	
	
	public User findUser(String username ) {

		return (User) sessionFactory.getCurrentSession().createQuery("From User WHERE username= :username")
				.setParameter("username", username)
				.uniqueResult();
	}
	
	
	
	public User loginUser(String username, String password) {
		User user = this.findUser(username);
		if (user != null && user.getPassword().equals(password)) {
			return user;
		}
		
		return null;
		
	}
}
