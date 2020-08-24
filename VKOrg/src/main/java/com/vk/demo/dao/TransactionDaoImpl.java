package com.vk.demo.dao;

import java.util.List;

import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;

import com.vk.demo.entities.Project;
import com.vk.demo.entities.Transaction;
import com.vk.demo.exception.IdNotFoundException;
import com.vk.demo.repositories.TransactionRepository;

@Component
public class TransactionDaoImpl implements TransactionDao {
	
	@Autowired
	private TransactionRepository transactionRepository;
	
	public List<Transaction> getAllTransaction(){
		return (List<Transaction>) transactionRepository.findAll();
	}

	@Override
	public Transaction getTransactionByID(Integer tId) {
		
		return transactionRepository.getOne(tId);
	}

	@Override
	public Transaction addTransaction(Transaction transaction) {
		return transactionRepository.save(transaction);
	}

	@Override
	public List<Transaction> findByTransactionAccountNo(String transactionaccountno) {
		return transactionRepository.findByTransactionAccountNo(transactionaccountno);
	}

	@Override
	public List<Transaction> findByTransactionId(Integer transactionid) {
		return transactionRepository.findByTransactionId(transactionid);
	}
	
	

}
