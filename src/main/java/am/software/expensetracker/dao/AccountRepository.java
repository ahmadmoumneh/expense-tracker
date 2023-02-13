/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package am.software.expensetracker.dao;

import am.software.expensetracker.dto.Account;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


/**
 *
 * @author mrmik
 */
@Repository
public interface AccountRepository extends JpaRepository<Account, Integer> {
    
}
