package com.vk.demo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.vk.demo.entities.User;
import com.vk.demo.repositories.UserRespository;

@Service
public class CustomUserDetailsService implements UserDetailsService {

	@Autowired
	private UserRespository userRepository;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

		User user = userRepository.findByUsername(username);
		CustomUserDetails customUserDetails = null;
		
		if(user != null){
			
			customUserDetails = new CustomUserDetails();
			customUserDetails.setUser(user);
			
		}else {
			throw new UsernameNotFoundException("User not exist");
		}
		
		return customUserDetails;
	}

	
}
