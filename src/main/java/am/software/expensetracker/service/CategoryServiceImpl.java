/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package am.software.expensetracker.service;

import am.software.expensetracker.dao.CategoryRepository;
import am.software.expensetracker.dto.Category;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 *
 * @author ahmad
 */
@Component
public class CategoryServiceImpl implements CategoryService {
    
    @Autowired CategoryRepository categoryDao;

    @Override
    public List<Category> getAllCategories() {
        return categoryDao.findAll();
    }

    @Override
    public Category getCategoryById(int id) throws Exception {
        return categoryDao.findById(id).get();
    }

    @Override
    public Category saveCategory(Category category) {
        return categoryDao.save(category);
    }

    @Override
    public void deleteCategoryById(int id) {
        categoryDao.deleteById(id);
    }
    
}
