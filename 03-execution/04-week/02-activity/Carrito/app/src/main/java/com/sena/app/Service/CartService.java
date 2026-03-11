package com.sena.app.Service;

import com.sena.app.Entity.Cart;
import java.util.List;

public interface CartService {

    List<Cart> findAll();

    Cart save(Cart cart);

    Cart findById(Long id);

    void delete(Long id);
}