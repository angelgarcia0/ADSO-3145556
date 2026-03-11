package com.sena.app.Controller;

import com.sena.app.Entity.Cart;
import com.sena.app.Service.CartService;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/cart")
public class CartController {

    private final CartService service;

    public CartController(CartService service) {
        this.service = service;
    }

    @GetMapping
    public List<Cart> list() {
        return service.findAll();
    }

    @PostMapping
    public Cart save(@RequestBody Cart cart) {
        return service.save(cart);
    }

    @GetMapping("/{id}")
    public Cart findById(@PathVariable Long id) {
        return service.findById(id);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        service.delete(id);
    }
}