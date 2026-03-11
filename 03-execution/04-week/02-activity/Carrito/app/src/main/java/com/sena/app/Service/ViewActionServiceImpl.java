package com.sena.app.Service;

import com.sena.app.Entity.ViewAction;
import com.sena.app.Repository.ViewActionRepository;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ViewActionServiceImpl implements ViewActionService {

    private final ViewActionRepository repository;

    public ViewActionServiceImpl(ViewActionRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<ViewAction> findAll() {
        return repository.findAll();
    }

    @Override
    public ViewAction save(ViewAction viewAction) {
        return repository.save(viewAction);
    }

    @Override
    public ViewAction findById(Long id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public void delete(Long id) {
        repository.deleteById(id);
    }
}