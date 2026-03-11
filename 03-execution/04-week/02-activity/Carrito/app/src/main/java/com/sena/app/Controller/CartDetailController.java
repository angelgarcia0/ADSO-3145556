package com.sena.app.Controller;

import com.sena.app.Entity.CartDetail;
import com.sena.app.Service.CartDetailService;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/cart-detail")
public class CartDetailController {

    private final CartDetailService service;

    public CartDetailController(CartDetailService service) {
        this.service = service;
    }

    @GetMapping
    public List<CartDetail> list() {
        return service.findAll();
    }

    @PostMapping
    public CartDetail save(@RequestBody CartDetail cartDetail) {
        return service.save(cartDetail);
    }

    @GetMapping("/{id}")
    public CartDetail findById(@PathVariable Long id) {
        return service.findById(id);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        service.delete(id);
    }
}
