package com.learning.CompleteRestCourse.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.learning.CompleteRestCourse.exceptions.UserNotFoundException;
import com.learning.CompleteRestCourse.models.User;
import com.learning.CompleteRestCourse.service.UserService;

@RestController
public class UserController {
	
	@Autowired
	UserService userService;
	
	
	@RequestMapping(value="/users")
	public List<User> getAllUsers() {
		List<User> users = userService.getAllUsers();
		return users;
	}
	
	@RequestMapping(value="/users/{id}")
	public User getUserById(@PathVariable("id") Long id) {
		User user = userService.getUserById(id);
		if(user == null) {
			throw new UserNotFoundException("User with id: " + id + " not found!");
		}
		return user;
	}
	
	@RequestMapping(value="/users", method = RequestMethod.POST)
	public User saveUser(@RequestBody User user) {
		User newUser = userService.saveUser(user);
		return newUser;
	}
}
