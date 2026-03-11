package com.sena.app.Service;

import com.sena.app.Entity.Product;
import java.util.List;

public interface ProductService {

    List<Product> findAll();

    Product save(Product product);

    Product findById(Long id);

    void delete(Long id);
}
