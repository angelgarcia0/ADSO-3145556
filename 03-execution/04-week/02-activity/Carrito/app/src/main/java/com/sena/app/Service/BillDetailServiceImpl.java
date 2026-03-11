package com.sena.app.Service;

import com.sena.app.Entity.BillDetail;
import com.sena.app.Repository.BillDetailRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BillDetailServiceImpl implements BillDetailService {

    private final BillDetailRepository repository;

    public BillDetailServiceImpl(BillDetailRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<BillDetail> findAll() {
        return repository.findAll();
    }

    @Override
    public BillDetail save(BillDetail billDetail) {
        return repository.save(billDetail);
    }

    @Override
    public BillDetail findById(Long id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public void delete(Long id) {
        repository.deleteById(id);
    }
}