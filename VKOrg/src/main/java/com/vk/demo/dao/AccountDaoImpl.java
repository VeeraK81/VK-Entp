package com.vk.demo.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.vk.demo.entities.Account;
import com.vk.demo.repositories.AccountRepository;

@Component
public class AccountDaoImpl implements AccountDao {
	
	@Autowired
	private AccountRepository accountRepository;
	
	public List<Account> getAllAccount(){
		return (List<Account>) accountRepository.findAll();
	}


}
