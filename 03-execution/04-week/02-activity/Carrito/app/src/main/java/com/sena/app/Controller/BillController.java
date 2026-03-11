package com.sena.app.Controller;

import com.sena.app.Entity.Bill;
import com.sena.app.Service.BillService;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/bill")
public class BillController {

    private final BillService service;

    public BillController(BillService service) {
        this.service = service;
    }

    @GetMapping
    public List<Bill> list() {
        return service.findAll();
    }

    @PostMapping
    public Bill save(@RequestBody Bill bill) {
        return service.save(bill);
    }

    @GetMapping("/{id}")
    public Bill findById(@PathVariable Long id) {
        return service.findById(id);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        service.delete(id);
    }
}