package com.sena.app.Controller;

import com.sena.app.Entity.Module;
import com.sena.app.Service.ModuleService;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/module")
public class ModuleController {

    private final ModuleService service;

    public ModuleController(ModuleService service) {
        this.service = service;
    }

    @GetMapping
    public List<Module> list() {
        return service.findAll();
    }

    @PostMapping
    public Module save(@RequestBody Module module) {
        return service.save(module);
    }

    @GetMapping("/{id}")
    public Module findById(@PathVariable Long id) {
        return service.findById(id);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        service.delete(id);
    }
}
