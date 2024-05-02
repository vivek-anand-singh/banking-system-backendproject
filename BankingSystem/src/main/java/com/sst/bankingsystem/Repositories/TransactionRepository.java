package com.sst.bankingsystem.Repositories;

import com.sst.bankingsystem.Models.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface TransactionRepository extends JpaRepository<Transaction, Integer> {
    @Override
    Transaction save(Transaction transaction);
}