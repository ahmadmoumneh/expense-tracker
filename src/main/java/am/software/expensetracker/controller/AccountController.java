/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package am.software.expensetracker.controller;

import am.software.expensetracker.dto.Account;
import am.software.expensetracker.service.AccountService;
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
 * @author mrmik
 */
@ControllerAdvice
@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/api/expensetracker")
public class AccountController {
    @Autowired 
    private AccountService accountService;
    
    @GetMapping("/accounts")
    public List<Account> getAllCategories() {
        return this.accountService.getAllAccounts();
    }
    
    @PostMapping("/addAccount")
    @ResponseStatus(HttpStatus.CREATED)
    public Account addAccount(@RequestBody Account account) {
        return this.accountService.saveAccount(account);
    }
    
    @PutMapping("/editaccount")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public Account editAccount(@RequestBody Account account) {
        return this.accountService.saveAccount(account);
    }
    
    @DeleteMapping("/deleteaccount/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteAccount(@PathVariable int id) {
        this.accountService.deleteAccountById(id);
    }
    
    @GetMapping("/account/{id}")
    public Account getAccount(@PathVariable int id) throws Exception {       
        return this.accountService.getAccountById(id);
    }
}
