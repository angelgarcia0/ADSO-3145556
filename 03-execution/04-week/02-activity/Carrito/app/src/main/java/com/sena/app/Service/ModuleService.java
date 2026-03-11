package com.sena.app.Service;

import com.sena.app.Entity.Module;
import java.util.List;

public interface ModuleService {

    List<Module> findAll();

    Module save(Module module);

    Module findById(Long id);

    void delete(Long id);
}