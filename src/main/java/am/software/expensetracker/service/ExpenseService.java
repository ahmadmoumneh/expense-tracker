/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package am.software.expensetracker.service;

import am.software.expensetracker.dto.Expense;
import java.util.List;

/**
 *
 * @author ahmad
 */
public interface ExpenseService {
    List<Expense> getAllExpenses();

    Expense getExpenseById(int id) throws Exception;

    Expense saveExpense(Expense expense);

    void deleteExpenseById(int id);
}
