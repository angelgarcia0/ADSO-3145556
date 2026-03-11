package com.sena.app.Service;

import com.sena.app.Entity.ActionApp;
import com.sena.app.Repository.ActionAppRepository;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ActionAppServiceImpl implements ActionAppService {

    private final ActionAppRepository repository;

    public ActionAppServiceImpl(ActionAppRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<ActionApp> findAll() {
        return repository.findAll();
    }

    @Override
    public ActionApp save(ActionApp action) {
        return repository.save(action);
    }

    @Override
    public ActionApp findById(Long id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public void delete(Long id) {
        repository.deleteById(id);
    }
}