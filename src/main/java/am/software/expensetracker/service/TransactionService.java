/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package am.software.expensetracker.service;

import am.software.expensetracker.dto.Transaction;
import java.util.List;

/**
 *
 * @author omarh
 */
public interface TransactionService {
    List<Transaction> getAllTransactions();

    Transaction getTransactionById(int id) throws Exception;

    Transaction saveTransaction(Transaction transaction);

    void deleteTransactionById(int id);
}
