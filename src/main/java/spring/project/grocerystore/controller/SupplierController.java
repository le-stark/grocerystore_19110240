package spring.project.grocerystore.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import spring.project.grocerystore.model.Supplier;
import spring.project.grocerystore.service.SupplierServiceImpl;

@RestController
@RequestMapping("/supplier")
public class SupplierController {
    private final SupplierServiceImpl supplierService;
    public SupplierController(SupplierServiceImpl supplierService) {
        this.supplierService = supplierService;
    }

    @PostMapping("/saveSupplier")
    public ResponseEntity<Supplier> saveOrUpdate(@RequestBody Supplier supplier) {
        return new ResponseEntity<Supplier>(supplierService.saveOrUpdate(supplier), HttpStatus.ACCEPTED);
    }
    @GetMapping("/allSupplier")
    public ResponseEntity<?> getAllSupplier() {
        return ResponseEntity.ok(supplierService.getSupplier());
    }
    @GetMapping("/supplier/{id}")
    public ResponseEntity<?> getSupplierById(@PathVariable Integer id) {
        return ResponseEntity.ok(supplierService.getSupplierById(id));
    }
    @DeleteMapping("/delSupplier/{id}")
    public ResponseEntity<?> delSupplier(@PathVariable Integer id) {
        return ResponseEntity.ok(supplierService.delSupplier(id));
    }
    @DeleteMapping("/delAllSupplier")
    public ResponseEntity<?> delAllSupplier() {
        return ResponseEntity.ok(supplierService.delAllSupplier());
    }

}
