package spring.project.grocerystore.service;

import org.springframework.stereotype.Service;
import spring.project.grocerystore.model.Product;
import spring.project.grocerystore.repository.ProductRepository;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {
    private final ProductRepository productRepo;
    public ProductServiceImpl(ProductRepository productRepo) {
        this.productRepo = productRepo;
    }

    @Override
    public Product saveOrUpdate(Product product) {
        return productRepo.save(product);
    }
    @Override
    public List<Product> getProduct() {
        return productRepo.findAll();
    }
    @Override
    public Product getProductById(Integer id) {
        return productRepo.findById(id).orElse(null);
    }
    @Override
    public String delProduct(Integer id) {
        productRepo.deleteById(id);
        return "Delete 1 product";
    }
    @Override
    public String delAllProduct() {
        productRepo.deleteAll();
        return "Delete all products";
    }
}
