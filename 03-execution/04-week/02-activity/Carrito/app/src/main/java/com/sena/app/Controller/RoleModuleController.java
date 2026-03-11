package com.sena.app.Controller;

import com.sena.app.Entity.RoleModule;
import com.sena.app.Service.RoleModuleService;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/role-module")
public class RoleModuleController {

    private final RoleModuleService service;

    public RoleModuleController(RoleModuleService service) {
        this.service = service;
    }

    @GetMapping
    public List<RoleModule> list() {
        return service.findAll();
    }

    @PostMapping
    public RoleModule save(@RequestBody RoleModule roleModule) {
        return service.save(roleModule);
    }

    @GetMapping("/{id}")
    public RoleModule findById(@PathVariable Long id) {
        return service.findById(id);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        service.delete(id);
    }
}