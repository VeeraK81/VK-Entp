package com.vk.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vk.demo.entities.User;

public interface UserRespository extends JpaRepository<User, Integer>{

	User findByUsername(String username);

	
	
}
