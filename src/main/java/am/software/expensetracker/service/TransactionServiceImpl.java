/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package am.software.expensetracker.service;

import am.software.expensetracker.dao.TransactionRepository;
import am.software.expensetracker.dto.Transaction;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 *
 * @author omarh
 */
@Component
public class TransactionServiceImpl implements TransactionService {
    
    @Autowired TransactionRepository transactionDao ;

    @Override
    public List<Transaction> getAllTransactions() {
    return transactionDao.findAll();
    }

    @Override
    public Transaction getTransactionById(int id) throws Exception {
        return transactionDao.findById(id).get();
    }

    @Override
    public Transaction saveTransaction(Transaction transaction) {
        return transactionDao.save(transaction);
    }

    @Override
    public void deleteTransactionById(int id) {
        transactionDao.deleteById(id);
    }
    
}
