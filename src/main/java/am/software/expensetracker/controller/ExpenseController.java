/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package am.software.expensetracker.controller;

import am.software.expensetracker.dto.Expense;
import am.software.expensetracker.service.ExpenseService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author ahmad
 */
@ControllerAdvice
@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/api/expensetracker")
public class ExpenseController {
    @Autowired 
    private ExpenseService expenseService;
    
    @GetMapping("/expenses")
    public List<Expense> getAllCategories() {
        return this.expenseService.getAllExpenses();
    }
    
    @PostMapping("/addExpense")
    @ResponseStatus(HttpStatus.CREATED)
    public Expense addExpense(@RequestBody Expense expense) {
        return this.expenseService.saveExpense(expense);
    }
    
    @PutMapping("/editexpense")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public Expense editExpense(@RequestBody Expense expense) {
        return this.expenseService.saveExpense(expense);
    }
    
    @DeleteMapping("/deleteexpense/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteExpense(@PathVariable int id) {
        this.expenseService.deleteExpenseById(id);
    }
    
    @GetMapping("/expense/{id}")
    public Expense getExpense(@PathVariable int id) throws Exception {       
        return this.expenseService.getExpenseById(id);
    }
}
