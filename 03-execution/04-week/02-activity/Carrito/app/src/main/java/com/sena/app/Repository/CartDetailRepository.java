package com.sena.app.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.sena.app.Entity.CartDetail;

public interface CartDetailRepository extends JpaRepository<CartDetail, Long> {

}