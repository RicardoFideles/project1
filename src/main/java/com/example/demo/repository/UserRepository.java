package com.example.demo.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.demo.entity.User;

public interface UserRepository extends MongoRepository<User, Long>{
	
	List<User> findByNameLike(String name);
	
	User findByName(String name);
	
	User findByEmail(String email);
	
	User findByNameIgnoreCase(String name);
		
	

}
