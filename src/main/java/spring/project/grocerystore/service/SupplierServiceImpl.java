package spring.project.grocerystore.service;

import org.springframework.stereotype.Service;
import spring.project.grocerystore.model.Supplier;
import spring.project.grocerystore.repository.SupplierRepository;

import java.util.List;

@Service
public class SupplierServiceImpl implements SupplierService {

    private final SupplierRepository supplierRepo;
    public SupplierServiceImpl(SupplierRepository supplierRepo) {
        this.supplierRepo = supplierRepo;
    }

    @Override
    public Supplier saveOrUpdate(Supplier supplier) {
        return supplierRepo.save(supplier);
    }
    @Override
    public List<Supplier> getSupplier() {
        return supplierRepo.findAll();
    }
    @Override
    public Supplier getSupplierById(Integer id) {
        return supplierRepo.findById(id).orElse(null);
    }
    @Override
    public String delSupplier(Integer id) {
        supplierRepo.deleteById(id);
        return "Delete 1 supplier";
    }
    @Override
    public String delAllSupplier() {
        supplierRepo.deleteAll();
        return "Delete all suppliers";
    }
}
