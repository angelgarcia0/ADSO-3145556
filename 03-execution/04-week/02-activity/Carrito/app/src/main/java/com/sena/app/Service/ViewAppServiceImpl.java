package com.sena.app.Service;

import com.sena.app.Entity.ViewApp;
import com.sena.app.Repository.ViewAppRepository;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ViewAppServiceImpl implements ViewAppService {

    private final ViewAppRepository repository;

    public ViewAppServiceImpl(ViewAppRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<ViewApp> findAll() {
        return repository.findAll();
    }

    @Override
    public ViewApp save(ViewApp view) {
        return repository.save(view);
    }

    @Override
    public ViewApp findById(Long id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public void delete(Long id) {
        repository.deleteById(id);
    }
}