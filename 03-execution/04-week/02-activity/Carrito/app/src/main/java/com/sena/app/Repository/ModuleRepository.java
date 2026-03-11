package com.sena.app.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.sena.app.Entity.Module;

public interface ModuleRepository extends JpaRepository<Module, Long> {

}