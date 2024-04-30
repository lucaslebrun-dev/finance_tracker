package com.example.backend;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/api/transactions")
public class TransactionController {
    @Autowired
    private TransactionService service;

    @GetMapping
    public ResponseEntity<Iterable<Transaction>> getAllTransactions() {
        return ResponseEntity.ok(service.getAllTransactions());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Optional<Transaction>> getTransactionById(@PathVariable Long id) {
        Optional<Transaction> transaction = service.getTransactionById(id);
        if (transaction.isPresent()) {
            return ResponseEntity.ok(transaction);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @PostMapping
    public ResponseEntity<Transaction> createTransaction(@RequestBody Transaction transaction) {
        Transaction createdTransaction = service.createTransaction(transaction);
        return ResponseEntity.ok(createdTransaction);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteTransaction(@PathVariable Long id) {
        service.deleteTransaction(id);
        return ResponseEntity.noContent().build();
    }
}
