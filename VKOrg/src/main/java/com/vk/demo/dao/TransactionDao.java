package com.vk.demo.dao;

import java.util.List;

import com.vk.demo.entities.Transaction;

public interface TransactionDao {
	
	public List<Transaction> getAllTransaction();

	public Transaction getTransactionByID(Integer tId);

	public Transaction addTransaction(Transaction transaction);
	
	public List<Transaction> findByTransactionAccountNo(String transactionaccountno);
	
	public List<Transaction> findByTransactionId(Integer transactionid);


}
