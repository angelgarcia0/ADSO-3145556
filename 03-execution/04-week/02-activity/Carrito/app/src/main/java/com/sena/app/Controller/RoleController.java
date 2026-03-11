package com.sena.app.Controller;

import com.sena.app.Entity.Role;
import com.sena.app.Service.RoleService;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/role")
public class RoleController {

    private final RoleService service;

    public RoleController(RoleService service) {
        this.service = service;
    }

    @GetMapping
    public List<Role> list() {
        return service.findAll();
    }

    @PostMapping
    public Role save(@RequestBody Role role) {
        return service.save(role);
    }

    @GetMapping("/{id}")
    public Role findById(@PathVariable Long id) {
        return service.findById(id);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        service.delete(id);
    }
}
