package com.sena.app.Service;

import com.sena.app.Entity.CartDetail;
import java.util.List;

public interface CartDetailService {

    List<CartDetail> findAll();

    CartDetail save(CartDetail cartDetail);

    CartDetail findById(Long id);

    void delete(Long id);
}