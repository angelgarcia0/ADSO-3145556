package com.sena.app.Controller;

import com.sena.app.Entity.ViewModule;
import com.sena.app.Service.ViewModuleService;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/view-module")
public class ViewModuleController {

    private final ViewModuleService service;

    public ViewModuleController(ViewModuleService service) {
        this.service = service;
    }

    @GetMapping
    public List<ViewModule> list() {
        return service.findAll();
    }

    @PostMapping
    public ViewModule save(@RequestBody ViewModule viewModule) {
        return service.save(viewModule);
    }

    @GetMapping("/{id}")
    public ViewModule findById(@PathVariable Long id) {
        return service.findById(id);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        service.delete(id);
    }
}
