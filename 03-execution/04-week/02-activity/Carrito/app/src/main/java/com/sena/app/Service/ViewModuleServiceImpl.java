package com.sena.app.Service;

import com.sena.app.Entity.ViewModule;
import com.sena.app.Repository.ViewModuleRepository;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ViewModuleServiceImpl implements ViewModuleService {

    private final ViewModuleRepository repository;

    public ViewModuleServiceImpl(ViewModuleRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<ViewModule> findAll() {
        return repository.findAll();
    }

    @Override
    public ViewModule save(ViewModule viewModule) {
        return repository.save(viewModule);
    }

    @Override
    public ViewModule findById(Long id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public void delete(Long id) {
        repository.deleteById(id);
    }
}