package com.learning.CompleteRestCourse.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.learning.CompleteRestCourse.dao.UserDao;
import com.learning.CompleteRestCourse.models.User;

@Service
public class UserService {
	
	@Autowired
	UserDao userDao;

	public List<User> getAllUsers() {
		return userDao.getAllUsers();
	}

	public User getUserById(Long id) {
		return userDao.findById(id);
	}

	public User saveUser(User user) {
		return userDao.save(user);
	}

}
