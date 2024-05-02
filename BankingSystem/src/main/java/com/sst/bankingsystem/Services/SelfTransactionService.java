package com.sst.bankingsystem.Services;

import com.sst.bankingsystem.Models.Transaction;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class SelfTransactionService implements TransactionService {

    @Override
    public List<Transaction> getAllTransactions() {
        return List.of();
    }

    @Override
    public Transaction getTransactionById(int transactionId) {
        return null;
    }

    @Override
    public Transaction createTransaction(Transaction transaction) {
        return null;
    }

    @Override
    public Transaction updateTransaction(Transaction transaction) {
        return null;
    }

    @Override
    public void deleteTransaction(int transactionId) {

    }

    @Override
    public List<Transaction> getTransactionsByAccountNumber(Long accountNumber) {
        return List.of();
    }
}