/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package am.software.expensetracker.service;

import am.software.expensetracker.dto.Account;
import java.util.List;

/**
 *
 * @author mrmik
 */
public interface AccountService {
     List<Account> getAllAccounts();

    Account getAccountById(int id) throws Exception;

    Account saveAccount(Account account);

    void deleteAccountById(int id);
}
