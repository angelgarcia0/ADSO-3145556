package com.sena.app.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.sena.app.Entity.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
