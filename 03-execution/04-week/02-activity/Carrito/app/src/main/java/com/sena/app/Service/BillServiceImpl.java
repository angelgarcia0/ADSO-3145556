package com.sena.app.Service;

import com.sena.app.Entity.Bill;
import com.sena.app.Repository.BillRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BillServiceImpl implements BillService {

    private final BillRepository repository;

    public BillServiceImpl(BillRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<Bill> findAll() {
        return repository.findAll();
    }

    @Override
    public Bill save(Bill bill) {
        return repository.save(bill);
    }

    @Override
    public Bill findById(Long id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public void delete(Long id) {
        repository.deleteById(id);
    }
}
