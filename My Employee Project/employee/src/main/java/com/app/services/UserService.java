package com.app.services;

import com.app.pojos.User;

public interface UserService {
	String registerUser(User u);
	User loginUser(String uname,String pass);
}
