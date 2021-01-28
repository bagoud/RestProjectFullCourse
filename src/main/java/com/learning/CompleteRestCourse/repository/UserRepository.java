package com.learning.CompleteRestCourse.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.learning.CompleteRestCourse.models.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{

}
