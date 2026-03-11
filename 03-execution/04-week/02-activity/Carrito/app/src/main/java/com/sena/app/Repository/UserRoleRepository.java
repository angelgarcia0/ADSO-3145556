package com.sena.app.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.sena.app.Entity.UserRole;

public interface UserRoleRepository extends JpaRepository<UserRole, Long> {

}
