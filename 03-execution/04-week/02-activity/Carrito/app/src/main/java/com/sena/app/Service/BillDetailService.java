package com.sena.app.Service;

import com.sena.app.Entity.BillDetail;
import java.util.List;

public interface BillDetailService {

    List<BillDetail> findAll();

    BillDetail save(BillDetail billDetail);

    BillDetail findById(Long id);

    void delete(Long id);
}