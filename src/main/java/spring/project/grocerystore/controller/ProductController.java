package spring.project.grocerystore.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import spring.project.grocerystore.model.Product;
import spring.project.grocerystore.service.ProductServiceImpl;

@RestController
@RequestMapping("/product")
public class ProductController {
    private final ProductServiceImpl productService;
    public ProductController(ProductServiceImpl productService) {
        this.productService = productService;
    }

    @PostMapping("/saveProduct")
    public ResponseEntity<Product> saveOrUpdate(@RequestBody Product product) {
        return new ResponseEntity<Product>(productService.saveOrUpdate(product), HttpStatus.ACCEPTED);
    }
    @GetMapping("/allProduct")
    public ResponseEntity<?> getProduct() {
        return ResponseEntity.ok(productService.getProduct());
    }
    @GetMapping("/product/{id}")
    public ResponseEntity<?> getProductById(@PathVariable Integer id) {
        return ResponseEntity.ok(productService.getProductById(id));
    }
    @DeleteMapping("/delProduct/{id}")
    public ResponseEntity<?> delProduct(@PathVariable Integer id) {
        return ResponseEntity.ok(productService.delProduct(id));
    }
    @DeleteMapping("/delAllProduct")
    public ResponseEntity<?> delAllProduct() {
        return ResponseEntity.ok(productService.delAllProduct());
    }
}
