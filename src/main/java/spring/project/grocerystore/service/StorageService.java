package spring.project.grocerystore.service;

import spring.project.grocerystore.model.Storage;

import java.util.List;

public interface StorageService {
    Storage saveOrUpdate(Storage storage);

    List<Storage> getStorage();

    Storage getStorageById(Integer id);

    String delStorage(Integer id);

    String delAllStorage();

}
