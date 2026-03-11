package com.sena.app.Service;

import com.sena.app.Entity.RoleModule;
import com.sena.app.Repository.RoleModuleRepository;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoleModuleServiceImpl implements RoleModuleService {

    private final RoleModuleRepository repository;

    public RoleModuleServiceImpl(RoleModuleRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<RoleModule> findAll() {
        return repository.findAll();
    }

    @Override
    public RoleModule save(RoleModule roleModule) {
        return repository.save(roleModule);
    }

    @Override
    public RoleModule findById(Long id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public void delete(Long id) {
        repository.deleteById(id);
    }
}
