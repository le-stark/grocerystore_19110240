package spring.project.grocerystore.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "product")
public class Product {
    @Id
    private Integer productId;
    private String name;
    private Double price;
    private Integer quantity;
    @DBRef
    private Category category;
    @DBRef
    private Supplier supplier;
    @DBRef
    private Storage storage;
}
