package spring.project.grocerystore.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import spring.project.grocerystore.model.Product;

@Repository
public interface ProductRepository extends MongoRepository<Product, Integer> {
}
