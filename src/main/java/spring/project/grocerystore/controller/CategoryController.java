package spring.project.grocerystore.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import spring.project.grocerystore.model.Category;
import spring.project.grocerystore.service.CategoryServiceImpl;

@RestController
@RequestMapping("/category")
public class CategoryController {

    private final CategoryServiceImpl categoryService;
    public CategoryController(CategoryServiceImpl categoryService) {
        this.categoryService = categoryService;
    }

    @PostMapping("/saveCategory")
    public ResponseEntity<Category> saveOrUpdate(@RequestBody Category cate) {
        return new ResponseEntity<Category>(categoryService.saveOrUpdate(cate), HttpStatus.ACCEPTED);
    }
    @GetMapping("/allCategory")
    public ResponseEntity<?> getAllCategory() {
        return ResponseEntity.ok(categoryService.getCategory());
    }
    @GetMapping("/category/{id}")
    public ResponseEntity<?> getCategoryById(@PathVariable Integer id) {
        return ResponseEntity.ok(categoryService.getCategoryById(id));
    }
    @DeleteMapping("/delCategory/{id}")
    public ResponseEntity<?> delCategory(@PathVariable Integer id) {
        return ResponseEntity.ok(categoryService.delCategory(id));
    }
    @DeleteMapping("/delAllCategory")
    public ResponseEntity<?> delAllCategory() {
        return ResponseEntity.ok(categoryService.delAllCategory());
    }


}
