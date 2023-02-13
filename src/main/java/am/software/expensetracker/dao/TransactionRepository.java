/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package am.software.expensetracker.dao;

import am.software.expensetracker.dto.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author omarh
 */
@Repository
public interface TransactionRepository extends JpaRepository<Transaction, Integer> {
    
    
}
