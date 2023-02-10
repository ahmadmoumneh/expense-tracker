/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package am.software.expensetracker.service;

import am.software.expensetracker.dao.UserRepository;
import am.software.expensetracker.dto.User;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 *
 * @author ahmad
 */
@Component
public class UserServiceImpl implements UserService {
    
    @Autowired UserRepository userDao;

    @Override
    public List<User> getAllUsers() {
        return userDao.findAll();
    }

    @Override
    public User getUserById(int id) throws Exception {
        return userDao.findById(id).get();
    }

    @Override
    public User saveUser(User user) {
        return userDao.save(user);
    }

    @Override
    public void deleteUserById(int id) {
        userDao.deleteById(id);
    }
}
