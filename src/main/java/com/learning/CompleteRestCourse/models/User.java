package com.learning.CompleteRestCourse.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class User {
	
	@Id
	@GeneratedValue
	private Long Id;

	private String name;
	
	private int age;
	
	public User() {
		super();
	}

	public User(Long id, String name, int age) {
		super();
		Id = id;
		this.name = name;
		this.age = age;
	}

	public Long getId() {
		return Id;
	}

	public void setId(Long id) {
		Id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

}
