package spring.project.grocerystore.service;
import org.springframework.stereotype.Service;
import spring.project.grocerystore.model.Category;
import spring.project.grocerystore.repository.CategoryRepository;
import java.util.List;

@Service
public class CategoryServiceImpl implements CategoryService {
    private final CategoryRepository categoryRepo;
    public CategoryServiceImpl(CategoryRepository categoryRepo) {
        this.categoryRepo = categoryRepo;
    }

    @Override
    public Category saveOrUpdate(Category cate) {
        return categoryRepo.save(cate);
    }
    @Override
    public List<Category> getCategory() {
        return categoryRepo.findAll();
    }
    @Override
    public Category getCategoryById(Integer id) {
        return categoryRepo.findById(id).orElse(null);
    }
    @Override
    public String delCategory(Integer id) {
        categoryRepo.deleteById(id);
        return "Delete 1 category";
    }
    @Override
    public String delAllCategory() {
        categoryRepo.deleteAll();
        return "Delete all categories";
    }

}
