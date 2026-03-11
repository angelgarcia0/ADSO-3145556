package com.sena.app.Service;

import com.sena.app.Entity.CartDetail;
import com.sena.app.Repository.CartDetailRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CartDetailServiceImpl implements CartDetailService {

    private final CartDetailRepository repository;

    public CartDetailServiceImpl(CartDetailRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<CartDetail> findAll() {
        return repository.findAll();
    }

    @Override
    public CartDetail save(CartDetail cartDetail) {
        return repository.save(cartDetail);
    }

    @Override
    public CartDetail findById(Long id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public void delete(Long id) {
        repository.deleteById(id);
    }
}