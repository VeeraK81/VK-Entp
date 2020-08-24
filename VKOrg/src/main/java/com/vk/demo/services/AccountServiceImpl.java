package com.vk.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vk.demo.dao.AccountDao;
import com.vk.demo.entities.Account;

@Service
public class AccountServiceImpl implements AccountService {
	
	@Autowired
	private AccountDao accountDao;
	
	public List<Account> getAllAccount(){
		return (List<Account>) accountDao.getAllAccount();
	}

}
