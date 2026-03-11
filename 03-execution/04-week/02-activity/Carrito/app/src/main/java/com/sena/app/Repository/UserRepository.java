package com.sena.app.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.sena.app.Entity.User;

public interface UserRepository extends JpaRepository<User, Long> {

}