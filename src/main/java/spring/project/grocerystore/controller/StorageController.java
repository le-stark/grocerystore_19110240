package spring.project.grocerystore.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import spring.project.grocerystore.model.Storage;
import spring.project.grocerystore.service.StorageServiceImpl;

@RestController
@RequestMapping("/storage")
public class StorageController {
    private final StorageServiceImpl storageService;
    public StorageController(StorageServiceImpl storageService) {
        this.storageService = storageService;
    }

    @PostMapping("/saveStorage")
    public ResponseEntity<Storage> saveOrUpdate(@RequestBody Storage storage) {
        return new ResponseEntity<Storage>(storageService.saveOrUpdate(storage), HttpStatus.ACCEPTED);
    }
    @GetMapping("/allStorage")
    public ResponseEntity<?> getAllStorage() {
        return ResponseEntity.ok(storageService.getStorage());
    }
    @GetMapping("/storage/{id}")
    public ResponseEntity<?> getStorageById(@PathVariable Integer id) {
        return ResponseEntity.ok(storageService.getStorageById(id));
    }
    @DeleteMapping("/delStorage/{id}")
    public ResponseEntity<?> delStorage(@PathVariable Integer id) {
        return ResponseEntity.ok(storageService.delStorage(id));
    }
    @DeleteMapping("/delAllStorage")
    public ResponseEntity<?> delAllStorage() {
        return ResponseEntity.ok(storageService.delAllStorage());
    }
}
