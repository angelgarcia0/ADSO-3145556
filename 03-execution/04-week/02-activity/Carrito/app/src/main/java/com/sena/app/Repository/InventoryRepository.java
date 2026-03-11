package com.sena.app.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.sena.app.Entity.Inventory;

public interface InventoryRepository extends JpaRepository<Inventory, Long> {

}