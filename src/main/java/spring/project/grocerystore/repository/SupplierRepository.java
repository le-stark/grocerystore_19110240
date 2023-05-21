package spring.project.grocerystore.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import spring.project.grocerystore.model.Supplier;

@Repository
public interface SupplierRepository extends MongoRepository<Supplier, Integer> {
}
