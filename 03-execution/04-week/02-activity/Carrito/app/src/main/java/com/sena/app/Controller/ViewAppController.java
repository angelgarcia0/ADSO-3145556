package com.sena.app.Controller;

import com.sena.app.Entity.ViewApp;
import com.sena.app.Service.ViewAppService;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/view")
public class ViewAppController {

    private final ViewAppService service;

    public ViewAppController(ViewAppService service) {
        this.service = service;
    }

    @GetMapping
    public List<ViewApp> list() {
        return service.findAll();
    }

    @PostMapping
    public ViewApp save(@RequestBody ViewApp view) {
        return service.save(view);
    }

    @GetMapping("/{id}")
    public ViewApp findById(@PathVariable Long id) {
        return service.findById(id);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        service.delete(id);
    }
}
