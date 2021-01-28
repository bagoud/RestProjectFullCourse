package com.learning.CompleteRestCourse.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.learning.CompleteRestCourse.models.User;
import com.learning.CompleteRestCourse.repository.UserRepository;

@Repository
@Transactional
public class UserDao {
	
	@Autowired
	UserRepository repository;
	
	@Autowired
	EntityManager em;

	public List<User> getAllUsers() {
		return repository.findAll();
	}
	
	public User findById(Long id){
		return em.find(User.class, id);
	}
	
	public User save(User user) {
		if(user.getId() == null) {
			em.persist(user);
		} else {
			em.merge(user);
		}
		
		return user;
	}
	
	public void delete(Long id) {
		User user = em.find(User.class, id);
		em.remove(user);
	}

}
