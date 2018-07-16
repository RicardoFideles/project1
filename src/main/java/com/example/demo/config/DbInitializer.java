package com.example.demo.config;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

import com.example.demo.entity.User;
import com.example.demo.repository.UserRepository;

@Component
public class DbInitializer implements ApplicationListener<ContextRefreshedEvent>{
	
	@Autowired
	UserRepository userRepository;
	
	
	@Override
	public void onApplicationEvent(ContextRefreshedEvent arg0) {
		
		List<User> users = userRepository.findAll();
		System.out.println("----");
		System.out.println(users.isEmpty());
		System.out.println("----");
		
		if (users.isEmpty()) {
			createUser("demo1", "demo1@demo.com");
			createUser("demo2", "demo2@demo.com");
			createUser("demo3", "demo3@demo.com");
		}
//		List<User> lista = userRepository.findUsersNameLike("dem");
//		System.out.println(lista.size());
		
		User user = userRepository.findByNameIgnoreCase("jose");
		System.out.println(user.getName());
				
	}
	
	public void createUser(String name, String email) {
		User user = new User(name, email);
		userRepository.save(user);
	}

}
