package com.sena.app.Service;

import com.sena.app.Entity.Role;
import java.util.List;

public interface RoleService {

    List<Role> findAll();

    Role save(Role role);

    Role findById(Long id);

    void delete(Long id);
}
