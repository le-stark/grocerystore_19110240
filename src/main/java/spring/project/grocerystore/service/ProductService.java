package spring.project.grocerystore.service;

import spring.project.grocerystore.model.Product;

import java.util.List;

public interface ProductService {
    Product saveOrUpdate(Product product);

    List<Product> getProduct();

    Product getProductById(Integer id);

    String delProduct(Integer id);

    String delAllProduct();
}
