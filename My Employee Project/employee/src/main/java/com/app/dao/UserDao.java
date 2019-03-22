package com.app.dao;

import com.app.pojos.User;

public interface UserDao {
	String registerUser(User u);
	User loginUser(String un,String pass);
}
