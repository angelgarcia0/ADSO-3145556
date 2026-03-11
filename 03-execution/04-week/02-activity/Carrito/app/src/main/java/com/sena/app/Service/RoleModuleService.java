package com.sena.app.Service;

import com.sena.app.Entity.RoleModule;
import java.util.List;

public interface RoleModuleService {

    List<RoleModule> findAll();

    RoleModule save(RoleModule roleModule);

    RoleModule findById(Long id);

    void delete(Long id);
}