package com.app.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.app.pojos.User;

@Repository
public class UserDaoImpl implements UserDao {
	@Autowired
	private SessionFactory sf;

	public String registerUser(User u) {
		// TODO Auto-generated method stub
		Session currentSession = sf.getCurrentSession();

		currentSession.save(u);
		return "User added with id " + u.getUid();
	}

	public User loginUser(String uname, String pass) {
		// TODO Auto-generated method stub
		String jpql="Select u from User u where u.uname=:uname and u.pass=:pass";
		return sf.getCurrentSession().createQuery(jpql,User.class).setParameter("uname", uname).setParameter("pass", pass).getSingleResult();
	}

}
