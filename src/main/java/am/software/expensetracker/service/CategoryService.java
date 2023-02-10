/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package am.software.expensetracker.service;

import am.software.expensetracker.dto.Category;
import java.util.List;

/**
 *
 * @author ahmad
 */
public interface CategoryService {
    List<Category> getAllCategories();

    Category getCategoryById(int id) throws Exception;

    Category saveCategory(Category category);

    void deleteCategoryById(int id);
}
