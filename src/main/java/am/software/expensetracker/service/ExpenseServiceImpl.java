/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package am.software.expensetracker.service;

import am.software.expensetracker.dao.ExpenseRepository;
import am.software.expensetracker.dto.Expense;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 *
 * @author ahmad
 */
@Component
public class ExpenseServiceImpl implements ExpenseService {
    
    @Autowired ExpenseRepository expenseDao;
    
    @Override
    public List<Expense> getAllExpenses() {
       return expenseDao.findAll();
    }

    @Override
    public Expense getExpenseById(int id) throws Exception {
        return expenseDao.findById(id).get();
    }

    @Override
    public Expense saveExpense(Expense expense) {
        return expenseDao.save(expense);
    }

    @Override
    public void deleteExpenseById(int id) {
        expenseDao.deleteById(id);
    }
    
}
