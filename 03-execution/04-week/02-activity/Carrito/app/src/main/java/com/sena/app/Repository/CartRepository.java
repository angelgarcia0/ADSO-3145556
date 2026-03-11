package com.sena.app.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.sena.app.Entity.Cart;

public interface CartRepository extends JpaRepository<Cart, Long> {

}
