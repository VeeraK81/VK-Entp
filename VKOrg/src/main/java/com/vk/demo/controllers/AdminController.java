package com.vk.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.vk.demo.entities.User;
import com.vk.demo.repositories.UserRespository;

@RestController
@RequestMapping("/admin")
public class AdminController {
	
	@Autowired
	UserRespository userRepository;
	
	@Autowired
	private BCryptPasswordEncoder pwdEncoder;
	
	@PreAuthorize("hasAnyRole('ADMIN')")
	@RequestMapping(method = RequestMethod.POST, value = "/add-user", consumes = "application/json")
	public String addUserByAdmin(@RequestBody User user) throws Exception{
		
		String pwd = user.getPassword();
		String encryptPwd =  pwdEncoder.encode(pwd);
		user.setPassword(encryptPwd);
		System.out.println("User : " + user.toString());
		
		try {
			
			userRepository.save(user);
			return "Create a user successfully";
			
		} catch (Exception e) {
			throw new Exception(e.getMessage());
		}
		
	}
	
	@PreAuthorize("hasAnyRole('ADMIN')")
	@RequestMapping(method = RequestMethod.GET, value = "/users", produces = "application/json")
	public List<User> getUserByAdmin(){			
		return userRepository.findAll();
	}
	

}
