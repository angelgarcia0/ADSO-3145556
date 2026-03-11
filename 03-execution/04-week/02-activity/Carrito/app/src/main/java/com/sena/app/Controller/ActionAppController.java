package com.sena.app.Controller;

import com.sena.app.Entity.ActionApp;
import com.sena.app.Service.ActionAppService;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/action")
public class ActionAppController {

    private final ActionAppService service;

    public ActionAppController(ActionAppService service) {
        this.service = service;
    }

    @GetMapping
    public List<ActionApp> list() {
        return service.findAll();
    }

    @PostMapping
    public ActionApp save(@RequestBody ActionApp action) {
        return service.save(action);
    }

    @GetMapping("/{id}")
    public ActionApp findById(@PathVariable Long id) {
        return service.findById(id);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        service.delete(id);
    }
}