package com.example.backend;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class TransactionService {
    @Autowired
    private TransactionRepository repository;

    public Iterable<Transaction> getAllTransactions() {
        return repository.findAll();
    }

    public Optional<Transaction> getTransactionById(Long id) {
        return repository.findById(id);
    }

    public Transaction createTransaction(Transaction transaction) {
        return repository.save(transaction);
    }

    public void deleteTransaction(Long id) {
        repository.deleteById(id);
    }
}
