package com.sena.app.Service;

import com.sena.app.Entity.Bill;
import java.util.List;

public interface BillService {

    List<Bill> findAll();

    Bill save(Bill bill);

    Bill findById(Long id);

    void delete(Long id);
}
