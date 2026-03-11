package com.sena.app.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.sena.app.Entity.BillDetail;

public interface BillDetailRepository extends JpaRepository<BillDetail, Long> {

}
