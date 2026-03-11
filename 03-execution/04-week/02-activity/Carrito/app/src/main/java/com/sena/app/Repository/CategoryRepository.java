package com.sena.app.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.sena.app.Entity.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}