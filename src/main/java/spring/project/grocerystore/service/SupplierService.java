package spring.project.grocerystore.service;

import spring.project.grocerystore.model.Supplier;

import java.util.List;

public interface SupplierService {
    Supplier saveOrUpdate(Supplier supplier);

    List<Supplier> getSupplier();

    Supplier getSupplierById(Integer id);

    String delSupplier(Integer id);

    String delAllSupplier();
}
