package com.sena.app.Service;

import com.sena.app.Entity.Module;
import com.sena.app.Repository.ModuleRepository;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ModuleServiceImpl implements ModuleService {

    private final ModuleRepository repository;

    public ModuleServiceImpl(ModuleRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<Module> findAll() {
        return repository.findAll();
    }

    @Override
    public Module save(Module module) {
        return repository.save(module);
    }

    @Override
    public Module findById(Long id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public void delete(Long id) {
        repository.deleteById(id);
    }
}
