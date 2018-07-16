package com.example.demo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.demo.entity.User;

public interface UserRepository extends MongoRepository<User, Long>{
	
//	@Query("select u from User u where u.name like %?1%")
//	List<User> findUsersNameLike(String name);
	
	User findByName(String name);
	
	User findByEmail(String email);
	
	User findByNameIgnoreCase(String name);
	
	

}
