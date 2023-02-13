/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package am.software.expensetracker.service;

import am.software.expensetracker.dao.AccountRepository;
import am.software.expensetracker.dto.Account;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;


/**
 *
 * @author mrmik
 */
public class AccountServiceImpl implements AccountService {
     @Autowired AccountRepository accountDao;
    
    @Override
    public List<Account> getAllAccounts() {
       return accountDao.findAll();
    }

    @Override
    public Account getAccountById(int id) throws Exception {
        return accountDao.findById(id).get();
    }

    @Override
    public Account saveAccount(Account account) {
        return accountDao.save(account);
    }

    @Override
    public void deleteAccountById(int id) {
        accountDao.deleteById(id);
    }
}
