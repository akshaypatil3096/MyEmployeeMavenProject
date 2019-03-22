package com.app.services;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.dao.UserDao;
import com.app.pojos.User;

@Service("user_service_dao")
@Transactional
public class UserServiceImpl implements UserService {
	@Autowired
	private UserDao dao;
	
	public String registerUser(User u) {
		// TODO Auto-generated method stub
		return dao.registerUser(u);
	}

	public User loginUser(String uname, String pass) {
		// TODO Auto-generated method stub
		return dao.loginUser(uname, pass);
	}

}
