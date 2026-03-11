package com.sena.app.Service;

import com.sena.app.Entity.UserRole;
import java.util.List;

public interface UserRoleService {

    List<UserRole> findAll();

    UserRole save(UserRole userRole);

    UserRole findById(Long id);

    void delete(Long id);
}
