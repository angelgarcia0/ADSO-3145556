package com.sena.app.Service;

import com.sena.app.Entity.Category;
import java.util.List;

public interface CategoryService {

    List<Category> findAll();

    Category save(Category category);

    Category findById(Long id);

    void delete(Long id);
}
