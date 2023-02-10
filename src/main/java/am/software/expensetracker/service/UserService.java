/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package am.software.expensetracker.service;

import am.software.expensetracker.dto.User;
import java.util.List;

/**
 *
 * @author ahmad
 */
public interface UserService {
    List<User> getAllUsers();

    User getUserById(int id) throws Exception;

    User saveUser(User user);

    void deleteUserById(int id);
}
