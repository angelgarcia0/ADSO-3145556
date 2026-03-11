package com.sena.app.Controller;

import com.sena.app.Entity.Inventory;
import com.sena.app.Service.InventoryService;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/inventory")
public class InventoryController {

    private final InventoryService service;

    public InventoryController(InventoryService service) {
        this.service = service;
    }

    @GetMapping
    public List<Inventory> list() {
        return service.findAll();
    }

    @PostMapping
    public Inventory save(@RequestBody Inventory inventory) {
        return service.save(inventory);
    }

    @GetMapping("/{id}")
    public Inventory findById(@PathVariable Long id) {
        return service.findById(id);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        service.delete(id);
    }
}