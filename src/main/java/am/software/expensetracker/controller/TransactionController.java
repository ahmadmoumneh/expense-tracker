/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import am.software.expensetracker.dto.Transaction;
import am.software.expensetracker.service.TransactionService;
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
 * @author omarh
 */
@ControllerAdvice
@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/api/expensetracker")
public class TransactionController {
     @Autowired 
    private TransactionService transactionService;
     
     @GetMapping("/transactions")
    public List<Transaction> getAllTransactions() {
        return this.transactionService.getAllTransactions();
    }
    
    @PostMapping("/addTransaction")
    @ResponseStatus(HttpStatus.CREATED)
    public Transaction addTransaction(@RequestBody Transaction transaction) {
        return this.transactionService.saveTransaction(transaction);
    }
    
    @PutMapping("/edittransaction")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public Transaction editTransaction(@RequestBody Transaction transaction) {
        return this.transactionService.saveTransaction(transaction);
    }
    
    @DeleteMapping("/deletetransaction/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteTransaction(@PathVariable int id) {
        this.transactionService.deleteTransactionById(id);
    }
    
    @GetMapping("/transaction/{id}")
    public Transaction getTransaction(@PathVariable int id) throws Exception {       
        return this.transactionService.getTransactionById(id);
    }
}
