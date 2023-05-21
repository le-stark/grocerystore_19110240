package spring.project.grocerystore.service;

import org.springframework.stereotype.Service;
import spring.project.grocerystore.model.Storage;
import spring.project.grocerystore.repository.StorageRepository;

import java.util.List;

@Service
public class StorageServiceImpl implements StorageService {
    private final StorageRepository storageRepo;
    public StorageServiceImpl(StorageRepository storageRepo) {
        this.storageRepo = storageRepo;
    }

    @Override
    public Storage saveOrUpdate(Storage storage) {
        return storageRepo.save(storage);
    }
    @Override
    public List<Storage> getStorage() {
        return storageRepo.findAll();
    }
    @Override
    public Storage getStorageById(Integer id) {
        return storageRepo.findById(id).orElse(null);
    }
    @Override
    public String delStorage(Integer id) {
        storageRepo.deleteById(id);
        return "Delete 1 storage";
    }
    @Override
    public String delAllStorage() {
        storageRepo.deleteAll();
        return "Delete all storages";
    }

}
