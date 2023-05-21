package spring.project.grocerystore.service;

import spring.project.grocerystore.model.Category;

import java.util.List;

public interface CategoryService {
    Category saveOrUpdate(Category cate);

    List<Category> getCategory();

    Category getCategoryById(Integer id);

    String delCategory(Integer id);

    String delAllCategory();

}
