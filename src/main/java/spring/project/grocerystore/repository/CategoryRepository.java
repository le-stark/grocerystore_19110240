package spring.project.grocerystore.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import spring.project.grocerystore.model.Category;

@Repository
public interface CategoryRepository extends MongoRepository<Category, Integer> {
}
