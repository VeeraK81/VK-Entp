package com.vk.demo.services;

import java.util.List;

import com.vk.demo.entities.Transaction;
import com.vk.demo.entities.TransactionByAccount;

public interface TransactionService {
	
	public List<Transaction> getAllTransaction();

	public Transaction getTransactionById(Integer tId);

	public Transaction addTransaction(Transaction transaction);
	
	public List<TransactionByAccount> findByTransactionAccountNo(String transactionaccountno);
	
	public List<Transaction> findByTransactionId(Integer transactionid);

}
