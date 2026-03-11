package com.sena.app.Controller;

import com.sena.app.Entity.BillDetail;
import com.sena.app.Service.BillDetailService;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/bill-detail")
public class BillDetailController {

    private final BillDetailService service;

    public BillDetailController(BillDetailService service) {
        this.service = service;
    }

    @GetMapping
    public List<BillDetail> list() {
        return service.findAll();
    }

    @PostMapping
    public BillDetail save(@RequestBody BillDetail billDetail) {
        return service.save(billDetail);
    }

    @GetMapping("/{id}")
    public BillDetail findById(@PathVariable Long id) {
        return service.findById(id);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        service.delete(id);
    }
}
