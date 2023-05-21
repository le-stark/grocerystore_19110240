package spring.project.grocerystore.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "supplier")
public class Supplier {
    @Id
    private Integer supplierId;
    private String name;
    private String email;
    private String phone;
    private String address;
}
