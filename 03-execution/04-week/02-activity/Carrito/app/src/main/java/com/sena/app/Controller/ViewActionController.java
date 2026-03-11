package com.sena.app.Controller;

import com.sena.app.Entity.ViewAction;
import com.sena.app.Service.ViewActionService;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/view-action")
public class ViewActionController {

    private final ViewActionService service;

    public ViewActionController(ViewActionService service) {
        this.service = service;
    }

    @GetMapping
    public List<ViewAction> list() {
        return service.findAll();
    }

    @PostMapping
    public ViewAction save(@RequestBody ViewAction viewAction) {
        return service.save(viewAction);
    }

    @GetMapping("/{id}")
    public ViewAction findById(@PathVariable Long id) {
        return service.findById(id);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        service.delete(id);
    }
}