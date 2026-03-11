package com.sena.app.Service;

import com.sena.app.Entity.User;
import java.util.List;

public interface UserService {

    List<User> findAll();

    User save(User user);

    User findById(Long id);

    void delete(Long id);
}
