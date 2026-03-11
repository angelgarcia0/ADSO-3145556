package com.sena.app.Service;

import com.sena.app.Entity.Inventory;
import java.util.List;

public interface InventoryService {

    List<Inventory> findAll();

    Inventory save(Inventory inventory);

    Inventory findById(Long id);

    void delete(Long id);
}
