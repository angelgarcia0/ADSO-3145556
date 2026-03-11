package com.sena.app.Controller;

import com.sena.app.Entity.UserRole;
import com.sena.app.Service.UserRoleService;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/user-role")
public class UserRoleController {

    private final UserRoleService service;

    public UserRoleController(UserRoleService service) {
        this.service = service;
    }

    @GetMapping
    public List<UserRole> list() {
        return service.findAll();
    }

    @PostMapping
    public UserRole save(@RequestBody UserRole userRole) {
        return service.save(userRole);
    }

    @GetMapping("/{id}")
    public UserRole findById(@PathVariable Long id) {
        return service.findById(id);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        service.delete(id);
    }
}
